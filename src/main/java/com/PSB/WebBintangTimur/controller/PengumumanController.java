package com.PSB.WebBintangTimur.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.PSB.WebBintangTimur.model.Pengumuman;
import com.PSB.WebBintangTimur.sevice.PengumumanService;


@Controller
public class PengumumanController {
	
	private PengumumanService pengumumanService;
	
	@Autowired
	public void setPengumumanService(PengumumanService pengumumanService) {
		this.pengumumanService = pengumumanService;
	}
	
	@RequestMapping("/pengumuman")
	public String PengumumanList(Model model) {
		model.addAttribute("pengumuman", pengumumanService.listPengumuman());
		return "/pengumuman";
	}
	
	@RequestMapping(value = "/pengumuman/create", method = RequestMethod.GET)
	public String tampilkan(Model model) {
		model.addAttribute("pengumuman", new Pengumuman());
		return "formPengumuman";
	}

	@RequestMapping(value = "/pengumuman/create", method = RequestMethod.POST)
	public String simpanDataPengumuman(Model model, Pengumuman pengumuman) {
		model.addAttribute("pengumuman", pengumumanService.saveOrUpdate(pengumuman));
		return "redirect:/pengumuman";
	}
	
	@RequestMapping(value = "/pengumuman/edit/{id}", method = RequestMethod.GET)
	public String editData(@PathVariable Integer id, Model model) {
		model.addAttribute("pengumuman", pengumumanService.getIdPengumuman(id));
		return "formPengumuman";
	}
	
	@RequestMapping(value = "/pengumuman/hapus/{id}")
	public String hapus(@PathVariable Integer id) {
		pengumumanService.hapus(id);
		return "redirect:/pengumuman";
	}
}