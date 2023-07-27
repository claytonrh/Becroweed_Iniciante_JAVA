import java.util.Scanner;
import java.util.Arrays;
import java.util.Locale;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		double resultado = 0;
		double matriz [][] = new double[12][12];
		String o = input.next();
        
		for(int i = 0; i < matriz.length; i++) {			
			for (int j = 0; j < matriz.length; j++) {
				double valor = input.nextDouble();
				matriz [i][j] = valor;
			}
		}
		
		int elementos = 0;
		for(int i = 0; i < matriz.length; i ++) {			
			int ini = i+1;
			int fim = matriz.length-ini;
				for(int j = ini; j < fim; j++) {
					resultado += matriz[i][j];
					elementos++;
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
