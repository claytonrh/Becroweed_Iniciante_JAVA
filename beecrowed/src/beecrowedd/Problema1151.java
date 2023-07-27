import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int valor = input.nextInt();
		
		int x1 = 0;
		int x2 = 1;	
		int n = 1;	
		for(int i = 0; i < valor; i++) {
			if( n < valor ) {
			System.out.print(x1 + " ");	
			}else if(n == valor) {
				System.out.println(x1);	
			}
			x2 = x2 + x1;			
			x1 = x2 - x1;		
			n++;
		}
	}
}
