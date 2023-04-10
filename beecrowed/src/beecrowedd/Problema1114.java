import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	int senha = 2002;
	
	int valor = 0;
	while(valor != senha) {
		valor = input.nextInt();
			if(valor == senha) {
				System.out.println("Acesso Permitido");
			}else{
			System.out.println("Senha Invalida");
			}
		} 
		
	input.close();
	
	}
}
