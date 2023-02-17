/**
 * 
 */
package com.prodemy.latianharike2;

import java.util.Arrays;

/**
 * @author HANA
 *
 */
public class Samplearray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arrayGanjil = new int[5];
		
		arrayGanjil[0] = 1;
		arrayGanjil[1] = 3;
		arrayGanjil[2] = 5;
		arrayGanjil[3] = 7;
		arrayGanjil[4] = 9;
		
		System.out.println(Arrays.toString(arrayGanjil));
		
		for (int i = 0; i < arrayGanjil.length; i++) {
			System.out.print(arrayGanjil[i] + " ");
		}
		
		String[] arrayString = new String[3]; 
				
		arrayString[0] = "hello";
		arrayString[1] = "world";
		//arrayString[2] = "yoo";
		
		for (int i = 0; i < arrayString.length; i++) {
			System.out.print(arrayString[i] +" ");
		}
	}
}


