import java.util.Scanner;
import java.util.Locale;

public class Main {
	
	public static void main (String[]args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double delta = (Math.pow(b,2) - 4 * a * c);
		double x2 = (-b - Math.sqrt(delta)) / (2 * a);
		double x1 = (-b + Math.sqrt(delta)) / (2 * a);
		
		if( a <= 0 || b <= 0 || c <=00 || delta < 0) {
			System.out.println("Impossivel calcular");
		} else {
		
		System.out.printf("R1 = %.5f\n", x1);
		System.out.printf("R2 = %.5f\n", x2);
		}
	}
}
