import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int c = input.nextInt();
		String t = input.next();
		double matriz [][] = new double [12][12];
		double resultado = 0;
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz.length; j++) {
				double valor = input.nextDouble();
				matriz[i][j] = valor;
			}
		}	
		
		for(int i = 0; i < matriz.length; i++) {
			double valor = matriz[i][c];
			resultado +=  valor;
		}
		
		if(t.equals("M")) {
			 resultado /= matriz.length;
		    }
		
		System.out.printf("%.1f\n", resultado);
		
		input.close();
		
	}
}
