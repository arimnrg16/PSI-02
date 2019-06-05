package com.PSB.WebBintangTimur.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class Pengumuman {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	

	private String judul;
	private String dibuat_oleh;
	private String tanggal;
	private String isi;
	
	@Version
	@Column(name = "optVersion", columnDefinition="integer DEFAULT 0")
	private Integer version;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getJudul() {
		return judul;
	}

	public void setJudul(String judul) {
		this.judul = judul;
	}

	public String getDibuat_oleh() {
		return dibuat_oleh;
	}

	public void setDibuat_oleh(String dibuat_oleh) {
		this.dibuat_oleh = dibuat_oleh;
	}

	public String getTanggal() {
		return tanggal;
	}

	public void setTanggal(String tanggal) {
		this.tanggal = tanggal;
	}

	public String getIsi() {
		return isi;
	}

	public void setIsi(String isi) {
		this.isi = isi;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
	
	

}
