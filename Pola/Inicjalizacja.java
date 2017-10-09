package Pola;

class Inicjalizacja {

/*
 * Je�eli tutaj podam zmienn� i nie zadeklaruj� jej warto�ci to system
 * poda warto�� domy�ln�, a je�eli zrobimy to w metodzie main to wyst�pi b��d
 * i b�dzie trzeba w tej metodzie warto�� od razu zainicjalizowa�
 * 
 * Tutaj definiujemy zmienn� klasow� poza metod� main i mo�na nie inicjalizowa�,
 * czyli nie przypisywa� �adnej warto�ci 
 */
	static boolean x;
	/*
	 * Mo�na r�wnie� zadeklarowa� zmienn� w ten spos�b:
	 * 
	 * (KROK1)
	 * boolean x;
	 * 
	 * void pokazX()
	 * {
	 * System.out.println(x);
	 * {
	 * 
	 * PATRZ (KROK2):
	 */
	
	public static void main(String[] args) 
	{
		/*
		 * Tutaj je�eli chcemy zadeklarowa� zmienn� to trzeba zrobi�
		 * inicjalizacj�, czyli przypisa� konkretn� warto�ci pocz�tkow�
		 * W innym przypadku program wy�wietli b��d
		 */
		int y=2;
		
		System.out.println(x);
		System.out.println(y);
		
		/*
		 * (KROK2): Mo�na wy�wietli� "x" poprzez utworzenie obiektu
		 * Wtedy nie trzeba deklarowa� zmiennej jako statyczna
		 */

	}

}
