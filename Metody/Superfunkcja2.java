package Metody;


class KursA
{
	String tytul = "Kurs Excel";
	int rozdzialy = 49;
	double cena = 44;
	
	void pokazInformacje()
	{
		System.out.println("Tytu�: "+tytul);
		System.out.println("Ilo�� rozdzia��w: "+rozdzialy);
		System.out.println("Cena: "+cena);
	}
}

class KsiazkaA extends KursA
{
	int strony = 300;
	
	void pokazInformacje()
	{
		super.pokazInformacje(); 	// pokazuje informacje z klasy KursA
		System.out.println("Ilosc stron: "+strony);
	}
}

public class Superfunkcja2 {

	public static void main(String[] args) {
		
		KsiazkaA kurs1 = new KsiazkaA();
		kurs1.pokazInformacje();

	}

}
