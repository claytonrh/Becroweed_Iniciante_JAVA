import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		while (input.hasNext()) {
			String n = input.next();
			
			if (n.equals("EOF")) {
				break;
			}
			
			int valor = Integer.parseInt(n);
			
			if (valor == 0) {
				System.out.println("vai ter copa!");
			} else if (valor > 0) {
				System.out.println("vai ter duas!");
			}
		}
		
		input.close();
	}
}

