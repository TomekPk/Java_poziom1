package MetodyiObiekty;

public class Przeciazanie 
{
	int x;
	int y;
	double a;
	double b;
	
	void mnozenie(int x, int y)
	{	
		this.x = x;
		this.y = y;
		System.out.println(x*y);
	}
	
	void mnozenie(double a, double b)
	{
		this.a = a;
		this.b = b;
		System.out.println(a*b);
	}
	
	public static void main(String[] args) 
	{
		Przeciazanie obiekt1 = new Przeciazanie();
		obiekt1.mnozenie(2, 4);
		obiekt1.mnozenie(2.4, 3.6);
	}

}
