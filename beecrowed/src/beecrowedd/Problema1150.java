import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		int y = input.nextInt();
		int soma = x;
		
		if(y <= x) {
			while(y <= x) {
			y = input.nextInt();
			}
		}

		int valor = 1;		
		for(int i = x; soma <= y; i++) {	
			soma += i;			
		valor++;
		}
		
		System.out.println(valor);
		
		input.close();
	}
}
