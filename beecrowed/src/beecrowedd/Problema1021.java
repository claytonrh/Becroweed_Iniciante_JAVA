//não está funcionando

import java.util.Scanner;

public class Main {
	
	public static void main (String[]args) { 
	
	Scanner input = new Scanner(System.in);
	
	float valor = input.nextFloat();
	int valor2 = (int)valor;
	double restoDeValor = valor % 1;	

	int notas [] = {100, 50, 20, 10, 5, 2};
	double moedas [] = {1, 0.50, 0.25, 0.10, 0.05, 0.01};
	
	System.out.println ( "NOTAS:" );
	
	for (int nota : notas) { 
		int qtd = valor2 / nota;
		valor2 = valor2 % nota;
			
		System.out.printf ( "%d nota(s) de R$ %.2f\n", qtd,  (double)nota);	
		}
	
	System.out.println ( "MOEDAS:" );	
	
	for (double moeda : moedas) { 
		double qtd2 = restoDeValor / moeda;
		restoDeValor = restoDeValor % moeda;				
			
		System.out.printf((int)qtd2 + " moeda(s) de R$ %.2f\n", moeda);
		}
	
	input.close();
	}
}
