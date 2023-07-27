//está funcionando mas o site está dando erro

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int testes = 0;
		
		do{
		int soma = 0;
		int valor = input.nextInt();	
		for(int i = 1; i < valor; i++) {
			if(valor % i == 0){
				soma += i;				
			}
		} 	
		if(soma == valor) {
				System.out.println(soma + " eh perfeito");
			}else{
				System.out.println(soma + " nao eh perfeito");
			}
		testes += 1;
		}while(testes < n);
		
		input.close();
	}
}
