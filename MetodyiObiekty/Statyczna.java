package MetodyiObiekty;

class Obliczenia
{
	static int mnozenie(int a, int b) 	//metoda nic nie zwraca tylko pobiera parametry
	/*
	 *  Nie mo�na odwo�a� si� do pola za pomoc� metody statycznej
	 *  	int a; int b;
	 * 		static int mnozenie(int a, int b)
	 * 		{ this.a = a; this.b = b; }
	 *  Program zg�osi b��d	
	 */
	{
		return a * b;
	}
}

public class Statyczna 
{
	static int dzielenie(int c, int d)
	{
		return c/d;
	}

	public static void main(String[] args) 
	{
		
		System.out.println(Obliczenia.mnozenie(3, 3));
		System.out.println(dzielenie(12,3));
		/* Je�eli chce odwo�a� si� do metody bez tworzenia obiektu
		 * to musze utworzy� metod� statyczn�: static int mnozenie.
		 * Trzeba poda� r�wnie� pe�ny adres: Klasa.metoda(), czyli 
		 * w tym przypadku Obliczenia.mno�enie()
		 * 
		 * Je�eli umieszcz� ca�� metod� mno�enie w clasie Statyczna
		 * to nie musz� wtedy podawa� w funkcji System.out odniesienia
		 * do klasy i wystarczy jedynie do metody mnozenie()
		 */
		
		
	}

}
