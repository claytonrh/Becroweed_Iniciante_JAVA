/* A corrida de lesmas é um esporte que cresceu muito nos últimos anos, fazendo com que várias pessoas dediquem suas vidas tentando capturar lesmas velozes, e treina-las para faturar milhões em corridas pelo mundo. Porém a tarefa de capturar lesmas velozes não é uma tarefa muito fácil, pois praticamente todas as lesmas são muito lentas. Cada lesma é classificada em um nível dependendo de sua velocidade:


Nível 1: Se a velocidade é menor que 10 cm/h .
Nível 2: Se a velocidade é maior ou igual a 10 cm/h e menor que 20 cm/h .
Nível 3: Se a velocidade é maior ou igual a 20 cm/h .


Sua tarefa é identificar qual nível de velocidade da lesma mais veloz de um grupo de lesmas.

Entrada
A entrada consiste de múltiplos casos de teste, e cada um consiste em duas linhas: A primeira linha contém um inteiro L (1 ≤ L ≤ 500) representando o número de lesmas do grupo, e a segunda linha contém L inteiros Vi (1 ≤ Vi ≤ 50) representando as velocidades de cada lesma do grupo.

A entrada termina com o fim do arquivo (EOF).

Saída
Para cada caso de teste, imprima uma única linha indicando o nível de velocidade da lesma mais veloz do grupo.
*/


import java.util.Scanner;

public class Main {
    
    public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in); 
			
			int nivel1 = 1;
			int nivel2 = 2;
			int nivel3 = 3;					
			
			
			while (input.hasNext()) {
			    
			    String s = input.next();
				
				if(s.equals("EOF")){
					break;
				}					
			
			    int l = Integer.parseInt(s);			
			    int[] velocidades = new int[l]; 
			    
				for(int i = 0; i < velocidades.length; i++) {					
					int vi = input.nextInt();
					velocidades[i] = vi;
				}
				
				int maisVeloz = velocidades[0];
				
				for(int j = 0; j < velocidades.length; j++) {
					if(velocidades[j] > maisVeloz){
						maisVeloz = velocidades[j];
					}					
				}
				
				if(maisVeloz > 0 & maisVeloz < 10) {
					System.out.println(nivel1);
				}else if(maisVeloz < 20){
					System.out.println(nivel2);
				}else{
					System.out.println(nivel3);
				}
			}
			
		input.close();
    }
}

