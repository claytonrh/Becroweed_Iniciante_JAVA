//está funcionando mas o site está dando erro

import java.util.Scanner;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);		
				
		int a = input.nextInt();
		int n = input.nextInt();		
		
		while(n <= 0) {
			n = input.nextInt();
		}
		int valor = 0;
		for(int i = 0; i <= n-1; i++) {			
			valor += a;
			a++;
		}		
		System.out.println(valor);
	}
}

