//Perintah Inheritance
//Kelas Turunannya

//package Sesi06.Praktium01.bin;

class Singa extends KucingBesar
{
	//Kustruktor untuk class Singa
	public Singa(String namaSinga)
	{
	//Mengisi pengubah yang diwarisi oleh kelas abstract
	Singa.nama = namaSinga;
	}
	//Implementasi metode yang diwarisi dari kelas abstract
	public void Makan()
	{
	System.out.println("Singa Makan daging");
	System.out.println();
	}
}