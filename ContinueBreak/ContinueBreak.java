package ContinueBreak;

public class ContinueBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// BREAK //
		for (int x = 0; x <=10; x++){
			System.out.println("Wynik BREAK: "+x);
			if(x == 5)
				break;
			
		}
		
		System.out.println("\n");
		
		// CONTINUE //
		for (int x = 0; x <=10; x++){
			if(x == 5 || x == 7 )
				continue;			// program pomin¹³ wartoœæ x =5 i x=7
			System.out.println("Wynik CONTINUE: "+x); 
		}
		
	}

}
