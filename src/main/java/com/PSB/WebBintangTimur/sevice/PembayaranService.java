package com.PSB.WebBintangTimur.sevice;

import java.util.List;

import com.PSB.WebBintangTimur.model.Pembayaran;


public interface PembayaranService {

	List <Pembayaran> listPembayaran();
	Pembayaran saveOrUpdate(Pembayaran pembayaran);
	Pembayaran getIdPembayaran(Integer id);
	void hapus(Integer id);
}
