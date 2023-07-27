import java.util.Scanner;
import java.util.Arrays;
import java.util.Locale;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		double matriz[][] = new double[12][12]; 
		double resultado = 0;
		char o = input.next().toUpperCase().charAt(0);
    	
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz.length; j++) {
				double valor = input.nextDouble();				
				matriz [i][j] = valor;
			}
		}
		
		int elementos = 0;
		int ini = 1;
		int fim = matriz.length-1;	
		do{
			for(int i = ini; i < fim; i++) { 
				resultado += matriz[i][fim];
				elementos++;
			    }
			fim--;
			ini++;
		} while(fim>0);
		
		
		if(o == 'S') {						
			System.out.printf("%.1f\n", resultado);
		}else if(o == 'M'){
			System.out.printf("%.1f\n", resultado / elementos);			
		}
		
		input.close();
	}
}

