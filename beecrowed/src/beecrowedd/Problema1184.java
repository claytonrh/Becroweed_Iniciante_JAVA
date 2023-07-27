import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		double matriz[][] = new double [12][12];
		double resultado = 0;
		String  o = input.next();
		
		int elementos = 0;
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz.length; j++) {				
				double valor = 1.0;
				matriz [i][j] = valor;
			}
		}
		for(int i =0; i < matriz.length; i++) {
			double indice = 0;
			int posicao = 0;
			for(int j = 0; j < matriz.length; j++) {
				if(i == j){					
					indice = matriz[i][j];										
					for(int l = posicao; l >= 0; l--){
						resultado += matriz[i][l];						
						elementos++;
					}
					resultado -= indice;
					elementos -= 1;
				}				
				posicao++;		
			}	
		}
		if(o.equals("M")) {
		    resultado /= elementos;
		}
		
		System.out.printf("%.1f\n",resultado);
		
		input.close();		
	}
}
