package PetlaFOR;

public class pelaFOREACH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []liczby = {
				100, 200, 300, 400, 500, 600	
			};

			/*	for (int a = 0; a < liczby.length; a++)
				System.out.println(liczby[a]);
			*/
		
		//PETLA FOR EACH sk³adnia:
		for(int a: liczby)
			System.out.println(a);
		// nie trzeba dodawaæ warunku oraz inkrementacji
		// do zmiennej a przypisujemy tablicê liczby
		
	}

}
