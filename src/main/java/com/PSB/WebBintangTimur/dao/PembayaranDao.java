package com.PSB.WebBintangTimur.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PSB.WebBintangTimur.model.Pembayaran;
import com.PSB.WebBintangTimur.sevice.PembayaranService;

@Service
public class PembayaranDao implements PembayaranService{

	
	private EntityManagerFactory emf;
	
	@Autowired
	public void setEmf(EntityManagerFactory emf) {
		this.emf = emf;
	}
	
	@Override
	public List<Pembayaran> listPembayaran() {

		EntityManager em = emf.createEntityManager();
		return em.createQuery("from Pembayaran", Pembayaran.class).getResultList();
	}

	@Override
	public Pembayaran saveOrUpdate(Pembayaran pembayaran) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Pembayaran saved = em.merge(pembayaran);
		em.getTransaction().commit();
		return saved;
		
	}
	
	@Override
	public Pembayaran getIdPembayaran(Integer id) {
		EntityManager em = emf.createEntityManager();
		return em.find(Pembayaran.class, id);
		
	}
	
	@Override
	public void hapus(Integer id) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.remove(em.find(Pembayaran.class, id));
		em.getTransaction().commit();
	}
}