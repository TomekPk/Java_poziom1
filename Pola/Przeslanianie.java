package Pola;


	// KLASA BAZOWA
	class KlasaA
	{
		String nazwa = "To jest klasa A";
		int a = 10;
	}
	
	// KLASA POCHODNA
	class KlasaB extends KlasaA	
	{
		
		String nazwa = "To jest klasa B";
		double a = 300;
	}
	public class Przeslanianie {
	public static void main(String[] args) {
		
		// PRZES£ANIANIE 
		KlasaA obiekt1 = new KlasaB();	//1. KlasaA=>KlasaB
		System.out.println(obiekt1.a+" " +obiekt1.nazwa); 
		
		/* 1.Nastêpuje przes³oniêcie i wystwietlony zostaje a z KlasaA a nie z KlasaB
		 * UWAGA: przed obiekt1 jest KlasaA a dalej KlasaB
		 */

	}

}
