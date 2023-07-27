import java.util.Scanner;
import java.util.Locale;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		double matriz [][] = new double [12][12];
		String o = input.next();
		double resultado = 0;
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz.length; j++) {				
			    double valor = input.nextDouble();
			    matriz[i][j] = valor;
			}			
		}

		double indice = 0;
		int elementos = 0;
		for(int i = matriz.length-1; i >=0; i--) {
		    int posicao = matriz.length-1;
			for(int j = 0; j < matriz.length; j++) {
				    if(i == posicao) {
						indice = matriz[i][j];
						for(int l = j; l < matriz.length; l++) {							
							resultado += matriz[i][l];
							elementos++;							
							}
						elementos -= 1;
						resultado -= indice;
					}					
					posicao--;	
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
