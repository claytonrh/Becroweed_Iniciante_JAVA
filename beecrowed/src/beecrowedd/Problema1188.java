import java.util.Locale;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		double resultado = 0;
		double matriz [][] = new double[12][12];
		String o = input.next();
		
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz.length; j++) {
				double valor = input.nextDouble();
				matriz[i][j] = valor;
			}	
		}

        int elementos = 0;
		int ini = 1;
		int fim = matriz.length - 2;
		for(int i = matriz.length-1; i >= 0; i--) {			
			for(int l = ini; l <= fim; l++) {
				resultado += matriz[i][l];
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
