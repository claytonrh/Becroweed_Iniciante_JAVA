import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {

		Scanner input = new Scanner(System.in);		
		
		int x;		
		do{
			x = input.nextInt();
			for(int i = 1; i <= x; i++)
				if(i < x) {
					System.out.print(i + " ");
				}else{
					System.out.println(i);
				}			
		}while( x != 0);
		
		input.close();		
	}		
}

