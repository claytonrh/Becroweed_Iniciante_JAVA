import java.util.*;

public class Main {
	
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		
		List<Integer> n = new ArrayList<Integer>();
		
		int v = input.nextInt();
		n.add(v);
		
		for(int i = 0; i < 10; i++) {
			int valor = n.get(i) + n.get(i);
			n.add(valor);
			System.out.println("N[" + i + "] = " + n.get(i));
		}		
		
		input.close();
	}
}
