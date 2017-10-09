package MetodyiObiekty;



	class Prostokat  //w tej klasie tworzymy metody zwracaj�ce warto�ci
{  
		
		// definiuje pola
		double a;  
		double b;
		
		//definiuje konstruktor
		
		Prostokat(double a, double b) // konstruktor musi miec taka sama nazwe jak klasa
		{	  
			this.a = a;
			this.b = b;
		}
		
		// tworze metod�, kt�ra zwr�ci pewn� warto��
		double pole()
		{
			return a*b;
		}
		double obwod()	
		{
			return 2*(a+b);
		}
	
}
	public class rozszerzenie 
{
		
	public static void main(String[] args) // ta metoda nie zwraca warto�ci
	{ 
		Prostokat p1 = new Prostokat(3,5);
		
		// wywoluj� obiekt p1 metod� .pole() oraz metod� .obw�d()
		System.out.println("Pole wynosi: "+p1.pole()+" Obw�d wynosi: "+p1.obwod()); 	

	}

	
}
