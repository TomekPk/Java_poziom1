package THIS;



class Kursy{
	
	String tytul;
	double cena;
	boolean dostepnosc;
	
	void pokazInformacje(String tytul, double cena, boolean dostepnosc){
		this.tytul = tytul;
		this.cena = cena;
		this.dostepnosc = dostepnosc;
//		System.out.println("Tytu³: "+tytul 
//				+" Cena: "+ cena + "z³" 
//				+" Dostêpnoœæ: "+ dostepnosc);
		
		if(dostepnosc==true)
			System.out.println("Tytu³: "+tytul 
					+" Cena: "+ cena + "z³" 
					+" Dostêpnoœæ: "+ "JEST w Magazynie");
			else
				System.out.println("Tytu³: "+tytul 
						+" Cena: "+ cena + "z³" 
						+" Dostêpnoœæ: "+ "BRAK w Magazynie");
		
	}

	}



public class wstep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Kursy kurs1 = new Kursy();
		Kursy kurs2 = new Kursy();
		Kursy kurs3 = new Kursy();
		

		kurs1.pokazInformacje("Kurs Excel", 44.08, true);
		kurs2.pokazInformacje("Kurs Excel2", 13.08, false);
		kurs3.pokazInformacje("Kurs Word", 55.08, true);
		
	
	}

}
