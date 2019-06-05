package com.PSB.WebBintangTimur.sevice;

import java.util.List;

import com.PSB.WebBintangTimur.model.Pendaftaran;


public interface PendaftaranService {
	List <Pendaftaran> listPendaftaran();
	Pendaftaran saveOrUpdate(Pendaftaran pendaftaran);
	Pendaftaran getIdPendaftaran(Integer id);
	void hapus(Integer id);
}
	