package beecrowedd;

import java.util.Locale;
import java.util.Scanner;

public class Problema1009 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		;
		Scanner input = new Scanner(System.in);

		@SuppressWarnings("unused")
		String vendedor = input.next();
		double salario = input.nextDouble();
		double vendas = input.nextDouble();

		double TOTAL = (vendas / 100 * 15) + salario;

		System.out.printf("TOTAL = R$ %.2f%n", TOTAL);

		input.close();
	}

}
