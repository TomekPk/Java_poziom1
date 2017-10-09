package Pola;

class Inicjalizacja {

/*
 * Je¿eli tutaj podam zmienn¹ i nie zadeklarujê jej wartoœci to system
 * poda wartoœæ domyœln¹, a je¿eli zrobimy to w metodzie main to wyst¹pi b³¹d
 * i bêdzie trzeba w tej metodzie wartoœæ od razu zainicjalizowaæ
 * 
 * Tutaj definiujemy zmienn¹ klasow¹ poza metod¹ main i mo¿na nie inicjalizowaæ,
 * czyli nie przypisywaæ ¿adnej wartoœci 
 */
	static boolean x;
	/*
	 * Mo¿na równie¿ zadeklarowaæ zmienn¹ w ten sposób:
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
		 * Tutaj je¿eli chcemy zadeklarowaæ zmienn¹ to trzeba zrobiæ
		 * inicjalizacjê, czyli przypisaæ konkretn¹ wartoœci pocz¹tkow¹
		 * W innym przypadku program wyœwietli b³¹d
		 */
		int y=2;
		
		System.out.println(x);
		System.out.println(y);
		
		/*
		 * (KROK2): Mo¿na wyœwietliæ "x" poprzez utworzenie obiektu
		 * Wtedy nie trzeba deklarowaæ zmiennej jako statyczna
		 */

	}

}
