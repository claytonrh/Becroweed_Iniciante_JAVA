package beecrowedd;

import java.util.Locale;
import java.util.Scanner;

public class Problema1010 {	

	@SuppressWarnings("unused")
	public static void main(String[] args) {		
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
	
		int codigoPeca1 = input.nextInt();
		int qtdpeca1 = input.nextInt();
		double valorPeca1 = input.nextDouble();
		int codigoPeca2 = input.nextInt();
		int qtdpeca2 = input.nextInt();
		double valorPeca2 = input.nextDouble();
		
		double valorApagar = (valorPeca2 * qtdpeca2) + (valorPeca1 * qtdpeca1);

		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorApagar);
		
		input.close();
	}
}
