/**
 * 
 */
package com.prodemy.latianharike2;

import java.util.Arrays;

import com.prodemy.latianharike2.model.barang;

/**
 * @author HANA
 *
 */
public class hargabarang {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	String[] namaBarang = new String[3];
	int[] hargaBarang = new int[3];
	int[] jumlahStok = new int[3];
	
	namaBarang[0] = "Oreo";
	hargaBarang[0] = 5000;
	jumlahStok[0] = 15;
			
	namaBarang[1] = "Permen";
	hargaBarang[1] = 1000;
	jumlahStok[1] = 4;
	
	namaBarang[2] = "Lampu";
	hargaBarang[2] = 10000;
	jumlahStok[2] = 12;
	
	
	for (int i=0; i < namaBarang.length;i++) {
		System.out.println("Nama Barang : " + namaBarang[i] + ", harga : " + hargaBarang[i] + ", stok : " + jumlahStok[i]);
	}
	
	barang[] daftarBarang = new barang[1];
	
	barang b1 = new barang();
	b1.nama = "Oreo";
	b1.harga = 5000;
	b1.persediaan = 15;
	
	daftarBarang[0] = b1;
	
	for (int i=0; i < daftarBarang.length;i++) {
		System.out.println("Nama : " + daftarBarang[i].nama + ", harga : " + daftarBarang[i].harga + ", stok : " + daftarBarang[i].persediaan);
	}
	}
}


