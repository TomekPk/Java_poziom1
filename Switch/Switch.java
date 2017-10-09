package Switch;

public class Switch {

	public static void main(String[] args) {

		/*
		 *  Program sprawdza czy kupi³eœ wiêcej losów ni¿ bonus i je¿eli TAK to wyœwietla informacjê
		 *  ¿e otrzymasz
		 *  
		 */	
		 
		
		int ilosclosow = 4; 		//podaj ilosc losów
		int bonus = 2; 				//podaj wartosc powyzej ktorej bêd¹ naliczane bonusy 
		double cenalosu = 5.00;		//podaj cene losu
		double rabat = 0.95;
		
		switch(ilosclosow){
		case 1: System.out.println("Kupi³eœ "+ilosclosow+" losy za "+(ilosclosow*cenalosu)+"z³");
			if (bonus<ilosclosow) {
				System.out.println("dostajesz BONUS za kupienie wiêcej ni¿ " +bonus+" losów");
				System.out.println("Cena z rabatem= "+(cenalosu*ilosclosow*rabat));	}break;
		case 2: System.out.println("Kupi³eœ "+ilosclosow+" losy za "+(ilosclosow*cenalosu)+"z³");
			if (bonus<ilosclosow) {
				System.out.println("dostajesz BONUS za kupienie wiêcej ni¿ " +bonus+" losów");
				System.out.println("Cena z rabatem= "+(cenalosu*ilosclosow*rabat));	}break;
		case 3: System.out.println("Kupi³eœ "+ilosclosow+" losy za "+(ilosclosow*cenalosu)+"z³");
			if (bonus<ilosclosow) {
				System.out.println("dostajesz BONUS za kupienie wiêcej ni¿ " +bonus+" losów");
				System.out.println("Cena z rabatem= "+(cenalosu*ilosclosow*rabat));	}break;
		case 4: System.out.println("Kupi³eœ "+ilosclosow+" losy za "+(ilosclosow*cenalosu)+"z³");
			if (bonus<ilosclosow) {
				System.out.println("dostajesz BONUS za kupienie wiêcej ni¿ " +bonus+" losów");
				System.out.println("Cena z rabatem= "+(cenalosu*ilosclosow*rabat));	}break;
		
		}

	}

}
