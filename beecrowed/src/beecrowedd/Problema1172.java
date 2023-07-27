import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		List<Integer> x = new ArrayList<Integer>();
		
		for(int i = 0; i < 10; i++){
			int n = input.nextInt();
			if(n > 0){
				x.add(n);
			}else{
				x.add(1);
			}
			System.out.println("X[" + i + "] = " + x.get(i));
		}
		input.close();
	}
}

