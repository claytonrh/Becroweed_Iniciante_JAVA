import java.util.Scanner;
import java.util.Locale;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	public static void main(String[]args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();				
		
		Double[] valores = {a, b, c};		
		
		Arrays.sort(valores, Collections.reverseOrder());
		
		double A2 = valores [0] * valores [0];
		double B2 = valores [1] * valores [1];
		double C2 = valores [2] * valores [2];
		
		if( valores[0] >= valores[1] + valores[2]) {
			System.out.println("NAO FORMA TRIANGULO");
		} else {
		    
		    if ( A2 == B2 + C2) {
			    System.out.println("TRIANGULO RETANGULO");
    		}else if ( A2 > B2 + C2) {
    			System.out.println("TRIANGULO OBTUSANGULO");
    		}else if ( A2 < B2 + C2) { 
    			System.out.println("TRIANGULO ACUTANGULO");		
		    }
		
	    	if (A2 == B2 && C2 == B2) {
		    	System.out.println("TRIANGULO EQUILATERO");
		    }else if( A2 == B2 || B2 == C2 || A2 == C2 ) {
    		    System.out.println("TRIANGULO ISOSCELES");
		    }		
		}	
		input.close();	
	}
}
