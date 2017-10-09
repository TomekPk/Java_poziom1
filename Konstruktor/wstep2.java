package Konstruktor;

class Prostokat{
	
	double a;
	double b;
	
	Prostokat(double a, double b){
		this.a = a;
		this.b = b;
	}
	
	void obliczPoleObwod(){
		System.out.println("Pole: "+a*b);
		System.out.println("Obwód: " +2*(a+b));
	}
	
}


public class wstep2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Prostokat p1 = new Prostokat(5,7);
		p1.obliczPoleObwod();
	}

}
