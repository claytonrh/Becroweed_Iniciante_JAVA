import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int linhas = input.nextInt();
		
		int valor = 0;
		for(int i =0; valor < linhas; i++) {			
			valor += 1;			
			int valor1 = i+1;
			int valor2 = valor1+1;
			int valor3 = valor2+1;			
			i = valor3;
			System.out.println(valor1 + " " + valor2 + " " + valor3 + " PUM");			
		}		
		
		input.close();
	}
}
