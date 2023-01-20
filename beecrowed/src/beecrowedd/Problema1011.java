package beecrowedd;

import java.util.Locale;
import java.util.Scanner;

public class Problema1011 {	

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		double a = input.nextDouble();		
		double b = input.nextDouble();		
		double c = input.nextDouble();
		
		double triangulo = a * c / 2;
		double circulo =  3.14159 * Math.pow(c, 2);
		double trapezio = 0.5 * c * (b + a);
		double quadrado = b * b;
		double retangulo = a * b;
				
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);
		
		input.close();
	}
}
