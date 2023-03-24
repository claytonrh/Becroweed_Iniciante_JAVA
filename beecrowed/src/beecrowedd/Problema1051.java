//está correto mas o site não aceita dessa forma

import java.util.Scanner;
import java.util.Locale;

public class Main {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);		
		Scanner input = new Scanner(System.in);
		
		double salario = input.nextDouble();
		double imposto = 0;
		
		double isento = 2000.00;
		double faixa1 = 2000.01;
		double faixa2 = 3000.01;
		double faixa3 = 4500.01;
		
		
		if(salario > faixa3) {
			imposto = ((salario - faixa3) / 100 * 28 ) + ((faixa3 - faixa2) / 100 * 18) + ((faixa2 - faixa1) / 100 * 8);		
		}else if (salario < faixa3){
			imposto = ((salario - faixa2) / 100 * 18) + ((faixa2 - faixa1) / 100 * 8);			
		}else if (salario < faixa2){
			imposto = ((salario - faixa1) / 100 * 8);			
		}
		if(salario <= isento) {
		     System.out.println("Isento");		
		}else{
		    System.out.printf("R$ %.2f\n", imposto);		
		} 
		
		input.close();
	}
}

