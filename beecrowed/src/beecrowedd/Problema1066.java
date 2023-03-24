import java.util.*;

public class Main {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		List<Integer> valores = new ArrayList<Integer>();
		List<Integer> valoresPar = new ArrayList<Integer>();
		List<Integer> valoresPos = new ArrayList<Integer>();
		List<Integer> valoresNeg = new ArrayList<Integer>();
		
		for(int i = 0; valores.size() < 5; i++) {
			i = input.nextInt();
			valores.add(i);
		}
		
		int valorPar = 0;
		for(int n = 0; n < valores.size(); n++) {
			valorPar = valores.get(n);
			if(valorPar % 2 == 0 ) {
				valoresPar.add(valorPar);
			}
		}
		
		int valorPos = 0;		
		for(int v = 0; v < valores.size(); v++) {
			valorPos = valores.get(v);
			if(valorPos > 0) {
				valoresPos.add(valorPos);
			}
		}
		
		int valorNeg = 0;		
		for(int v = 0; v < valores.size(); v++) {
			valorNeg = valores.get(v);
			if(valorNeg < 0) {
				valoresNeg.add(valorNeg);
			}
		}
		
		System.out.println(valoresPar.size() + " valor(es) par(es)");
		System.out.println(valores.size() - valoresPar.size() + " valor(es) impar(es)");
		System.out.println(valoresPos.size() + " valor(es) positivo(s)");
		System.out.println(valoresNeg.size() + " valor(es) negativo(s)");
	}
}

