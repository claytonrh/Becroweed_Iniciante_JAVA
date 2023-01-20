package beecrowedd;

import java.util.Locale;
import java.util.Scanner;

public class Problema1012 {	

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		int raio = input.nextInt();
		
		double volume = (4.0/3) * 3.14159 * Math.pow(raio, 3.0);
		
	System.out.printf("VOLUME = %.3f\n", volume);
	
	input.close();
	}
}
