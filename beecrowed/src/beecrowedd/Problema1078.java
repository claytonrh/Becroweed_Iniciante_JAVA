import java.util.Scanner;

public class Main {
	
	public static void main (String[]args) {
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int tabuada = n;		
				
		for(int i = 1; i < 11; i++) {			
			System.out.println(i + " x " + n + " = " + tabuada * i);
		}	
		
		input.close();
	}
}
