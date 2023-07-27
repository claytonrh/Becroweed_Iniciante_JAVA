// Está apresentando Wrong answer (10%)

/*
No oitavo episodio da segunda temporada do seriado The Big Bang Theory, The Lizard-Spock Expansion, Sheldon e Raj discutem qual dos dois é o melhor: o filme Saturn 3 ou a série Deep Space 9. A sugestão de Raj para a resolução do impasse é uma disputa de Pedra-Papel-Tesoura. Contudo, Sheldon argumenta que, se as partes envolvidas se conhecem, entre 75% e 80% das disputas de Pedra-Papel-Tesoura terminam empatadas, e então sugere o Pedra-Papel-Tesoura-Lagarto-Spock.

As regras do jogo proposto são:

a tesoura corta o papel;
o papel embrulha a pedra;
a pedra esmaga o lagarto;
o lagarto envenena Spock;
Spock destrói a tesoura;
a tesoura decapita o lagarto;
o lagarto come o papel;
o papel contesta Spock;
Spock vaporiza a pedra;
a pedra quebra a tesoura.

Embora a situação não se resolva no episódio (ambos escolhem Spock, resultando em um empate), não é difıcil deduzir o que aconteceria se a disputa continuasse. Caso Sheldon vencesse, ele se deleitaria com a vitória, exclamando "Bazinga!"; caso Raj vencesse, ele concluiria que "Raj trapaceou!"; caso o resultado fosse empate, ele exigiria nova partida: "De novo!". Conhecidas as personagens do jogo escolhido por ambos, faça um programa que imprima a provável reação de Sheldon.

Entrada
A entrada consiste em uma série de casos de teste. A primeira linha contém um inteiro positivo T (T ≤ 100), que representa o número de casos de teste. Cada caso de teste é representado por uma linha da entrada, contendo as escolhas de Sheldon e Raj, respectivamente, separadas por um espaço em branco. As escolha possíveis são as personagens do jogo: pedra, papel, tesoura, lagarto e Spock.

Saida
Para cada caso de teste deverá ser impressa a mensagem "Caso #t: R", onde t é o número do caso de teste (cuja contagem se inicia no número um) e R é uma das três reações possíveis de Sheldon: "Bazinga!", "Raj trapaceou!", ou "De novo!".
*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

		Scanner input = new Scanner(System.in);		
		int t = input.nextInt();
		
		input.nextLine();
		
		for(int i = 1; i <= t; i++) {		    
		    
			Object r;
			
			Object[] palavras = input.nextLine().replaceAll(" ", " ").split(" ");
			Object sheldon = palavras[0];
			Object raj = palavras[1];

            if (sheldon.equals(raj)) {
                r = "empate";
            } else if (sheldon.equals("tesoura") && (raj.equals("pedra") || raj.equals("spock"))) {
                r = "raj";
            } else if (sheldon.equals("papel") && (raj.equals("tesoura") || raj.equals("lagarto"))) {
                r = "raj";
            } else if (sheldon.equals("pedra") && (raj.equals("papel") || raj.equals("spock"))) {
                r = "raj";
            } else if (sheldon.equals("lagarto") && (raj.equals("pedra") || raj.equals("tesoura"))) {
                r = "raj";
            } else if (sheldon.equals("spock") && (raj.equals("lagarto") || raj.equals("papel"))) {
                r = "raj";    
            } else {
                r = "sheldon";
            }

            if(r == "sheldon") {
                System.out.println("Caso #" + i + ": Bazinga!");
            }else if(r == "raj") {
                System.out.println("Caso #" + i + ": Raj trapaceou!");
            }else{
                System.out.println("Caso #" + i + ": De novo!");
            }   
        }
        input.close();
    }
}
