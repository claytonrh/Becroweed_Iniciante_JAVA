import java.util.Scanner;
import java.util.Locale;

public class Main {
	
	public static void main (String[]args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double n1 = input.nextDouble() * 0.2;
		double n2 = input.nextDouble() * 0.3;
		double n3 = input.nextDouble() * 0.4;
		double n4 = input.nextDouble() * 0.1;		
		
		double media = n1 + n2 + n3 + n4;			
		System.out.printf("Media: %.1f\n", media);
		
		if( media >= 7 ) {
			System.out.println("Aluno aprovado.");
		} else if ( media < 5 ) {
			System.out.println("Aluno reprovado.");
		} else if( media >= 5 && media <= 6.9 ) {
			System.out.println("Aluno em exame.");
		}
		
		if( media >= 5 && media <= 6.9 ) {
			double notaExame = input.nextDouble();
			System.out.printf("Nota do exame: %.1f\n", notaExame);
			double mediaFinal = (notaExame + media) / 2;
			if ( mediaFinal >= 5 ) {
				System.out.println("Aluno aprovado.");
			} else {
				System.out.println("Aluno reprovado.");
			}
			System.out.printf("Media final: %.1f\n", mediaFinal);
		}				
    
		input.close();
	}
}
