package com.prodemy.latian.hari3;

import com.prodemy.latian.hari3.model.Barang;

public class CaseHargaBarang {

	public static void main(String[] args) throws Exception {
	String[] namaBarang = new String[3];
	int[] hargaBarang = new int[3];
	int[] jumlahStok = new int[3];
	
	namaBarang[0] = "iPhone 11";
	hargaBarang[0] = 6259999;
	jumlahStok[0] = 14;
	
	namaBarang[1] = "iPhone 12";
	hargaBarang[1] = 8999888;
	jumlahStok[1] = 100;
	
	namaBarang[2] = "iPhone 13";
	hargaBarang[2] = 10000000;
	jumlahStok[2] = 9;
	
	for (int i=0; i < namaBarang.length; i++) {
		//System.out.println("Nama : "+namaBarang[i]+", harga : "+hargaBarang[i]+", stok ready : "+jumlahStok[i]);
	}
	
	Barang[] daftarBarang = new Barang[2];
	
	Barang b1 = new Barang("iPhone 11", 6259999, 14);
	Barang b2 = new Barang();
	b2.setNama("iPhone 12");
	
	b2.setHarga(8999888);
	
	b2.setPersediaan(100);
	
	daftarBarang[0] = b1;
	daftarBarang[1] = b2;
	for (int i=0; i < daftarBarang.length; i++) {
		//Barang b = daftarBarang[i];
		System.out.println(daftarBarang[i]);
	}

	}

}
