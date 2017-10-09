package Pola;

class Kursy
{
	private double cena1 = 42;	
	/*PRIVATE- prywatne pole do kt�rego brak jest dostepu
	 *  z tego pola mo�e korzysta� tylko klasa Kursy i nie mo�na go wywo�a�
	 *  za pomoc� nowego obiektu 
	 */
	
	protected double cena2 = 44;
	/* PROTECTED- mo�na te pole wywo�a� za pomoc� obiektu
	 * z tego pola mo�e korzysta� klasa bazowa Kursy oraz klasy pochodne/podrz�dne
	 * w tym przypadku klasa Ksiazki
	 */
	
	/* UWAGA- Przekazanie warto�ci pola cena1 private do metody.
	 * Metoda pokazCene() nie jest private, czyli mo�emy z niej korzysta�
	 * wywo�uj�c informacje z metody za pomoc� obiektu. Nast�pi�o przekazanie warto�ci 
	 * pola do metody, kt�ra nie jest prywatna.
	 */
	
	/*--private--*/ void pokazCene()	// Metoda te� mo�e by� private
	{
		System.out.println(cena1);
	}
	
	/*--private void pokazCene()--*/
	/* z Metody private r�wnie� mo�emy korzysta� tylko w obr�bie klasy,
	 *  w kt�rej zosta�a zadeklarowana, czyli w tym przypadku klasy Kursy
	 */
}

class Ksiazki extends Kursy
{
	
}

public class ModyfikatorDostepu {

	public static void main(String[] args) {
		
		Ksiazki obiekt1 = new Ksiazki();
		//System.out.println(obiekt1.cena1); -> wy�wietli b��d gdy� pr�buje pobra� private pole
		System.out.println(obiekt1.cena2);	// wyswietla protected cena2 
		
		obiekt1.pokazCene();	//wyswietla private cena1 dzi�ki przekazaniu danych przez metod�
		

	}

}
