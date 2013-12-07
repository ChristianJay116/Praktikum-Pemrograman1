//javac -d bin -cp bin src/04inheritance/Harimau.java
//Perintah Inheritance
//Kelas Turunannya

//package Sesi06.Praktium01.bin;

class Harimau extends KucingBesar
{
	//Kustruktor untuk class Harimau
	public Harimau(String namaHarimau)
	{
	//Mengisi pengubah yang diwarisi oleh kelas abstract
	Harimau.nama = namaHarimau;
	}
	//Implementasi metode yang diwarisi dari kelas abstract
	public void Makan()
	{
	System.out.println("Harimau Makan daging dan Minum Susu");
	System.out.println();
	}
}