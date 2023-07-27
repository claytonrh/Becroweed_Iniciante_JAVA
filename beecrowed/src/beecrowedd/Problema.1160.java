import java.util.Scanner;
import java.util.Locale;

public class Main {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		int testes = 0;	
		int pa2 = 0;
		int pb2 = 0;
		input.nextLine();
		
		do{
			String[] valores = input.nextLine().replaceAll(" ", " ").split(" ");
			int pa = Integer.parseInt(valores[0]);
			int pb = Integer.parseInt(valores[1]);
			double g1 = Double.parseDouble(valores[2]);
			double g2 = Double.parseDouble(valores[3]);
			
			int anos = 0;
			pa2 = pa;
			pb2 = pb;
			for(int i = 0; pa2 <= pb2; i++){				
				double crescimentoA = pa2 * (g1/100);
				double crescimentoB = pb2 * (g2/100);
				pa2 += (int)crescimentoA;
				pb2 += (int)crescimentoB;
				anos += 1;				
				if(anos > 100){				
					anos = 101;	
					break;
			    	}				
			    }
				if(anos <= 100){
				System.out.println(anos + " anos.");			
				}else{
					System.out.println("Mais de 1 seculo.");
			    	}
				testes += 1;
		    }while(testes < t);
		
		input.close();			
	}				
}
