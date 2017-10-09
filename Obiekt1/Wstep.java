package Obiekt1;


class Kursy {
	String tytul = "Kurs Excel";
	double cena;
	boolean dostepnosc;
	
}

public class Wstep {

	String nazwa = "Nowy obiekt";
	
	public static void main(String[] args) {

		Wstep obiekt1 = new Wstep();
		System.out.println(obiekt1.nazwa);
		Kursy kurs1 = new Kursy();
		System.out.println(kurs1.tytul);
	}

}


