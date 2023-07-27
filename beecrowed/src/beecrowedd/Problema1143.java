import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int linhas = input.nextInt();
		
		int valor = 0;
		for(int i = 1; valor < linhas; i++) {
			valor += 1;
			double valor2 = Math.pow(i, 2);
			double valor3 = Math.pow(i, 3);
			System.out.println(i + " " + (int)valor2 + " " + (int)valor3);			
		}
		
		input.close();
	}
}
