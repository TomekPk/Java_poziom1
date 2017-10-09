package Tablice;

public class Tablice {

	public static void main(String[] args) {

		int Tablica[][] = new int[1][2];
		
		Tablica[0][0] = 1;
		Tablica[0][1] = 2;
		
		
		System.out.println("Tablica pierwsza = " + Tablica[0][0] + "\nTablica druga = " + Tablica[0][1]+"\n");
		
		if(Tablica[0][0]<Tablica[0][1])
			System.out.println("Tablica pierwsza jest mniejsza od Tablicy drugiej");
		else if(Tablica[0][0]==Tablica[0][1])
			System.out.println("Tablica pierwsza jest równa Tablicy drugiej");
		else
			System.out.println("Tablica pierwsza jest wiêksza od Tablicy drugiej");
		
	}

}
