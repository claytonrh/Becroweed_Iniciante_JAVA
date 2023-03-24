import java.util.*;

public class Main {
	
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		
		int valor = input.nextInt();
		List<Integer> impares = new ArrayList<Integer>();
			
		for(int i = valor; impares.size() < 6; i++) {
			if(i % 2 != 0) {
			impares.add(i);
			System.out.println(i);
			}			
		}
	}
}
