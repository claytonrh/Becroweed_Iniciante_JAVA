import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int valor = input.nextInt();
		int fatorial = valor;
		
		for(int i = 1; i < valor-1; i++) {			
			fatorial *= (valor-i);
		}
		System.out.println(fatorial);
		
		input.close();
	}
}
