package com.pertemuan3;

public class kenal_param {

	public static void HitungPersegiPanjang (int panjang, int lebar) {
		double hasil;
		hasil = panjang * lebar;
		System.out.println(hasil);
	}
	
	public static void main(String[] args) {
		System.out.print("Luas Persegi panjang adalah = ");
		HitungPersegiPanjang(4,8);
	}
}
