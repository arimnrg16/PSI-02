package com.PSB.WebBintangTimur.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.PSB.WebBintangTimur.model.Pendaftaran;
import com.PSB.WebBintangTimur.sevice.PendaftaranService;

@Service
public class PendaftaranDao implements PendaftaranService{

	
	private EntityManagerFactory emf;
	
	@Autowired
	public void setEmf(EntityManagerFactory emf) {
		this.emf = emf;
	}
	
	@Override
	public List<Pendaftaran> listPendaftaran() {

		EntityManager em = emf.createEntityManager();
		return em.createQuery("from Pendaftaran", Pendaftaran.class).getResultList();
	}

	@Override
	public Pendaftaran saveOrUpdate(Pendaftaran pendaftaran) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Pendaftaran saved = em.merge(pendaftaran);
		em.getTransaction().commit();
		return saved;
		
	}
	
	@Override
	public Pendaftaran getIdPendaftaran(Integer id) {
		EntityManager em = emf.createEntityManager();
		return em.find(Pendaftaran.class, id);
		
	}
	
	@Override
	public void hapus(Integer id) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.remove(em.find(Pendaftaran.class, id));
		em.getTransaction().commit();
	}
}
/*
	

	@Override
	public Pendaftaran getIdPendaftaran(Integer id) {
		EntityManager em = emf.createEntityManager();
		return em.find(Pendaftaran.class, id);
		
	}

	@Override
	public void hapus(Integer id) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.remove(em.find(Pendaftaran.class, id));
		em.getTransaction().commit();
	}
	
	
	
	
	

}

*/