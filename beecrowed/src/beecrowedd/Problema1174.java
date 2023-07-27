import java.util.*;

public class Main {
	
	public static void main(String[]args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		List<Double> a = new ArrayList<Double>();
		
		for(int i = 0; i < 100; i++) {			
			double valor = input.nextDouble();
			a.add(valor);
			if(a.get(i) <= 10){
				System.out.printf("A[%d] = %.1f\n",i, a.get(i));
			}
		}
		
		input.close();		
	}
}
