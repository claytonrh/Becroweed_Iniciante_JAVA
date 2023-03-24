import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		List<Integer> numeros = new ArrayList <Integer> ();
		
		int valor = 0;	
		for(int i = 0; i < n; i++) {
			valor = valor + i;
			int numero = input.nextInt();
			numeros.add(numero);
		}			
		
		int valor2 = 0;
		for(int v = 0; v < numeros.size(); v++) {			
			valor2 = numeros.get(v);
			if(valor2 == 0){
				System.out.println("NULL");
			}else if(valor2 != 0 && valor2 % 2 == 0) {
				System.out.print("EVEN ");
			} else {
				System.out.print("ODD ");
			} 
			if (valor2 > 0) {
				System.out.println("POSITIVE");
			} else if(valor2 < 0 ) {
				System.out.println("NEGATIVE");			
			}
		}
	}
} 

