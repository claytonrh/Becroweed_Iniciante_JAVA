//está correto mas o site não aceita dessa forma

import java.util.*;

public class Main {
	
	public static void main (String[]args) {
		
		Scanner input = new Scanner(System.in);
		List<Integer> numeros1 = new ArrayList<Integer>();	
		List<Integer> numeros2 = new ArrayList<Integer>();	
		
		int valor = 1;		
		for(int i = 0; valor > 0; i++) {
		String[] valores = input.nextLine().replaceAll(" ", " ").split(" ");		
		int m = Integer.parseInt(valores[0]);
		int n = Integer.parseInt(valores[1]);
		if(m != 0 && n != 0) {
			if(m < n || m == n) {
				numeros1.add(m);
				numeros2.add(n);
			}else if(m > n) {
				numeros1.add(n);
				numeros2.add(m);
			} 		
		}
		if(m == 0 || n == 0) {
				valor = 0;
			break;	
			}		    
		}
		
		for(int i = 0; i < numeros1.size(); i ++) {	
		int valor1 = numeros1.get(i);
		int valor2 = numeros2.get(i);
		int soma = 0;
			for(int v = valor1; v <= valor2; v++) {								
				soma = soma + v;
				System.out.print(v + " ");				
			}			
			System.out.println("Sum=" + soma);				
		} 	
		
	input.close();
	}
}
