package Metody;



class Kursyy
{
	void nazwa()
	{
		System.out.println("Metoda klasy kursy");
	}
}

class Ksiazkii extends Kursyy
{
	void nazwa()
	{
		super.nazwa(); //odwo³uje siê do oryginalnej nadrzêdnej metody nazwa()
		System.out.println("Metoda klasy ksiazki");
	}
}


public class Superfunkcja {

	public static void main(String[] args) {
		
		Ksiazkii kurs1 = new Ksiazkii();
		kurs1.nazwa();

	}

}
