//site não aceita dessa forma

import java.util.Scanner;

public class Main {
	
	public static void main (String[]args) {
		
		Scanner input = new Scanner(System.in);
		
		int valor = input.nextInt();
		int a = 365;
		int b = 30;
		
		int ano = valor / a;
		valor = valor % a;	
		
		int mes = valor / b;
		valor = valor % b;
		    
		int dia = valor % b;
		
		System.out.printf(ano + " ano(s) \n");		
		System.out.printf(mes + " mes(es) \n");		
		System.out.printf(dia + " dia(s) \n");
		
		
		input.close();
	}
}
