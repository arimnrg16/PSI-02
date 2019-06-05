package com.PSB.WebBintangTimur.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PSB.WebBintangTimur.model.Pengumuman;
import com.PSB.WebBintangTimur.sevice.PengumumanService;

@Service
public class PengumumanDao implements PengumumanService{

	
	private EntityManagerFactory emf;
	
	@Autowired
	public void setEmf(EntityManagerFactory emf) {
		this.emf = emf;
	}
	
	@Override
	public List<Pengumuman> listPengumuman() {

		EntityManager em = emf.createEntityManager();
		return em.createQuery("from Pengumuman", Pengumuman.class).getResultList();
	}

	@Override
	public Pengumuman saveOrUpdate(Pengumuman pengumuman) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Pengumuman saved = em.merge(pengumuman);
		em.getTransaction().commit();
		return saved;
		
	}
	
	@Override
	public Pengumuman getIdPengumuman(Integer id) {
		EntityManager em = emf.createEntityManager();
		return em.find(Pengumuman.class, id);
		
	}
	
	@Override
	public void hapus(Integer id) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.remove(em.find(Pengumuman.class, id));
		em.getTransaction().commit();
	}
}