package com.PSB.WebBintangTimur.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.PSB.WebBintangTimur.model.Seleksi;
import com.PSB.WebBintangTimur.sevice.SeleksiService;

@Controller
public class SeleksiController{
	
	private SeleksiService seleksiService;
	
	@Autowired
	public void setSeleksiService(SeleksiService seleksiService) {
		this.seleksiService = seleksiService;
	}
	
	@RequestMapping("/seleksi")
	public String SeleksiList(Model model) {
		model.addAttribute("seleksi", seleksiService.listSeleksi());
		return "/seleksi";
	}
	
	@RequestMapping(value = "/seleksi/create", method = RequestMethod.GET)
	public String tampilkan(Model model) {
		model.addAttribute("seleksi", new Seleksi());
		return "formSeleksi";
	}

	@RequestMapping(value = "/seleksi/create", method = RequestMethod.POST)
	public String simpanDataSeleksi(Model model, Seleksi seleksi) {
		model.addAttribute("seleksi", seleksiService.saveOrUpdate(seleksi));
		return "redirect:/seleksi";
	}
	
	@RequestMapping(value = "/seleksi/edit/{id}", method = RequestMethod.GET)
	public String editData(@PathVariable Integer id, Model model) {
		model.addAttribute("seleksi", seleksiService.getIdSeleksi(id));
		return "formSeleksi";
	}
	
	@RequestMapping(value = "/seleksi/hapus/{id}")
	public String hapus(@PathVariable Integer id) {
		seleksiService.hapus(id);
		return "redirect:/seleksi";
	}
}
