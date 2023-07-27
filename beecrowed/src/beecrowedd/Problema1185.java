import java.util.Locale;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		double matriz [][] = new double [12][12];		
		String o = input.next();
		double resultado = 0;
		
		for(int i =0; i < matriz.length; i++) {
			for(int j = 0; j < matriz.length; j++) {
				double valor = input.nextDouble();
				matriz [i][j] = valor;
			}
		}				
		
		int elementos = 0;
		for(int i =0; i < matriz.length; i++) {			
			for(int j = 0; j < matriz.length; j++) {
				double indice = 0;												
				if(i == j) {									
					for(int l = i; l >= 0; l--) {						
						indice = matriz[i][j];						
						resultado += matriz[i][l];
						elementos++;
					}				
					
				resultado -= indice;
				elementos -= 1;				
				}				
			}
		}	
		
		if(o.equals("S")) {						
			System.out.printf("%.1f\n", resultado);
		}else if(o.equals("M")){
			System.out.printf("%.1f\n", resultado / elementos);			
		}
		
		input.close();
	}
}

