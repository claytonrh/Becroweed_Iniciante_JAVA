import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		int y = input.nextInt();			
		
		int valorini = 0;
		int valorfim = 0;
		
		if(x <= y) {
			valorini = x;
			valorfim = y;
		}else{
			valorini = y;
			valorfim = x;
		}
		
		for(int i = valorini+1; i < valorfim; i++) {			
			int valor = 0;
			if( i % 5 == 2 || i % 5 == 3) {
				System.out.println(i);
			}			
		}	
		
	}
}
