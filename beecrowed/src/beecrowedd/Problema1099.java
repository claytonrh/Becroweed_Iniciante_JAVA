import java.util.*;

public class Main {

	public static void main (String[] args) {	
	
	Scanner input = new Scanner(System.in);
	int n = input.nextInt();
	
	List<Integer> somas = new ArrayList<Integer>();
	input.nextLine();
	
	for(int i = 0; i < n; i++) {
		String[] numeros = input.nextLine().replaceAll(" ", " ").split(" ");
		int valor1 = Integer.parseInt(numeros[0]);
		int valor2 = Integer.parseInt(numeros[1]);
		int x = 0;
		int y = 0;
		if(valor1 < valor2){
			x = valor1;
			y = valor2;
		}else if(valor1 > valor2){
			x = valor2;
			y = valor1;
		} 
		int soma = 0;
			for(int v = x+1; v < y; v += 1){
				if(v % 2 != 0){
				soma = soma + v;	
				}
			}	
		somas.add(soma);		
		}		
		
		for(int i = 0; i < n; i++){		
		System.out.println(somas.get(i));
		}
	}
}
