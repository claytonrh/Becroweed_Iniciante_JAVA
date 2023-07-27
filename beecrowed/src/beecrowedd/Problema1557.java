import java.util.Scanner;

public class Main {
	
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		while(n != 0) {
				
		int matriz[][] = new int[n][n];		
		int ini = 0;
		int valor = 1;
		
		
			for(int i = ini; i < matriz.length; i++) {
			    int indice = 1;
			    int valor2 = valor;
				for(int j = 0; j < matriz.length; j++) {
					matriz[i][j] = valor2; 					 
					valor2 += valor2;					
				}
				indice++;
				valor+= valor;
			}
			
			int numero = matriz[n-1][n-1];
            String T = Integer.toString(numero);
			
			for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.printf("%" + T.length() + "d", matriz[i][j]);
                    if (j < n-1) System.out.print(" ");
                    else System.out.print("\n");
                }
            }
            
        System.out.println();
		n = input.nextInt();
			
		}	
		
		input.close();
	}
}

