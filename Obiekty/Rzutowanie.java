package Obiekty;


// KLASA BAZOWA
class Kursy
{
	
	
}

// KLASA POCHODNA KLASY KURSY
class Biurowe extends Kursy
{
	
	
}

// KLASA POCHODNA KLASY BIUROWE (3 rz�dy: Kursy -> Biurowe -> KursExcel)
class KursExcel extends Biurowe
{
	
	
}

// KLASA POCHODNA KLASY KURSY
class Internet extends Kursy
{
	
	
}

// INNA KLASA BAZOWA
class Ksiazki
{
	
	
}

public class Rzutowanie {

	public static void main(String[] args) {
		
		Kursy kurs1 = new Kursy();
		Biurowe kurs2 = new Biurowe();
		Kursy kurs3 = new Biurowe();	// RZUTOWANIE W G�R�- czytaj od prawej do lewej
										// refernecje z ni�szej klasy Biurowe przypisujemy 
										// do referencji z wy�szej klasy Kursy
		Kursy kurs4 = new Internet();	// RZUTOWANIE W G�R� 
				
		/* Biurowe kurs5= new Internet(); 
		 * Nie mo�na u�y� takiego zapisu, gdy� obie klasy znajduj� si� na tym samym
		 * poziomie w hierarchii, RZUTOWA� mo�na jedynie z klasy ni�szej, czytaj�c
		 * od ty�u do klasy wy�szej, tutaj akurat klasy Kursy. To samo dotyczy zapisu odwrotnego:
		 * Internet kurs5= new Biurowe();
		 * 
		 * Wyj�tek: 
		 *Biurowe kurs2 = new Biurowe();
		 */
		
		/* Kursy kurs6 = new Ksiazki();
		 * Ten sapis jest niepoprawny, gdy� s� to dwie r�ne niezale�ne
		 * od siebie klasy. Klasa Ksi��ki nie rozszerza (extends) klasy Kursy
		 */
		
		Biurowe kurs7 = new KursExcel(); // POPRAWNE RZUTOWANIE
		
		/* KursExcel kurs8= new Biurowe();
		 * Niepoprawne gdy� czytaj�c od ty�u tworz� referencj� z klasy wy�szej 
		 * do klasy ni�szej, a mo�na jedynie odwrotnie, czyli z ni�szej do wy�szej
		 */

	}

}
