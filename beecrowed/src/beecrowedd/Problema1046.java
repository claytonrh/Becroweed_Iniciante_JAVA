import java.util.Scanner;

public class Main {
	public static void main (String[]args) {
		
		Scanner input = new Scanner(System.in);
		
		int inicio = input.nextInt();
		int fim = input.nextInt();
		
		int totalHoras =;
		
		if ( inicio == fim {
			totalHoras = 24;
			System.out.println("O JOGO DUROU " + totalHoras + " HORA(S)");
		}else if( inicio > fim ) {
			totalHoras = 24 - inicio + fim;
			System.out.println("O JOGO DUROU " + totalHoras + " HORA(S)");
		}else if( inicio < fim ) {
			totalHoras = fim - inicio;
			System.out.println("O JOGO DUROU " + totalHoras + " HORA(S)");
		}		
		
		input.close();
	}
}

