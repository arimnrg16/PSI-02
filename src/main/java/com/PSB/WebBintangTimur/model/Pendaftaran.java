package com.PSB.WebBintangTimur.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class Pendaftaran {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name= "nama_siswa")
	private String nama_lengkap;
	private String jenis_kelamin;
	private Integer nik;
	private String tempat_lahir;
	private String tanggal_lahir;
	private String agama_dan_kepercayaan;
	private String kewarganegaraan;
	private String berkebutuhan_khusus_siswa;
	private String kecamatan;
	private String alamat_jalan;
	private Integer kode_pos;
	private String nomor_hp;
	private String alamat_sekolah;
	private String nama_sekolah;
	
	private String nama_ayah;
	private Integer nik_ayah;
	private Integer tahun_lahir_ayah;
	private String pendidikan_ayah;
	private String pekerjaan_ayah;
	private Integer penghasilan_bulanan_ayah;
	private String berkebutuhan_khusus_ayah;
	
	private String nama_ibu;
	private Integer nik_ibu;
	private Integer tahun_lahir_ibu;
	private String pendidikan_ibu;
	private String pekerjaan_ibu;
	private Integer penghasilan_bulanan_ibu;
	private String berkebutuhan_khusus_ibu;
	
	private String nama_wali;
	private Integer nik_wali;
	private Integer tahun_lahir_wali;
	private String pendidikan_wali;
	private String pekerjaan_wali;
	private Integer penghasilan_bulanan_wali;

	@Version
	@Column(name = "optVersion", columnDefinition="integer DEFAULT 0")
	private Integer version;
	
	
	
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
	public String getNama_lengkap() {
		return nama_lengkap;
	}
	public void setNama_lengkap(String nama_lengkap) {
		this.nama_lengkap = nama_lengkap;
	}
	public String getJenis_kelamin() {
		return jenis_kelamin;
	}
	public void setJenis_kelamin(String jenis_kelamin) {
		this.jenis_kelamin = jenis_kelamin;
	}
	public Integer getNik() {
		return nik;
	}
	public void setNik(Integer nik) {
		this.nik = nik;
	}
	public String getTempat_lahir() {
		return tempat_lahir;
	}
	public void setTempat_lahir(String tempat_lahir) {
		this.tempat_lahir = tempat_lahir;
	}
	public String getTanggal_lahir() {
		return tanggal_lahir;
	}
	public void setTanggal_lahir(String tanggal_lahir) {
		this.tanggal_lahir = tanggal_lahir;
	}
	public String getAgama_dan_kepercayaan() {
		return agama_dan_kepercayaan;
	}
	public void setAgama_dan_kepercayaan(String agama_dan_kepercayaan) {
		this.agama_dan_kepercayaan = agama_dan_kepercayaan;
	}
	public String getAlamat_jalan() {
		return alamat_jalan;
	}
	public void setAlamat_jalan(String alamat_jalan) {
		this.alamat_jalan = alamat_jalan;
	}
	public Integer getKode_pos() {
		return kode_pos;
	}
	public void setKode_pos(Integer kode_pos) {
		this.kode_pos = kode_pos;
	}
	public String getNomor_hp() {
		return nomor_hp;
	}
	public void setNomor_hp(String nomor_hp) {
		this.nomor_hp = nomor_hp;
	}
	public String getAlamat_sekolah() {
		return alamat_sekolah;
	}
	public void setAlamat_sekolah(String alamat_sekolah) {
		this.alamat_sekolah = alamat_sekolah;
	}
	public String getNama_sekolah() {
		return nama_sekolah;
	}
	public void setNama_sekolah(String nama_sekolah) {
		this.nama_sekolah = nama_sekolah;
	}
	public String getNama_ayah() {
		return nama_ayah;
	}
	public void setNama_ayah(String nama_ayah) {
		this.nama_ayah = nama_ayah;
	}
	public Integer getNik_ayah() {
		return nik_ayah;
	}
	public void setNik_ayah(Integer nik_ayah) {
		this.nik_ayah = nik_ayah;
	}
	public Integer getTahun_lahir_ayah() {
		return tahun_lahir_ayah;
	}
	public void setTahun_lahir_ayah(Integer tahun_lahir_ayah) {
		this.tahun_lahir_ayah = tahun_lahir_ayah;
	}
	public String getPendidikan_ayah() {
		return pendidikan_ayah;
	}
	public void setPendidikan_ayah(String pendidikan_ayah) {
		this.pendidikan_ayah = pendidikan_ayah;
	}
	public String getPekerjaan_ayah() {
		return pekerjaan_ayah;
	}
	public void setPekerjaan_ayah(String pekerjaan_ayah) {
		this.pekerjaan_ayah = pekerjaan_ayah;
	}
	public Integer getPenghasilan_bulanan_ayah() {
		return penghasilan_bulanan_ayah;
	}
	public void setPenghasilan_bulanan_ayah(Integer penghasilan_bulanan_ayah) {
		this.penghasilan_bulanan_ayah = penghasilan_bulanan_ayah;
	}
	public String getBerkebutuhan_khusus_ayah() {
		return berkebutuhan_khusus_ayah;
	}
	public void setBerkebutuhan_khusus_ayah(String berkebutuhan_khusus_ayah) {
		this.berkebutuhan_khusus_ayah = berkebutuhan_khusus_ayah;
	}
	public String getNama_ibu() {
		return nama_ibu;
	}
	public void setNama_ibu(String nama_ibu) {
		this.nama_ibu = nama_ibu;
	}
	public Integer getNik_ibu() {
		return nik_ibu;
	}
	public void setNik_ibu(Integer nik_ibu) {
		this.nik_ibu = nik_ibu;
	}
	public Integer getTahun_lahir_ibu() {
		return tahun_lahir_ibu;
	}
	public void setTahun_lahir_ibu(Integer tahun_lahir_ibu) {
		this.tahun_lahir_ibu = tahun_lahir_ibu;
	}
	public String getPendidikan_ibu() {
		return pendidikan_ibu;
	}
	public void setPendidikan_ibu(String pendidikan_ibu) {
		this.pendidikan_ibu = pendidikan_ibu;
	}
	public String getPekerjaan_ibu() {
		return pekerjaan_ibu;
	}
	public void setPekerjaan_ibu(String pekerjaan_ibu) {
		this.pekerjaan_ibu = pekerjaan_ibu;
	}
	public Integer getPenghasilan_bulanan_ibu() {
		return penghasilan_bulanan_ibu;
	}
	public void setPenghasilan_bulanan_ibu(Integer penghasilan_bulanan_ibu) {
		this.penghasilan_bulanan_ibu = penghasilan_bulanan_ibu;
	}
	public String getBerkebutuhan_khusus_ibu() {
		return berkebutuhan_khusus_ibu;
	}
	public void setBerkebutuhan_khusus_ibu(String berkebutuhan_khusus_ibu) {
		this.berkebutuhan_khusus_ibu = berkebutuhan_khusus_ibu;
	}
	public String getNama_wali() {
		return nama_wali;
	}
	public void setNama_wali(String nama_wali) {
		this.nama_wali = nama_wali;
	}
	public Integer getNik_wali() {
		return nik_wali;
	}
	public void setNik_wali(Integer nik_wali) {
		this.nik_wali = nik_wali;
	}
	public Integer getTahun_lahir_wali() {
		return tahun_lahir_wali;
	}
	public void setTahun_lahir_wali(Integer tahun_lahir_wali) {
		this.tahun_lahir_wali = tahun_lahir_wali;
	}
	public String getPendidikan_wali() {
		return pendidikan_wali;
	}
	public void setPendidikan_wali(String pendidikan_wali) {
		this.pendidikan_wali = pendidikan_wali;
	}
	public String getPekerjaan_wali() {
		return pekerjaan_wali;
	}
	public void setPekerjaan_wali(String pekerjaan_wali) {
		this.pekerjaan_wali = pekerjaan_wali;
	}
	public Integer getPenghasilan_bulanan_wali() {
		return penghasilan_bulanan_wali;
	}
	public void setPenghasilan_bulanan_wali(Integer penghasilan_bulanan_wali) {
		this.penghasilan_bulanan_wali = penghasilan_bulanan_wali;
	}
	public String getKewarganegaraan() {
		return kewarganegaraan;
	}
	public void setKewarganegaraan(String kewarganegaraan) {
		this.kewarganegaraan = kewarganegaraan;
	}
	public String getBerkebutuhan_khusus_siswa() {
		return berkebutuhan_khusus_siswa;
	}
	public void setBerkebutuhan_khusus_siswa(String berkebutuhan_khusus_siswa) {
		this.berkebutuhan_khusus_siswa = berkebutuhan_khusus_siswa;
	}
	public String getKecamatan() {
		return kecamatan;
	}
	public void setKecamatan(String kecamatan) {
		this.kecamatan = kecamatan;
	}
	

	
	

	
}
