//não está funcionando

import java.util.Locale;

public class Main {
	
	public static void main(String[] args) {
		
	double i = 0;		
	double j = 1;
	
	System.out.println("I=" + (int)i + " " + "J=1");		
	System.out.println("I=" + (int)i + " " + "J=2");		
	System.out.println("I=" + (int)i + " " + "J=3");			
	
	for(double n = 0; i < 0.8; n++) {		
	i = i + 0.2;
	j = j + 0.2;
		for(int v = 0; v < 3; v++) {			
			System.out.printf("I=%.1f j=%.1f\n", i, j);				
			j = j + 1;
				
		    }	
	    }  	
	System.out.println("I=0.8" + " " + "J=13.0");			 
	 for(double n = 1.2; i < 1.8; n++) {		
	i = i + 0.2;
	j = j + 0.2;
		for(int v = 0; v < 3; v++) {			
			System.out.printf("I=%.1f j=%.1f\n", i, j);				
			j = j + 1;
				
		    }	
	    }
	}
}
