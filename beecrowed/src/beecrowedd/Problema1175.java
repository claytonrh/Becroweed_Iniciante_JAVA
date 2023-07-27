import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n[]= new int[20];

		for(int i = 0; i < 20; i++) {
			int y = input.nextInt();
			n[i] = y;
		}		
		for(int i = 0; i < 10; i++) {
			int primeiro = n[19-i];
			int ultimo = n[i];;
			n[i] = primeiro;
			n[19-i] = ultimo;			
			}		
			
			for(int i = 0; i <= 19; i++){
				System.out.println("N[" + i + "] = " + n[i]);		
			}
		input.close();
	}
}

