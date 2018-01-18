package org.belajar.algoritma;

import java. util.Scanner;

public class Konf {
	public static void main(String[] args) {
		Scanner K = new Scanner(System.in);
		int hari;
		System.out.print("masukkan hari ke- : ");
		hari = K.nextInt();
		
		if (hari==1){
			System.out.print("Senin");
			}
		else if (hari==2){
			System.out.print("Selasa");
			}
		else if (hari==3){
			System.out.print("Rabu");
			}
		
		else{
			System.out.print("hari belum terdaftar");
}
	}
	
}
