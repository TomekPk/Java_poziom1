package Pola;

class Kursy
{
	private double cena1 = 42;	
	/*PRIVATE- prywatne pole do którego brak jest dostepu
	 *  z tego pola mo¿e korzystaæ tylko klasa Kursy i nie mo¿na go wywo³aæ
	 *  za pomoc¹ nowego obiektu 
	 */
	
	protected double cena2 = 44;
	/* PROTECTED- mo¿na te pole wywo³aæ za pomoc¹ obiektu
	 * z tego pola mo¿e korzystaæ klasa bazowa Kursy oraz klasy pochodne/podrzêdne
	 * w tym przypadku klasa Ksiazki
	 */
	
	/* UWAGA- Przekazanie wartoœci pola cena1 private do metody.
	 * Metoda pokazCene() nie jest private, czyli mo¿emy z niej korzystaæ
	 * wywo³uj¹c informacje z metody za pomoc¹ obiektu. Nast¹pi³o przekazanie wartoœci 
	 * pola do metody, która nie jest prywatna.
	 */
	
	/*--private--*/ void pokazCene()	// Metoda te¿ mo¿e byæ private
	{
		System.out.println(cena1);
	}
	
	/*--private void pokazCene()--*/
	/* z Metody private równie¿ mo¿emy korzystaæ tylko w obrêbie klasy,
	 *  w której zosta³a zadeklarowana, czyli w tym przypadku klasy Kursy
	 */
}

class Ksiazki extends Kursy
{
	
}

public class ModyfikatorDostepu {

	public static void main(String[] args) {
		
		Ksiazki obiekt1 = new Ksiazki();
		//System.out.println(obiekt1.cena1); -> wyœwietli b³¹d gdy¿ próbuje pobraæ private pole
		System.out.println(obiekt1.cena2);	// wyswietla protected cena2 
		
		obiekt1.pokazCene();	//wyswietla private cena1 dziêki przekazaniu danych przez metodê
		

	}

}
