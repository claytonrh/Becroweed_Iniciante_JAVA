import java.util.Scanner;
import java.util.Locale;

public class Main {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
				
		double s = 0.0; 
		
		for(double i = 1.0; i <=100; i++) {
			s += (1/i);
		}
		
		System.out.printf("%.2f\n", s);
	}
}

