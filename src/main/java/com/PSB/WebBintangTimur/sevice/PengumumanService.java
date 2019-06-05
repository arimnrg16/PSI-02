package com.PSB.WebBintangTimur.sevice;

import java.util.List;

import com.PSB.WebBintangTimur.model.Pengumuman;

public interface PengumumanService {
	List <Pengumuman> listPengumuman();
	Pengumuman saveOrUpdate(Pengumuman pengumuman);
	Pengumuman getIdPengumuman(Integer id);
	void hapus(Integer id);
}
