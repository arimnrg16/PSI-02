package com.PSB.WebBintangTimur.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class Pembayaran {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Integer id;
private String nama_pengirim;
private Integer uang_pembangunan;
private Integer uang_sekolah;
private Integer uang_osis_tahun;
private Integer uang_laboratorium;
private Integer uang_test_psikologi;
private Integer perlengkapan_siswa;




@Version
@Column(name = "optVersion", columnDefinition="integer DEFAULT 0")
private Integer version;



public String getNama_pengirim() {
	return nama_pengirim;
}
public void setNama_pengirim(String nama_pengirim) {
	this.nama_pengirim = nama_pengirim;
}
public Integer getVersion() {
	return version;
}
public void setVersion(Integer version) {
	this.version = version;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public Integer getUang_pembangunan() {
	return uang_pembangunan;
}
public void setUang_pembangunan(Integer uang_pembangunan) {
	this.uang_pembangunan = uang_pembangunan;
}
public Integer getUang_sekolah() {
	return uang_sekolah;
}
public void setUang_sekolah(Integer uang_sekolah) {
	this.uang_sekolah = uang_sekolah;
}
public Integer getUang_osis_tahun() {
	return uang_osis_tahun;
}
public void setUang_osis_tahun(Integer uang_osis_tahun) {
	this.uang_osis_tahun = uang_osis_tahun;
}
public Integer getUang_laboratorium() {
	return uang_laboratorium;
}
public void setUang_laboratorium(Integer uang_laboratorium) {
	this.uang_laboratorium = uang_laboratorium;
}
public Integer getUang_test_psikologi() {
	return uang_test_psikologi;
}
public void setUang_test_psikologi(Integer uang_test_psikologi) {
	this.uang_test_psikologi = uang_test_psikologi;
}
public Integer getPerlengkapan_siswa() {
	return perlengkapan_siswa;
}
public void setPerlengkapan_siswa(Integer perlengkapan_siswa) {
	this.perlengkapan_siswa = perlengkapan_siswa;
}


}
