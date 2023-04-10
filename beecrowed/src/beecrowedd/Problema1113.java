import java.util.*;

public class Main {
	
	public static void main (String[] args){
	
		Scanner input = new Scanner (System.in);
		List<String> ordem = new ArrayList <String>(); 
		int x = 0;		
		int y = 1;				
		
		while ( x != y) {
			String[] numeros = input.nextLine().replaceAll(" ", " ").split(" ");
			x = Integer.parseInt(numeros[0]);
			y = Integer.parseInt(numeros[1]);	
			if(x < y) {
				ordem.add("Crescente");
			}else if (x > y) {
				ordem.add("Decrescente");
			}
		}			
		for(int i = 0; i < ordem.size(); i ++) {
			System.out.println(ordem.get(i));
		}
		input.close();
	}
}
