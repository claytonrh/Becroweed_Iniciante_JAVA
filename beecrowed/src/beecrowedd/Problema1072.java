import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		
		int in = 0;
		int out = 0;
		
		for(int i = 0; i < x; i++){
			int n = input.nextInt();
			if(n >= 10 && n <= 20) {
				in = in +1;
			} else {
				out = out +1;
			}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
	}
}
