import java.util.Scanner;
import java.util.Locale;

public class Main {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
				
		double s = 0.0; 
		double numerador = 3;
		double denominador = 2;
		
		for(double i = 1.0; i <=39; i++) {
			if(s<1) {
			s = s + (1/i);
			}else if(s >= 1) {
				s += (numerador/denominador);
				numerador += 2;
				denominador += denominador;				
			}
		}
		
		System.out.printf("%.2f\n", s);
	}
}
