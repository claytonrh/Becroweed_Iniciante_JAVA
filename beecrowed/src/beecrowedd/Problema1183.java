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

		double indice;		
		int elementos = 0;
		for(int i = 0; i < matriz.length; i++){
		    int posicao = 0;
			for(int j = 0; j < matriz.length; j++) {
					if(i == j){
						indice = matriz[i][j];
							int posicao2 = posicao;
							for(int l = 0;posicao2 < matriz.length; l++){
								resultado += matriz[i][posicao2];
								posicao2++;
								elementos++;
							}
						resultado -= indice;
						elementos -= 1;
					}
					posicao++;
				}	
			}
			
			if(o.equals("M")){
			    resultado /= elementos;					
			}
			
			System.out.printf("%.1f\n",resultado);
			
		input.close();
	}
}
