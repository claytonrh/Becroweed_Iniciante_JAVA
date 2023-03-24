import java.util.*;

public class Main {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
			
		List<Double> numeros = new ArrayList<Double>();
		//double[] numeros; 
		
		for(double i = 0; i < 6 ; i++) {
			double n = input.nextDouble();
			if(n > 0) {
			numeros.add(n);
			}
		} 
		
		System.out.println(numeros.size() + " valores positivos");
	}
}

