//tem erro nesse problema, o site aceita as entradas em linhas diferentes.

/*
Enunciado:

Você tem em mãos dois cabos circulares de energia. O primeiro cabo tem raio R1 e o segundo raio R2. Você precisa comprar um conduite circular (veja a imagem abaixo que ilustra um conduite) de maneira a passar os dois cabos por dentro dele:

Qual o menor raio do conduite que você deve comprar? Em outras palavras, dado dois círculos, qual o raio do menor círculo que possa englobar ambos os dois?

Entrada
Na primeira linha teremos um inteiro T (T ≤ 10000), indicando o número de casos de teste.

Na única linha de cada caso teremos dois números inteiros R1 e R2, indicando os respectivos raios. Os inteiros serão positivos e todas as contas caberão em um inteiro normal de 32 bits.
Saída
Em cada caso, imprima o menor raio possível em uma única linha

Exemplo de Entrada	Exemplo de Saída

*/

//Modelo 1 - Errado

import java.util.Scanner;

public class Main {
    
    public static void main(String[]args) {
        
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
					
        
        for(int i = 0; i < n; i ++) {
			
			String[] valor = input.nextLine().replaceAll(" ", " ").split(" ");	
			valor.add(	
            int r1 = Integer.parseInt(valor[0]);
            int r2 = Integer.parseInt(valor[1]);
            
            int soma = r1 + r2;
            System.out.println(soma);
			
			valor.clear()
        }
    }
}



//Modelo 1 - Correto
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    
    public static void main(String[]args) {
        
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        input.nextLine();
        
        for(int i = 0; i < n; i ++) {
			
			String[] valor = input.nextLine().replaceAll(" ", " ").split(" ");			
            int r1 = Integer.parseInt(valor[0]);
            int r2 = Integer.parseInt(valor[1]);
            int soma = r1 + r2;
            System.out.println(soma);
		
        }
        
        input.close();
    }
}

