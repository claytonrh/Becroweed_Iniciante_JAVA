//está correto mas o site não aceita dessa forma

import java.util.*;
import java.io.IOException;

public class Main {
    
    public static void main(String[]args) {
        
        Locale.setDefault(Locale.US);
        
        Scanner input = new Scanner(System.in);
        
        int qtde = 0;
        String cobaia = " ";		
        int totalCobaias = 0;
		int totalCoelhos = 0;
		int totalRatos = 0;
		int totalSapos = 0;
        
        List<Integer> qtdes = new ArrayList<Integer>();
        List<String> cobaias = new ArrayList<String>();
        
        int n = input.nextInt();
        input.nextLine(); // Consumir o caractere de quebra de linha
        
        for( int i = 0; i < n; i++) {            
            String[] valor = input.nextLine().replaceAll(" ", " ").split(" ");
            qtde = Integer.parseInt(valor[0]);
            cobaia = valor[1];
            qtdes.add(qtde);
            cobaias.add(cobaia); 
			if(cobaia.equals("s")){
				totalSapos = totalSapos += qtde;
			}else if(cobaia.equals("r")) {
				totalRatos = totalRatos += qtde;
			}else if(cobaia.equals("c")) {
				totalCoelhos = totalCoelhos += qtde;
			}
        }   
        
		for(int i = 0; i < qtdes.size(); i++) {
			totalCobaias = totalCobaias + qtdes.get(i);
		}
		
        double perCoelhos = (double) totalCoelhos / totalCobaias * 100;
        double perRatos = (double) totalRatos / totalCobaias * 100;
        double perSapos = (double) totalSapos / totalCobaias * 100;

		System.out.println("Total: " + totalCobaias + " cobaias");
		System.out.println("Total de coelhos: " + totalCoelhos);
		System.out.println("Total de ratos: " + totalRatos);
		System.out.println("Total de sapos: " + totalSapos);		
		System.out.printf("Percentual de coelhos: %.2f %%\n", perCoelhos);
        System.out.printf("Percentual de ratos: %.2f %%\n", perRatos);
        System.out.printf("Percentual de sapos: %.2f %%\n", perSapos);
    }
}
