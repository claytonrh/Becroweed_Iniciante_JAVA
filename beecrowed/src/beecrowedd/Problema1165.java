import java.util.Scanner;

public class Main {
	
	public static void maian(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		do{
			int divisoes = 0;
			int x = input.nextInt();
			
			for(int i = 0; i <= x; i++) {
				if(i % 2 == 0){
					divisoes+= 1;
				}
			}
			if(divisoes == 2) {
				System.out.println(X eh primo);
			}else{
				System.out.println(X nao eh primo);
			}
			
		}while(testes < n);
		
		input.close();
	}
}
