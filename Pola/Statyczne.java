package Pola;

public class Statyczne
{
	static int licznik = 0;
	
	void pokazLicznik()
	{
		System.out.println(licznik++);
	}
	
	public static void main(String[] args)
	{
		Statyczne obiekt1 = new Statyczne();
		Statyczne obiekt2 = new Statyczne();
		Statyczne obiekt3 = new Statyczne();
		obiekt1.pokazLicznik();
		obiekt2.pokazLicznik();
		obiekt3.pokazLicznik();
	

	}

}
