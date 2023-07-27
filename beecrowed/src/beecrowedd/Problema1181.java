import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);		
		Scanner input = new Scanner(System.in);
		
		double[][] matriz = new double[12][12];
		int l = input.nextInt();
		double resultado = 0;
		String t = input.next();
		
		for(int i =0; i < matriz.length; i++) {
			for(int j= 0; j < matriz.length; j++) {
			matriz[i][j] = input.nextDouble();
				}
			}
	
		for(int i = 0; i < matriz.length; i++) {
		    double valor = matriz[l][i];		    
			resultado += valor;
		}
		
		if(t.equals("S")) {
			System.out.printf("%.1f\n", resultado);             
			}else if(t.equals("M")){
			System.out.printf("%.1f\n", resultado/matriz.length);             
		}			
		input.close();
	}
}
