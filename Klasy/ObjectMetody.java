package Klasy;


class KursX
{
	// POLE
	String nazwa;
	
	
	// KONSTRUKTOR
	KursX(String nazwa) // nazwa musi byæ taka sama jak klasy
	{
		this.nazwa = nazwa;
	
	}
	
	// METODA toString, w której przeci¹¿amy
	public String toString() // bez void bo ma zwracaæ (return) konkretn¹ wartoœæ typu String, int, itd.
	{
		return getClass().getName()+" "+nazwa;
				
	}
}

public class ObjectMetody {

	public static void main(String[] args) {

		KursX kurs1 = new KursX("Kurs Excel");
		System.out.println(kurs1.toString()); // wyœwietli metodê toString()
		KursX kurs2 = new KursX("Kurs Word");
		KursX kurs3 = new KursX("Kurs Word");
		
		// equals porównuje czy kurs1 jest równy obiektowi kurs2
		System.out.println(kurs1.equals(kurs2)); //FALSE
		
		// equals porównuje czy kurs2 jest równy obiektowi kurs3
		System.out.println(kurs2.equals(kurs3)); //FALSE
		/*
		 * Obiekt kurs2 i obiekt kurs3 pomimo ¿e maj¹ takie same wartoœci to nie s¹ równe
		 * gdy¿ maj¹ ró¿ne miejsca, pierwszy obiekt ma miejsce kurs2 a drugi kurs3,
		 * czyli te obiekty nigdy nie bêd¹ identyczne
		 */
		
		System.out.println(kurs2.equals(kurs2)); //TRUE
		
		
		
	}

}
