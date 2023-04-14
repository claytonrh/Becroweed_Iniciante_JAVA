import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int x = 1;
		int y = 2;
		List<String> quadrantes = new ArrayList<String>();
		
		while( x != 0 && y != 0) {		
		String[] numeros = input.nextLine().replaceAll(" ", " ").split(" ");
		x = Integer.parseInt(numeros[0]);
		y = Integer.parseInt(numeros[1]);
		if( x > 0 && y > 0) {
			quadrantes.add("primeiro");
		}else if( x < 0 && y > 0) {
			quadrantes.add("segundo");
		}else if( x < 0 && y < 0) {
			quadrantes.add("terceiro");
		}else if( x > 0 && y < 0) {
			quadrantes.add("quarto");
			}
		}		
		for(int i = 0; i < quadrantes.size(); i++) {
			System.out.println(quadrantes.get(i));
		}
		
	input.close();
	
	}
}
