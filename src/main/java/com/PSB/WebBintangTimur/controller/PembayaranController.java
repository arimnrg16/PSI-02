package com.PSB.WebBintangTimur.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.PSB.WebBintangTimur.model.Pembayaran;
import com.PSB.WebBintangTimur.sevice.PembayaranService;

@Controller
public class PembayaranController {
	
	private PembayaranService pembayaranService;
	
	@Autowired
	public void setPembayaranService(PembayaranService pembayaranService) {
		this.pembayaranService = pembayaranService;
	}
	
	@RequestMapping("/index")
	public String home() {
		
		return "index";
	}
	
	@RequestMapping("/pembayaran")
	public String PembayaranList(Model model) {
		model.addAttribute("pembayaran", pembayaranService.listPembayaran());
		return "/pembayaran";
	}
	
	@RequestMapping(value = "/pembayaran/create", method = RequestMethod.GET)
	public String tampilkan(Model model) {
		model.addAttribute("pembayaran", new Pembayaran());
		return "formPembayaran";
	}

	@RequestMapping(value = "/pembayaran/create", method = RequestMethod.POST)
	public String simpanDataPembayaran(Model model, Pembayaran pembayaran) {
		model.addAttribute("pembayaran", pembayaranService.saveOrUpdate(pembayaran));
		return "redirect:/pembayaran";
	}
	
	@RequestMapping(value = "/pembayaran/edit/{id}", method = RequestMethod.GET)
	public String editData(@PathVariable Integer id, Model model) {
		model.addAttribute("pembayaran", pembayaranService.getIdPembayaran(id));
		return "formPembayaran";
	}
	
	@RequestMapping(value = "/pembayaran/hapus/{id}")
	public String hapus(@PathVariable Integer id) {
		pembayaranService.hapus(id);
		return "redirect:/pembayaran";
	}
}
