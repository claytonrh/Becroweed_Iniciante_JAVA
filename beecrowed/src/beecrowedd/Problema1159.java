import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);		
		
		int x;
		do{					
			int soma = 0;
			int pares = 0;	
			x = input.nextInt();	
			if(x !=0) {
			for(int i = x; pares < 5; i++) {					
				if(i % 2 == 0) {				
					soma += i;				
					pares += 1;
				}																
			}	
			System.out.println(soma);
			}	
		}while(x != 0);		
	
		input.close();
	}
}
