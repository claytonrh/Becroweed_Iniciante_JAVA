import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int tipo;
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;				
		
		do{
			do{		
				tipo = input.nextInt();
			}while (tipo <= 0 || tipo > 4);		
		
			if(tipo == 1) {
				alcool = alcool + 1;
			}else if(tipo == 2) {
				gasolina = gasolina + 1;			
			}else if(tipo == 3) {
				diesel = diesel + 1;
			}
		}while(tipo != 4);
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		input.close();
	}
}
