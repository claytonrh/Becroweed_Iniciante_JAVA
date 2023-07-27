//está funcionando mas o site está dando erro

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();				
		
		int testes = 0;
		do{	
			int n = input.nextInt();		
			int posicao = 0;	
		    int x1 = 0;
			int x2 = 1;							
			    if(n == 1 || n == 2){
				    System.out.println("Fib(" + n + ") = " + 1);	
			        }else{
			            for(int i = 0; posicao <= n; i++) {										
					       if(posicao == n) {
						     System.out.println("Fib(" + n + ") = " + x1);	
					       }
			            
						x2 += x1;  			
						x1 = x2 - x1;
						posicao++;	
					}
				}
		testes++;			
		}while(testes < t);
		input.close();
	}	
}
