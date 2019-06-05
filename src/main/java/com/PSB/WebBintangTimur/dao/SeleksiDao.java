package com.PSB.WebBintangTimur.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PSB.WebBintangTimur.model.Seleksi;
import com.PSB.WebBintangTimur.sevice.SeleksiService;

@Service
public class SeleksiDao implements SeleksiService{

	
	private EntityManagerFactory emf;
	
	@Autowired
	public void setEmf(EntityManagerFactory emf) {
		this.emf = emf;
	}
	
	@Override
	public List<Seleksi> listSeleksi() {

		EntityManager em = emf.createEntityManager();
		return em.createQuery("from Seleksi", Seleksi.class).getResultList();
	}

	@Override
	public Seleksi saveOrUpdate(Seleksi seleksi) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Seleksi saved = em.merge(seleksi);
		em.getTransaction().commit();
		return saved;
		
	}
	
	@Override
	public Seleksi getIdSeleksi(Integer id) {
		EntityManager em = emf.createEntityManager();
		return em.find(Seleksi.class, id);
		
	}
	
	@Override
	public void hapus(Integer id) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.remove(em.find(Seleksi.class, id));
		em.getTransaction().commit();
	}
}