package beecrowedd;

import java.util.Locale;
import java.util.Scanner;

public class Problema1005 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

		double A = entrada.nextDouble();
		double B = entrada.nextDouble();
		double C = entrada.nextDouble();

		A = A / 10 * 2;
		B = B / 10 * 3;
		C = C / 10 * 5;

		double MEDIA = A + B + C;
		System.out.printf("MEDIA = %.1f%n", MEDIA);
	}

}
