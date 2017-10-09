package Klasy;

/* Klasa Object jest na szczycie hierarchii klas
 * Czyli ka�da klasa bazowa rozszerza klas� Object
 */

class Kurs extends Object
{
	/* Klasa Kursy rozszerza klas� Object, zatem mo�e r�wnie�
	 * korzyszta� z metod zawartych w klasie Object
	 */
	
	
}

public class ObjectKlasa {

	public static void main(String[] args) {

		Object obiekt1 = new Object();
		
		Object obiekt2 = new Kurs(); 	// RZUTOWANIE W G�R�
		
		/* Poni�ej korzystam z metody getClass klasy Object
		 * Po wpisaniu obiekt1. wy�wietl� si� dost�pne metody
		 * .getClass zwraca klas� do kt�rej zosta� przypisany obiekt 1
		 */
		System.out.println("Obiekt1 nale�y do klasy: "+obiekt1.getClass()); 
		
		// Sprawdzam do kt�rej klasy zosta� przypisany obiekt 2:
		System.out.println("Obiekt2 nale�y do klasy: "+obiekt2.getClass());
		
		
		
		
		
		

	}

}
