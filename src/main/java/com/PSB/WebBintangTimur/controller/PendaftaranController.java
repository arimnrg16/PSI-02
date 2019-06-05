

package com.PSB.WebBintangTimur.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.PSB.WebBintangTimur.model.Pendaftaran;
import com.PSB.WebBintangTimur.sevice.PendaftaranService;

@Controller
public class PendaftaranController {
	
	private PendaftaranService pendaftaranService;
	
	@Autowired
	public void setPendaftaranService(PendaftaranService pendaftaranService) {
		this.pendaftaranService = pendaftaranService;
	}
	
	@RequestMapping("/pendaftaran")
	public String PendaftaranList(Model model) {
		model.addAttribute("pendaftaran", pendaftaranService.listPendaftaran());
		return "/pendaftaran";
	}
	
	@RequestMapping(value = "/pendaftaran/create", method = RequestMethod.GET)
	public String tampilkan(Model model) {
		model.addAttribute("pendaftaran", new Pendaftaran());
		return "formPendaftaran";
	}

	
	@RequestMapping(value = "/pendaftaran/create", method = RequestMethod.POST)
	public String simpanDataPendaftaran(Model model, Pendaftaran pendaftaran) {
		model.addAttribute("pendaftaran", pendaftaranService.saveOrUpdate(pendaftaran));
		return "redirect:/pendaftaran";
	}
	
	@RequestMapping(value = "/pendaftaran/edit/{id}", method = RequestMethod.GET)
	public String editData(@PathVariable Integer id, Model model) {
		model.addAttribute("pendaftaran", pendaftaranService.getIdPendaftaran(id));
		return "formPendaftaran";
	}
	
	@RequestMapping(value = "/pendaftaran/hapus/{id}")
	public String hapus(@PathVariable Integer id) {
		pendaftaranService.hapus(id);
		return "redirect:/pendaftaran";
	}
}

/*
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.PSB.WebBintangTimur.model.Pendaftaran;
import com.PSB.WebBintangTimur.sevice.PendaftaranService;

@Controller
public class PendaftaranController {

	
	
	@RequestMapping(value="/pendaftaran/create", method  = RequestMethod.POST)
	public String simpanDataPendaftaran(Model model, Pendaftaran pendaftaran) {
		model.addAttribute("pendaftaran", pendaftaranService.saveOrUpdate(pendaftaran));
		return "redirect:/pendaftaran";
	}
	
	@RequestMapping(value = "/pendaftaran/edit/{id}", method = RequestMethod.GET)
	public String editData(@PathVariable Integer id, Model model) {
		model.addAttribute("pendaftaran", pendaftaranService.getIdPendaftaran(id));
		return "formPendaftaran";
	}
	
	@RequestMapping(value = "/pendaftaran/hapus/{id}")
	public String hapus(@PathVariable Integer id) {
		pendaftaranService.hapus(id);
		return "redirect:/pendaftaran";
	}
	
	
}
*/