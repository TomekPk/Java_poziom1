package Obiekty;


// KLASA BAZOWA
class Kursy
{
	
	
}

// KLASA POCHODNA KLASY KURSY
class Biurowe extends Kursy
{
	
	
}

// KLASA POCHODNA KLASY BIUROWE (3 rzêdy: Kursy -> Biurowe -> KursExcel)
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
		Kursy kurs3 = new Biurowe();	// RZUTOWANIE W GÓRÊ- czytaj od prawej do lewej
										// refernecje z ni¿szej klasy Biurowe przypisujemy 
										// do referencji z wy¿szej klasy Kursy
		Kursy kurs4 = new Internet();	// RZUTOWANIE W GÓRÊ 
				
		/* Biurowe kurs5= new Internet(); 
		 * Nie mo¿na u¿yæ takiego zapisu, gdy¿ obie klasy znajduj¹ siê na tym samym
		 * poziomie w hierarchii, RZUTOWAÆ mo¿na jedynie z klasy ni¿szej, czytaj¹c
		 * od ty³u do klasy wy¿szej, tutaj akurat klasy Kursy. To samo dotyczy zapisu odwrotnego:
		 * Internet kurs5= new Biurowe();
		 * 
		 * Wyj¹tek: 
		 *Biurowe kurs2 = new Biurowe();
		 */
		
		/* Kursy kurs6 = new Ksiazki();
		 * Ten sapis jest niepoprawny, gdy¿ s¹ to dwie ró¿ne niezale¿ne
		 * od siebie klasy. Klasa Ksi¹¿ki nie rozszerza (extends) klasy Kursy
		 */
		
		Biurowe kurs7 = new KursExcel(); // POPRAWNE RZUTOWANIE
		
		/* KursExcel kurs8= new Biurowe();
		 * Niepoprawne gdy¿ czytaj¹c od ty³u tworzê referencjê z klasy wy¿szej 
		 * do klasy ni¿szej, a mo¿na jedynie odwrotnie, czyli z ni¿szej do wy¿szej
		 */

	}

}
