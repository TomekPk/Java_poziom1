package Klasy;

class Kursy
{
	String tytul;
	double cena;
	int rozdzialy;
	
	void pokazInformacje(String tytul, double cena, int rozdzialy)
	{
		this.tytul = tytul;
		this.cena = cena;
		this.rozdzialy = rozdzialy;
		System.out.println(tytul);
		System.out.println(cena);
		System.out.println(rozdzialy);
	}
	
}
class Ksiazki extends Kursy
{
	int strony;
}

public class Dziedziczenie {

	public static void main(String[] args) {
		
		Ksiazki kurs1 = new Ksiazki();
		kurs1.pokazInformacje("Kurs Excel", 32, 42);

	}

}
