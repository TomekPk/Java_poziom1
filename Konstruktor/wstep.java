package Konstruktor;


class Kursy{
	
	String tytul;
	double cena;
	boolean dostepnosc;
	
	Kursy(String tytul, double cena, boolean dostepnosc){
		this.tytul = tytul;
		this.cena = cena;
		this.dostepnosc = dostepnosc;
	}
	void pokazInformacje(){
		System.out.println(tytul);
		System.out.println(cena+"z³");
		System.out.println(dostepnosc);
	}
}



public class wstep {

	public static void main(String[] args) {
		
		Kursy kurs1 = new Kursy("Kurs Excel", 42, true);
		kurs1.pokazInformacje();
		
		
	
	}
}