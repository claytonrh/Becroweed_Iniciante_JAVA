package beecrowedd;

import java.util.Locale;
import java.util.Scanner;

public class Problema1007 {	
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);		
		
		int numeroFuncionario = input.nextInt();
		int horasTrabalhadas = input.nextInt();
		double salarioHora = input.nextDouble();		
		double salario  = horasTrabalhadas * salarioHora;
		
		System.out.println("NUMBER = " + numeroFuncionario);
		System.out.printf("SALARY = U$ %.2f%n", salario);
				
		input.close();
	}
}
