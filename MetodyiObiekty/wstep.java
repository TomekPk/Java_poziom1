package MetodyiObiekty;



class Kursy {
	String tytul = "Kurs Excel";
	double cena = 2.25;
	boolean dostepnosc = false;


void pokazInformacje(){
	System.out.println("Tytu³: "+tytul);
	System.out.println("Cena: "+cena+"z³");
	if(dostepnosc==true)
	System.out.println("Dostêpny");
	else
		System.out.println("Niedostepny");
}
}
	
public class wstep {

	public static void main(String[] args) {
		
		Kursy kurs1 = new Kursy();
		kurs1.pokazInformacje();

	}

}
