package Klasy;


class KursX
{
	// POLE
	String nazwa;
	
	
	// KONSTRUKTOR
	KursX(String nazwa) // nazwa musi by� taka sama jak klasy
	{
		this.nazwa = nazwa;
	
	}
	
	// METODA toString, w kt�rej przeci��amy
	public String toString() // bez void bo ma zwraca� (return) konkretn� warto�� typu String, int, itd.
	{
		return getClass().getName()+" "+nazwa;
				
	}
}

public class ObjectMetody {

	public static void main(String[] args) {

		KursX kurs1 = new KursX("Kurs Excel");
		System.out.println(kurs1.toString()); // wy�wietli metod� toString()
		KursX kurs2 = new KursX("Kurs Word");
		KursX kurs3 = new KursX("Kurs Word");
		
		// equals por�wnuje czy kurs1 jest r�wny obiektowi kurs2
		System.out.println(kurs1.equals(kurs2)); //FALSE
		
		// equals por�wnuje czy kurs2 jest r�wny obiektowi kurs3
		System.out.println(kurs2.equals(kurs3)); //FALSE
		/*
		 * Obiekt kurs2 i obiekt kurs3 pomimo �e maj� takie same warto�ci to nie s� r�wne
		 * gdy� maj� r�ne miejsca, pierwszy obiekt ma miejsce kurs2 a drugi kurs3,
		 * czyli te obiekty nigdy nie b�d� identyczne
		 */
		
		System.out.println(kurs2.equals(kurs2)); //TRUE
		
		
		
	}

}
