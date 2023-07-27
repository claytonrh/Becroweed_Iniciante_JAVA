import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int menor = Integer.MAX_VALUE;
		int posicao = 0;
		int[] vetor = new int[n];

		for (int i = 0; i < n; i++) {
			vetor[i] = input.nextInt();
			if (vetor[i] < menor) {
				menor = vetor[i];
				posicao = i;
			}
		}

		System.out.println("Menor valor: " + menor);
		System.out.println("Posicao: " + posicao);
		
		input.close();
	}
}
