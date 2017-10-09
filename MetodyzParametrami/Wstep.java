package MetodyzParametrami;

class Kursy{
	
	String tytul;
	double cena = 2.25;
	boolean dostepnosc = false;
	
	void pokazTytul(String tytulKursu){
		tytul =tytulKursu;
		System.out.println(tytul);
	}
	
	void pokazCene(double cenaKursu){
		cena = cenaKursu;
		System.out.println(cena+"z³");
	
		
	}

	}



public class Wstep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Kursy kurs1 = new Kursy();
		Kursy kurs2 = new Kursy();
		Kursy kurs3 = new Kursy();
		
		kurs1.pokazTytul("Kurs Excel");
		kurs1.pokazCene(25.00);
		kurs2.pokazTytul("Kurs Word");
		kurs2.pokazCene(24.00);
		kurs3.pokazTytul("Kurs Access"); 
		kurs3.pokazCene(23.44);
	}

}
