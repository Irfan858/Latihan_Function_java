package com.pertemuan3;

public class kenal_function {

	public static void SapaAku()
	{
		System.out.println("Halo, Irfan");
	}
	
	public static void SapaPakeNama()
	{
		String nama = "Alice";
		System.out.println("Selamat datang " + nama);
	}
	
	public static void OperasiSegitiga()
	{
		int alas = 10;
		int tinggi = 5;
		int hasil;
		
		hasil = (alas*tinggi)/2;
		System.out.println(hasil);
	}
	
	public static void main(String[] args) {
		SapaAku();
		SapaPakeNama();
		
		System.out.print("Hasil Operasi Segitiga Adalah =  ");
		OperasiSegitiga();
	}

}
