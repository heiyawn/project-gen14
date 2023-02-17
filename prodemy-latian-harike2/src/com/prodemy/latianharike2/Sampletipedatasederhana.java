/**
 * 
 */
package com.prodemy.latianharike2;

/**
 * @author HANA
 *
 */
public class Sampletipedatasederhana {

	public static void main(String[] args) {
		int x1=1;
		x1=2;
		do {
			if (x1%2!=0){
				System.out.println(x1);
			}
			x1=x1+1;
		} while(x1<=10);
		
		boolean b1=false;
		if (b1) {
			System.out.println("b1 bernilai benar");
		} else {
			System.out.println("b1 bernilai salah");
		}
	}
}
