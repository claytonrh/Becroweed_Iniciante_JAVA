package beecrowedd;

import java.util.Locale;
import java.util.Scanner;

public class Problema1006 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

		double A = entrada.nextDouble();
		double B = entrada.nextDouble();

		A = A / 11 * 3.5;
		B = B / 11 * 7.5;

		double MEDIA = A + B;
		System.out.printf("MEDIA = %.5f%n", MEDIA);
	}

}
