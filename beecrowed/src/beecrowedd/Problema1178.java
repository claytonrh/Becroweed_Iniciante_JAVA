import java.util.*;

public class Main{
	
	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		
		double x = input.nextDouble();
		
		List<Double> vetor = new ArrayList<Double>();
		
		for(int i = 0; i < 100; i++) {
			vetor.add(x);
			x /= 2; 	
			System.out.printf("N[%d] = %.4f\n", i, vetor.get(i));		
		}		
		input.close();
	}
}
