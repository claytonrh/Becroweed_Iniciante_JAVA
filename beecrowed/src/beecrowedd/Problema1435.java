//está funcionando porém está apresentando Presentation error (100%)

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);	
		int n;
		
		do{
		
		n = input.nextInt();
		int matriz[][] = new int[n][n]; 
		
		for(int i = 0; i < n; i++) {		
			for(int j = 0; j < n; j++) {										
				int ini = 0;
				int fim = n;	
				int indice = 1;
				do {	
				    
					for(int l = ini; l <= fim-1; l++) { 
						matriz[l][fim-1] = indice;					
					}
					
					for(int l = ini; l <= fim-1; l++) { 
						matriz[ini][l] = indice;					
					}
					
					for(int l = ini; l <= fim-1; l++) { 
						matriz[l][ini] = indice;					
					}
					
					for(int l = ini; l <= fim-1; l++) { 
						matriz[fim-1][l] = indice;					
					}
					
					fim--;
					ini++;
					indice++;
				} while(fim > 0);			
			}
		}	
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.printf("%3d", matriz[i][j]);				 
			}
			System.out.println();
		}	
		
		}while(n > 0);	
		
		input.close();
	}
}
