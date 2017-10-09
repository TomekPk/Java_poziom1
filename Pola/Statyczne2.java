package Pola;

public class Statyczne2
{
	static int licznik = 0;
	
	static int pokazLicznik()
	{
		licznik++;
		return licznik;
	}
	
	public static void main(String[] args)
	{
		System.out.println(pokazLicznik());
		System.out.println(pokazLicznik());
		System.out.println(pokazLicznik());
		
	

	}

}
