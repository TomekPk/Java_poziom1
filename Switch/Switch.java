package Switch;

public class Switch {

	public static void main(String[] args) {

		/*
		 *  Program sprawdza czy kupi�e� wi�cej los�w ni� bonus i je�eli TAK to wy�wietla informacj�
		 *  �e otrzymasz
		 *  
		 */	
		 
		
		int ilosclosow = 4; 		//podaj ilosc los�w
		int bonus = 2; 				//podaj wartosc powyzej ktorej b�d� naliczane bonusy 
		double cenalosu = 5.00;		//podaj cene losu
		double rabat = 0.95;
		
		switch(ilosclosow){
		case 1: System.out.println("Kupi�e� "+ilosclosow+" losy za "+(ilosclosow*cenalosu)+"z�");
			if (bonus<ilosclosow) {
				System.out.println("dostajesz BONUS za kupienie wi�cej ni� " +bonus+" los�w");
				System.out.println("Cena z rabatem= "+(cenalosu*ilosclosow*rabat));	}break;
		case 2: System.out.println("Kupi�e� "+ilosclosow+" losy za "+(ilosclosow*cenalosu)+"z�");
			if (bonus<ilosclosow) {
				System.out.println("dostajesz BONUS za kupienie wi�cej ni� " +bonus+" los�w");
				System.out.println("Cena z rabatem= "+(cenalosu*ilosclosow*rabat));	}break;
		case 3: System.out.println("Kupi�e� "+ilosclosow+" losy za "+(ilosclosow*cenalosu)+"z�");
			if (bonus<ilosclosow) {
				System.out.println("dostajesz BONUS za kupienie wi�cej ni� " +bonus+" los�w");
				System.out.println("Cena z rabatem= "+(cenalosu*ilosclosow*rabat));	}break;
		case 4: System.out.println("Kupi�e� "+ilosclosow+" losy za "+(ilosclosow*cenalosu)+"z�");
			if (bonus<ilosclosow) {
				System.out.println("dostajesz BONUS za kupienie wi�cej ni� " +bonus+" los�w");
				System.out.println("Cena z rabatem= "+(cenalosu*ilosclosow*rabat));	}break;
		
		}

	}

}
