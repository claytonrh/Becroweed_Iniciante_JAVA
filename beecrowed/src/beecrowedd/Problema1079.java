import java.util.*;

public class Main {
	
	public static void main(String[] Args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);							
		List<Double> medias = new ArrayList<Double>();		
		int n = input.nextInt();										
		
		for(int i = 0; i < n; i++) {
			double v1 = input.nextDouble();						
			double v2 = input.nextDouble();						
			double v3 = input.nextDouble();						
		double multiplicacao = (v1 * 2) + (v2 * 3) + (v3 * 5);
		double media = multiplicacao / 10;
		medias.add(media);			
		}		
		
		for(int i = 0; i < n; i++) {
		System.out.printf("%.1f\n", medias.get(i));
		}
		
		input.close();
	}
}
