package MetodyiObiekty;

class Obliczenia
{
	static int mnozenie(int a, int b) 	//metoda nic nie zwraca tylko pobiera parametry
	/*
	 *  Nie mo¿na odwo³aæ siê do pola za pomoc¹ metody statycznej
	 *  	int a; int b;
	 * 		static int mnozenie(int a, int b)
	 * 		{ this.a = a; this.b = b; }
	 *  Program zg³osi b³¹d	
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
		/* Je¿eli chce odwo³aæ siê do metody bez tworzenia obiektu
		 * to musze utworzyæ metodê statyczn¹: static int mnozenie.
		 * Trzeba podaæ równie¿ pe³ny adres: Klasa.metoda(), czyli 
		 * w tym przypadku Obliczenia.mno¿enie()
		 * 
		 * Je¿eli umieszczê ca³¹ metodê mno¿enie w clasie Statyczna
		 * to nie muszê wtedy podawaæ w funkcji System.out odniesienia
		 * do klasy i wystarczy jedynie do metody mnozenie()
		 */
		
		
	}

}
