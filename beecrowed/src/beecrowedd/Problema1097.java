public class Main {
	
	public static void main(String[] args) {
		
	int i = 1;	
	int j = 7;
	
	System.out.println("I=" + i + " " + "J=7");		
	System.out.println("I=" + i + " " + "J=6");		
	System.out.println("I=" + i + " " + "J=5");		
	
	for(int n = 0; i < 9; n++) {
		i = i + 2;		
		j = j +2;	
		System.out.println("I=" + i + " " + "J=" + j);				
		System.out.println("I=" + i + " " + "J=" + (j - 1));
		System.out.println("I=" + i + " " + "J=" + (j - 2));
		}		
	}
}
