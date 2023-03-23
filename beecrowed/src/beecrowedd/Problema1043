//está correto mas o site não aceita dessa forma

import java.util.Scanner;
import java.util.Locale;

public class Main {	
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner (System.in);
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		double somaValores = a + b + c;
		
		double area;
		double perimetro;
		
		if( somaValores % 2 != 0 ) {			
			System.out.printf("Perimetro = %.1f\n", somaValores);
		}else{
			area = (a+b)/2*c;
			System.out.printf("Area = %.1f\n", area);
		}
	}
}
