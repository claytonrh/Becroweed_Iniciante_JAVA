import java.util.Scanner;
import java.util.Locale;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner (System.in);
		double matriz[][] = new double[12][12];
		double resultado = 0;
		String o = input.next();
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz.length; j++) {
				double valor = input.nextDouble();
				matriz[i][j] = valor;
			}
		}

		int elementos = 0;
		int ini = 1;
		int fim = matriz.length-1;
		for(int i = 0; i <= matriz.length/2; i++) {
			for(int j = ini; j < fim; j++) {
				resultado += matriz[j][i];
				elementos++;
			    }				
			ini++;
			fim--;
		}
		
		if(o.equals("S")) {						
			System.out.printf("%.1f\n", resultado);
		}else if(o.equals("M")){
			System.out.printf("%.1f\n", resultado / elementos);			
		}
		
		input.close();
	}
}

