package Metody;



class Kursy
{
	static void nazwa()
	{
		System.out.println("Metoda klasy kursy");
	}
}

class Ksiazki extends Kursy
{
	static void nazwa()
	{
		System.out.println("Metoda klasy ksiazki");
	}
}


public class Przeciazanie {

	public static void main(String[] args) {
		
		Ksiazki.nazwa();

	}

}
