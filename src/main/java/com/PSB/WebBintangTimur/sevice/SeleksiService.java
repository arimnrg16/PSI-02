package com.PSB.WebBintangTimur.sevice;

import java.util.List;

import com.PSB.WebBintangTimur.model.Seleksi;

public interface SeleksiService {
	List <Seleksi> listSeleksi();
	Seleksi saveOrUpdate(Seleksi seleksi);
	Seleksi getIdSeleksi(Integer id);
	void hapus(Integer id);
}

