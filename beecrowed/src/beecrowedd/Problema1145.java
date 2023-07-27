import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		int y = input.nextInt();		
		
		int valor = 0;
		for(int i = 1; i <= y; i++) {
			valor += 1;
			if(valor < x){
			System.out.print(i + " ");			
			}else if(valor == x) {
			System.out.println(i);
			valor = 0;
			}	
		}		
		input.close();
	}
}
