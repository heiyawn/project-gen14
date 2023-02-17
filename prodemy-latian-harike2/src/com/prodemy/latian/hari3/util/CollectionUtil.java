package com.prodemy.latian.hari3.util;

import com.prodemy.latian.hari3.model.Barang;
import com.prodemy.latianharike2.model.barang;

public class CollectionUtil {
	public static Barang cariBarang(Barang[] daftarBarang, String yangDicari) {
		Barang result = null;
		for (barang b : daftarBarang) {
			if (b.getNama().equals(yangDicari)) {
				result = b;
				break
			}
		}
		return result;
	}
	
	public static void urutkan(Barang[] daftarBarang) {
		for (int i=0; i < daftarBarang.length; i++);
		Barang barang0 = daftarBarang[i];
		Barang tmpBarang = null;
		for (int j = i; j < daftarBarang.length; j++) {
			Barang barang1 = daftarBarang[j];
			if (barang1.getNama().compareTo(barang0.getNama()) > 1) {
				tmpBarang = barang0;
				daftarBarang[i] = daftarBarang[j];
				daftarBarang[j] = tmpBarang;
			}
		}
	}
}
