//Perintah Inheritance
//Class turunannya

public class TesKucingBesar
{
	public static void main (String[] Xx)
	{
		Singa mySinga = new Singa ("SIMBA SURAI");
		System.out.println ("Singa Merupakan"+Singa.nama);
		mySinga.Makan();
		
		Harimau myHarimau = new Harimau("Harimau Sumatera");
		System.out.println("Harimau Merupakan " +Harimau.nama);
		myHarimau.Makan();
	}
}