import java.util.Scanner;
import java.util.*;

public class Main {
	
	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		
		List<Integer> valores = new ArrayList<Integer>(); 
		List<Integer> valoresPar = new ArrayList<Integer>(); 
		
		for(int i = 0; valores.size() < 5; i++){
			i = input.nextInt();
			valores.add(i);
		}
		
		int valor = 0;
    	for(int n = 0; n < valores.size(); n++) {
    	    valor = valores.get(n);
    		if(valor % 2 == 0) {
    		valoresPar.add(valor);
			}
		} 
		
		System.out.println(valoresPar.size() + " valores pares");
	}
}
