/*
SQLyog Ultimate v8.6 Beta2
MySQL - 5.5.5-10.1.24-MariaDB : Database - db_pendaftaran
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`db_pendaftaran` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `db_pendaftaran`;

/*Table structure for table `calon_siswa` */

DROP TABLE IF EXISTS `calon_siswa`;

CREATE TABLE `calon_siswa` (
  `id_pendaftaran` int(31) NOT NULL,
  `id_pembayaran` int(31) DEFAULT NULL,
  `jenis_gelombang` varchar(31) DEFAULT NULL,
  `info_pendaftaran` varchar(1000) DEFAULT NULL,
  `tanggal_pendaftaran` date DEFAULT NULL,
  `nik_calon_siswa` int(31) DEFAULT NULL,
  PRIMARY KEY (`id_pendaftaran`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `calon_siswa` */

/*Table structure for table `hibernate_sequence` */

DROP TABLE IF EXISTS `hibernate_sequence`;

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `hibernate_sequence` */

insert  into `hibernate_sequence`(`next_val`) values (42),(42),(42),(42),(42),(42),(42);

/*Table structure for table `mengelola` */

DROP TABLE IF EXISTS `mengelola`;

CREATE TABLE `mengelola` (
  `id_pendaftaran` int(11) NOT NULL,
  `email` varchar(31) NOT NULL,
  PRIMARY KEY (`id_pendaftaran`,`email`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `mengelola` */

/*Table structure for table `mengikuti` */

DROP TABLE IF EXISTS `mengikuti`;

CREATE TABLE `mengikuti` (
  `id_pendaftaran` int(11) NOT NULL,
  `id_peserta_seleksi` int(11) NOT NULL,
  PRIMARY KEY (`id_pendaftaran`,`id_peserta_seleksi`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `mengikuti` */

/*Table structure for table `pembayaran` */

DROP TABLE IF EXISTS `pembayaran`;

CREATE TABLE `pembayaran` (
  `id` int(11) NOT NULL,
  `nama_pengirim` varchar(51) DEFAULT NULL,
  `perlengkapan_siswa` int(11) DEFAULT NULL,
  `uang_laboratorium` int(11) DEFAULT NULL,
  `uang_osis_tahun` int(11) DEFAULT NULL,
  `uang_pembangunan` int(11) DEFAULT NULL,
  `uang_sekolah` int(11) DEFAULT NULL,
  `uang_test_psikologi` int(11) DEFAULT NULL,
  `opt_version` int(11) DEFAULT '0',
  `uang_pendafatran_gelombangii` int(11) DEFAULT NULL,
  `id_pembayaran_calon_siswa` int(11) DEFAULT NULL,
  `bukti_pembayaran` varchar(31) DEFAULT NULL,
  `status_pembayaran` varchar(31) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `pembayaran` */

insert  into `pembayaran`(`id`,`nama_pengirim`,`perlengkapan_siswa`,`uang_laboratorium`,`uang_osis_tahun`,`uang_pembangunan`,`uang_sekolah`,`uang_test_psikologi`,`opt_version`,`uang_pendafatran_gelombangii`,`id_pembayaran_calon_siswa`,`bukti_pembayaran`,`status_pembayaran`) values (25,'Ari Manurung',430000,75000,100000,1000000,240000,100000,0,NULL,NULL,NULL,NULL),(26,'Panji Situmorang',430000,75000,100000,1000000,240000,100000,0,NULL,NULL,NULL,NULL),(27,'Ratna Kasmala',430000,75000,100000,1000000,240000,100000,0,NULL,NULL,NULL,NULL),(28,'Diana Pebrianty',430000,75000,100000,1000000,240000,100000,0,NULL,NULL,NULL,NULL);

/*Table structure for table `pendaftaran` */

DROP TABLE IF EXISTS `pendaftaran`;

CREATE TABLE `pendaftaran` (
  `id` int(11) NOT NULL,
  `agama_dan_kepercayaan` varchar(20) DEFAULT NULL,
  `alamat_jalan` varchar(31) DEFAULT NULL,
  `alamat_sekolah` varchar(31) DEFAULT NULL,
  `berkebutuhan_khusus_ayah` varchar(31) DEFAULT NULL,
  `berkebutuhan_khusus_ibu` varchar(31) DEFAULT NULL,
  `jenis_kelamin` varchar(31) DEFAULT NULL,
  `kode_pos` int(11) DEFAULT NULL,
  `nama_ayah` varchar(31) DEFAULT NULL,
  `nama_ibu` varchar(31) DEFAULT NULL,
  `nama_siswa` varchar(31) DEFAULT NULL,
  `nama_sekolah` varchar(31) DEFAULT NULL,
  `nama_wali` varchar(31) DEFAULT NULL,
  `nik` int(16) DEFAULT NULL,
  `nik_ayah` int(16) DEFAULT NULL,
  `nik_ibu` int(16) DEFAULT NULL,
  `nik_wali` int(16) DEFAULT NULL,
  `nomor_hp` longtext,
  `pekerjaan_ayah` varchar(20) DEFAULT NULL,
  `pekerjaan_ibu` varchar(20) DEFAULT NULL,
  `pekerjaan_wali` varchar(20) DEFAULT NULL,
  `pendidikan_ayah` varchar(20) DEFAULT NULL,
  `pendidikan_ibu` varchar(20) DEFAULT NULL,
  `pendidikan_wali` varchar(20) DEFAULT NULL,
  `penghasilan_bulanan_ayah` int(11) DEFAULT NULL,
  `penghasilan_bulanan_ibu` int(11) DEFAULT NULL,
  `penghasilan_bulanan_wali` int(11) DEFAULT NULL,
  `tahun_lahir_ayah` int(4) DEFAULT NULL,
  `tahun_lahir_ibu` int(4) DEFAULT NULL,
  `tahun_lahir_wali` int(4) DEFAULT NULL,
  `tanggal_lahir` timestamp NULL DEFAULT NULL,
  `tempat_lahir` varchar(31) DEFAULT NULL,
  `opt_version` int(11) DEFAULT '0',
  `berkebutuhan_khusus_siswa` varchar(31) DEFAULT NULL,
  `kecamatan` varchar(31) DEFAULT NULL,
  `kewarganegaraan` varchar(31) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `pendaftaran` */

insert  into `pendaftaran`(`id`,`agama_dan_kepercayaan`,`alamat_jalan`,`alamat_sekolah`,`berkebutuhan_khusus_ayah`,`berkebutuhan_khusus_ibu`,`jenis_kelamin`,`kode_pos`,`nama_ayah`,`nama_ibu`,`nama_siswa`,`nama_sekolah`,`nama_wali`,`nik`,`nik_ayah`,`nik_ibu`,`nik_wali`,`nomor_hp`,`pekerjaan_ayah`,`pekerjaan_ibu`,`pekerjaan_wali`,`pendidikan_ayah`,`pendidikan_ibu`,`pendidikan_wali`,`penghasilan_bulanan_ayah`,`penghasilan_bulanan_ibu`,`penghasilan_bulanan_wali`,`tahun_lahir_ayah`,`tahun_lahir_ibu`,`tahun_lahir_wali`,`tanggal_lahir`,`tempat_lahir`,`opt_version`,`berkebutuhan_khusus_siswa`,`kecamatan`,`kewarganegaraan`) values (1,NULL,'JlSitoluama','Sitoluama','Tidak','',NULL,22381,'Pak Mario','Bu Dwide','Ari Whuandaniel Manurung','SMAN1SiantarNarumonda','',12344,11123,NULL,NULL,'082277165413','Dosen','','','Sarjana','','',10000,NULL,NULL,1998,NULL,NULL,'0000-00-00 00:00:00','Sitoluama',1,NULL,NULL,NULL),(3,'kriten_protestan','Jln Nauli','Sigumpar','no','no','laki-laki',22382,'Dahlan Situmorang','suriani marpaung','Panji J Situmorang','Smp N 1 Sigumpar','',11123,NULL,NULL,NULL,'0812315689','petani','petani','','sma','sma','',NULL,NULL,NULL,9061937,9071973,NULL,'0000-00-00 00:00:00','Baribatali',0,NULL,NULL,NULL);

/*Table structure for table `pengumuman` */

DROP TABLE IF EXISTS `pengumuman`;

CREATE TABLE `pengumuman` (
  `id` int(11) NOT NULL,
  `dibuat_oleh` varchar(31) DEFAULT NULL,
  `isi` longtext,
  `judul` varchar(31) DEFAULT NULL,
  `tanggal` timestamp NULL DEFAULT NULL,
  `opt_version` int(11) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `pengumuman` */

insert  into `pengumuman`(`id`,`dibuat_oleh`,`isi`,`judul`,`tanggal`,`opt_version`) values (15,'Pak Mario','Bilangan floating-point yang “unpacked”. Tidak dapat bersifat unsigned. Memiliki sifat mirit dengan CHAR. Kata “unpacked\'\' berarti bilangan disimpan sebagai string, menggunakan satu karakter untuk setiap digitnya. Jangkauan nilai dari DECIMAL sama dengan DOUBLE, tetapi juga tergantung dai nilai atribut M dan D yang disertakan. Jika D tidak diisi akan dianggap 0. Jika M tidak diisi maka akan dianggap 10. Sejak MySQL 3.22 nilai M harus termasuk ruang yang ditempati oleh angka di belakang koma dan tanda + atau -.','Hasil Seleksi SMA BTB','2019-06-27 00:00:00',2),(17,'Ari','Berikut ini akan diberikan tipe-tipe data yang didukung oleh MySQL yang terambil dari dokumentasi MySQL. Tipe - tipe data ini diberikan dalam bentuk yang siap dituliskan pada sintaks-sintaks MySQL, misalnya Create Table. Pada tipe-tipe data tersebut terdapat beberapa atribut yang memiliki arti sebagai berikut','Pengumuman Hasil PSB','0000-00-00 00:00:00',1),(29,'Ari Whuandaniel Manurung','•	Menghasilkan Sumber Daya Manusia yang Berkualitas •	Kompleks Sekolah yang Luas/Nyaman •	Perpustakaan yang Lengkap dan Berstandar Digital •	Alam yang hijau menghadap ke danau Toba •	Fasilitas Wifi dan Internet cepat •	Tersedia asrama putra dan asrama putri •	Beragam Kegiatan Osis •	Program privat untuk menempuh kepribadiabn siswa •	Kerja sama baik dengan ptn/pts','Mengapa Memilih Kami!!','0000-00-00 00:00:00',0),(30,'Pak Panji','•	Juara 2 karate tahun 2014 •	Juara 1 olimpiade astronomi se-kabupaten 2016 •	Juara 1 tenis meja O2SN kabupaten 2016 •	Juara 8 olimpiade komputer se-kabupaten 2017 •	Juara 1 Olimpiade kompurter se kabupaten 2018 •	OSN tingkat provinsi','Prestasi yang diraih','0000-00-00 00:00:00',0),(31,'Ratna','Berikut ini akan diberikan tipe-tipe data yangdidukung oleh MySQL yang terambil dari dokumentasi MySQL. Tipe - tipe data ini diberikan dalam bentuk yang siap dituliskan pada sintaks-sintaks MySQL, misalnya Create Table. Pada tipe-tipe data tersebut terdapat beberapa atribut yang memiliki arti sebagai berikut','Pengumuman Hasil Seleksi','2019-02-02 00:00:00',0),(39,'Ari Whuandaniel Manurung','Berikut ini akan diberikan tipe-tipe data yang didukung oleh MySQL yang terambil dari dokumentasi MySQL. Tipe - tipe data ini diberikan dalam bentuk yang siap dituliskan pada sintaks-sintaks MySQL, misalnya Create Table. Pada tipe-tipe data tersebut terdapat beberapa atribut yang memiliki arti sebagai berikut','Pengumuman Hasil Seleksi','2019-02-02 00:00:00',0);

/*Table structure for table `role` */

DROP TABLE IF EXISTS `role`;

CREATE TABLE `role` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `role` */

insert  into `role`(`id`,`name`) values (19,'ROLE_USER'),(36,'ROLE_USER'),(41,'ROLE_USER');

/*Table structure for table `seleksi` */

DROP TABLE IF EXISTS `seleksi`;

CREATE TABLE `seleksi` (
  `id` int(11) NOT NULL,
  `nama` varchar(31) DEFAULT NULL,
  `nilai` int(11) DEFAULT NULL,
  `status` varchar(31) DEFAULT NULL,
  `tanggal` date DEFAULT NULL,
  `opt_version` int(11) DEFAULT '0',
  `email` varchar(31) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `seleksi` */

insert  into `seleksi`(`id`,`nama`,`nilai`,`status`,`tanggal`,`opt_version`,`email`) values (10,'Ari Manurung',90,'lulus','2019-06-03',3,NULL),(11,'Diana',54,'Tidak Lulus','2019-06-03',2,NULL),(12,'Panji J',98,'lulus','2019-06-03',2,NULL),(13,'Ratna Kasma',24,'Tidak Lulus','2019-06-03',2,NULL),(34,'Whuandaniel',100,'lulus','2019-06-03',1,NULL);

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` bigint(20) NOT NULL,
  `email` varchar(31) DEFAULT NULL,
  `first_name` varchar(31) DEFAULT NULL,
  `last_name` varchar(31) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `username` varchar(31) DEFAULT NULL,
  `role` varchar(31) DEFAULT NULL,
  `id_pembayaran` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UKob8kqyqqgmefl0aco34akdtpe` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `user` */

insert  into `user`(`id`,`email`,`first_name`,`last_name`,`password`,`username`,`role`,`id_pembayaran`) values (18,'arimnrg16@gmail.com','Ari Whuandaniel','Manurung','$2a$10$iHNXAucuzm9U.84HlnHfHuzJO9.12nuVyrZr9k2spChBatXTXpKCG',NULL,NULL,NULL),(35,'ratnayun@gmail.com','Ratna Kasmala','Hutapea','$2a$10$e573uZExB4PYT/SSI1o.wuxS6i0mQkgn3NlDBwloGCGdjvg8W42Nu',NULL,NULL,NULL),(40,'panitia@gmail.com','Panitia','psb','$2a$10$pbg94p3EVHHJh7LEclxCXeTnZhgGBCf.5gj7.DCQQyzx1UnhQbOxS',NULL,NULL,NULL);

/*Table structure for table `users_roles` */

DROP TABLE IF EXISTS `users_roles`;

CREATE TABLE `users_roles` (
  `user_id` bigint(20) NOT NULL,
  `role_id` bigint(20) NOT NULL,
  KEY `FKt4v0rrweyk393bdgt107vdx0x` (`role_id`),
  KEY `FKgd3iendaoyh04b95ykqise6qh` (`user_id`),
  CONSTRAINT `FKgd3iendaoyh04b95ykqise6qh` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`),
  CONSTRAINT `FKt4v0rrweyk393bdgt107vdx0x` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `users_roles` */

insert  into `users_roles`(`user_id`,`role_id`) values (18,19),(35,36),(40,41);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
