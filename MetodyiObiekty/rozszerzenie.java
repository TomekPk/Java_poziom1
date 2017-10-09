package MetodyiObiekty;



	class Prostokat  //w tej klasie tworzymy metody zwracaj¹ce wartoœci
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
		
		// tworze metodê, która zwróci pewn¹ wartoœæ
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
		
	public static void main(String[] args) // ta metoda nie zwraca wartoœci
	{ 
		Prostokat p1 = new Prostokat(3,5);
		
		// wywolujê obiekt p1 metod¹ .pole() oraz metod¹ .obwód()
		System.out.println("Pole wynosi: "+p1.pole()+" Obwód wynosi: "+p1.obwod()); 	

	}

	
}
