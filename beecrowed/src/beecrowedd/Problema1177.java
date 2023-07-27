import java.util.*;

public class Main {
	
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		List<Integer> vetor = new ArrayList<Integer>();		
		
		int repet = 0;
		do{
		for(int i = 0; i < t; i++) {
			vetor.add(i);
			repet++;
			}		
		}while(repet < 1000);
		
		for(int i = 0;i < 1000; i++) {
			System.out.println("N[" + i + "] = " + vetor.get(i));
		}		
		input.close();
	}
}
