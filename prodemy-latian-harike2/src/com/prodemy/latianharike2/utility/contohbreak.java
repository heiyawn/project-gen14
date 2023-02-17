package com.prodemy.latianharike2.utility;

import com.prodemy.latianharike2.model.barang;

public class contohbreak {

	public static void main(String[] args) {
		int[] daftarBilangan = new int[] {1,2,3,4};
		
		 barang[] daftarBarang = new barang[] {
				 new barang("Oreo", 5000, 20),
				 new barang("Pocky", 3000, 15),
				 new barang("Regal", 8000, 7)
				  };
		 
		 String yangDicari = "Pocky";
		 String ditemukan = " ";
		 boolean apakahDitemukan = false;
		 for (barang b : daftarBarang) {
			 barang b = daftarBarang[i];
			if (b.getNama().equals(yangDicari1)) {
				 ditemukan = (String) b.getNama();
				 break;
			 }
		 }
		 System.out.println("apakahDitemukan" + apakahDitemukan);
}
	
}
