import java.util.Scanner;
import java.util.Locale;

public class Main {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		double idade;
		double media = 0;
		double soma = 0;
		int idades = 0;
		
		do{			
			idade = input.nextInt();
			if(idade >= 0){
			soma += idade;			
			idades += 1;
			}
		}while(idade > 0);
		
		media = soma / idades;
		
		System.out.printf("%.2f\n", media);
		
		input.close();
	}
}
