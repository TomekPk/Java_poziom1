package Metody;

class Figura
{
	int bokA;
	int bokB;
	
	// KONTRUKTOR
	Figura(int a, int b)
	{
		this.bokA = a;
		this.bokB = b;
	}
	
	//METODA
	void pokazWartosci()
	{
		System.out.println("bok a: "+bokA+"cm");
		System.out.println("bok b: "+bokB+"cm");
	}
}

class Trojkat extends Figura
{
	int bokC;
	
	// KONSTRUKTOR
	Trojkat(int a, int b, int c) // definiujê parametry nowego konstruktora
	{
		super(a,b); 	// podajê oryginalne parametry bez typu danych
		this.bokC = c; 	// dodajê pole c
	}
	
	// METODA
	void pokazWartosci()
	{
		super.pokazWartosci();	// wyswietli wartosci metody pokazWartosci() z klasy Figura
		System.out.println("bok c: "+bokC+"cm");
	}
}

public class SuperKonstruktor {

	public static void main(String[] args) {
		
		Trojkat t1 = new Trojkat(4,5,6);
		Trojkat t2 = new Trojkat(7,9,33);// tworzê nowy obiekt i podaje parametry
		System.out.println("Trójk¹t t1 ma boki: ");
		t1.pokazWartosci();	// wyswietla informacje o obiekcie t1, czyli parametry obiektu
		System.out.println("Trójk¹t t2 ma boki: ");
		t2.pokazWartosci();	// wyswietla informacje o obiekcie t2, czyli parametry obiektu

	}

}
