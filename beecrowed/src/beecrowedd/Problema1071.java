import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		int y = input.nextInt();		
		
		int soma = 0;		
		int valorIni;
		int valorFim;
		
		if(x > y){
			valorIni = y+1;
			valorFim = x-1;
		} else {
			valorIni = x+1;
			valorFim = y-1;
		}
		
		int valor = 0;
		for(int i = valorIni; i <= valorFim; i++) {
			if(i % 2 != 0) {
			soma = soma + i;
			}
		}		
		
		System.out.println(soma);
	}
}
