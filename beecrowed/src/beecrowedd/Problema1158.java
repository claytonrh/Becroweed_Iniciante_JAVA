//está funcionando mas o site está dando erro

import java.util.*;

public class Main {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);		
		
		int n = input.nextInt();
		input.nextLine(); 
		
		int valor = 0;
		do{				
			int soma = 0;
			int impares = 0;
		
			String[] valores = input.nextLine().replaceAll(" ", " ").split(" ");
			
			int	x = Integer.parseInt(valores[0]);
			int	y = Integer.parseInt(valores[1]);
		
			for(int i = x; impares < y; i++) {		   
				if(i % 2 != 0) {				
					soma += i;				
					impares += 1;
				}									
			}
		
			System.out.println(soma);				
			valor += 1;
		}while(valor < n);
	
		input.close();
	}
}
