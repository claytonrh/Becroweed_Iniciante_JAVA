import java.util.*;

public class Main {
	
	public static void main (String[]args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		List<Double> valores = new ArrayList<Double>();		
		List<Double> valoresPos = new ArrayList<Double>();
		
		double media = 0;
		double soma = 0;
		
		for(double i = 0; valores.size() < 6; i++) {
			i = input.nextDouble();
			valores.add(i);				
			}
		  	
		double valor = 0;
		for(int n = 0; n < valores.size(); n++){
		    valor = valores.get(n);
		    if(valor > 0) {
		    valoresPos.add(valor);	
			soma = soma + valor;			
		    }		    
		}		
		
		media = soma / valoresPos.size();
		
		System.out.println(valoresPos.size() + " valores positivos");
		System.out.printf("%.1f\n", media);
	}
}
