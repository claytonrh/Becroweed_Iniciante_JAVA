import java.util.*;

public class Main {  
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		List<Integer> valores = new ArrayList<Integer>();
		List<Integer> valoresOrd = new ArrayList<Integer>();
		
		
		for(int i = 0; i < 100; i++) {
			int valor = input.nextInt();
			valores.add(valor);
			valoresOrd.add(valor);
		}
		
		Collections.sort(valoresOrd);
		
		for(int i = 0; i < valores.size(); i++) {		
		int maior = valoresOrd.get(99);
		int comparacao = valores.get(i);
		int posicao = i;
		if( maior == comparacao){
			System.out.println(maior);
			System.out.println(posicao+1);
			}		
		}	
		
	}
}
