package Klasy;

/* Klasa Object jest na szczycie hierarchii klas
 * Czyli ka¿da klasa bazowa rozszerza klasê Object
 */

class Kurs extends Object
{
	/* Klasa Kursy rozszerza klasê Object, zatem mo¿e równie¿
	 * korzysztaæ z metod zawartych w klasie Object
	 */
	
	
}

public class ObjectKlasa {

	public static void main(String[] args) {

		Object obiekt1 = new Object();
		
		Object obiekt2 = new Kurs(); 	// RZUTOWANIE W GÓRÊ
		
		/* Poni¿ej korzystam z metody getClass klasy Object
		 * Po wpisaniu obiekt1. wyœwietl¹ siê dostêpne metody
		 * .getClass zwraca klasê do której zosta³ przypisany obiekt 1
		 */
		System.out.println("Obiekt1 nale¿y do klasy: "+obiekt1.getClass()); 
		
		// Sprawdzam do której klasy zosta³ przypisany obiekt 2:
		System.out.println("Obiekt2 nale¿y do klasy: "+obiekt2.getClass());
		
		
		
		
		
		

	}

}
