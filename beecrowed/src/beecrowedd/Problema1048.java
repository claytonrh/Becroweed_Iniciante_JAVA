import java.util.Scanner;
import java.util.Locale;

public class Main {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		double salario = input.nextDouble();		
		
		double novoSalario = 0.00;
		double reajusteGanho = 0.00;
		
		int[] percentual = {15, 12, 10, 7, 4};
		
		if(salario <= 400) {
			novoSalario = salario / 100 * percentual[0] + salario;
			reajusteGanho = novoSalario - salario;
			System.out.printf("Novo salario: %.2f\n",  novoSalario);
			System.out.printf("Reajuste ganho: %.2f\n",  reajusteGanho);
			System.out.println(	"Em percentual: " + percentual[0] + " %");
		}else if(salario <= 800){
			novoSalario = salario / 100 * percentual[1] + salario;
			reajusteGanho = novoSalario - salario;
			System.out.printf("Novo salario: %.2f\n",  novoSalario);
			System.out.printf("Reajuste ganho: %.2f\n",  reajusteGanho);
			System.out.println(	"Em percentual: " + percentual[1] + " %");
		}else if(salario <= 1200){
			novoSalario = salario / 100 * percentual[2] + salario;
			reajusteGanho = novoSalario - salario;
			System.out.printf("Novo salario: %.2f\n",  novoSalario);
			System.out.printf("Reajuste ganho: %.2f\n",  reajusteGanho);
			System.out.println(	"Em percentual: " + percentual[2] + " %");		
		}else if(salario <= 2000){
			novoSalario = salario / 100 * percentual[3] + salario;
			reajusteGanho = novoSalario - salario;
			System.out.printf("Novo salario: %.2f\n",  novoSalario);
			System.out.printf("Reajuste ganho: %.2f\n",  reajusteGanho);
			System.out.println(	"Em percentual: " + percentual[3] + " %");		
		}else{
			novoSalario = salario / 100 * percentual[4] + salario;
			reajusteGanho = novoSalario - salario; 
			System.out.printf("Novo salario: %.2f\n",  novoSalario);
			System.out.printf("Reajuste ganho: %.2f\n",  reajusteGanho);
			System.out.println("Em percentual: " + percentual[4] + " %");		
		}
	}
}
