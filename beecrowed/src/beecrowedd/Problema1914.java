/*
Amarelinha provavelmente é a brincadeira em que as crianças da vila mais se divertem, porém a mesma vem causando um bom tempo de discussão e choro nas crianças que a praticam. A causa do transtorno é para decidir quem será o próximo a pular, mas recentemente Quico (O gênio!) teve uma grande ideia para solucionar o problema. Basicamente a brincadeira só poderá ser jogada de dois em dois jogadores e para escolher o próximo jogador Quico indicou o uso do tradicional método par ou ímpar, onde os dois jogadores informam um número e se a soma desses números for par o jogador que escolheu PAR ganha ou vice verso. Entretanto a utilização desse método vem deixando o Quico louco, louco, louco... E por esse motivo ele pediu a sua ajuda! Solicitou a você um programa que dado o nome dos jogadores, suas respectivas escolhas PAR ou IMPAR e os números, informe quem foi o vencedor.

Entrada
A primeira linha de entrada contém um número inteiro QT (1 ≤ QT ≤ 100), indicando a quantidade de casos de teste que vem a seguir. 
Cada caso de teste contém duas linhas. 
Na primeira linha será informado o nome do jogador 1 seguido de sua escolha, “PAR” ou “IMPAR” 
e logo após, o nome do jogador 2 seguido de sua escolha, “PAR” ou “IMPAR”. 
Na segunda linha de entrada, contém 2 números inteiros N (1 ≤ N ≤ 10⁹) e M (1 ≤ M ≤ 10⁹), representando respectivamente os números escolhidos pelo jogador 1 e pelo jogador 2. 
É garantido que a escolha (PAR ou IMPAR) do jogador 1 será diferente da escolha (PAR ou IMPAR) do jogador 2 e que o nome dos jogares são formados somente por letras e não ultrapassarão 100 caracteres.
*/


import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int qt = input.nextInt();
		
		String par = "PAR";
		String impar = "IMPAR";
		String resultado;
		
		input.nextLine();
		
		for(int i = 0; i < qt; i++) {
		
		String[] jogadores = input.nextLine().replaceAll(" ", " ").split(" ");
		String jogador1 = jogadores[0];
		String jogador2 = jogadores[2];
		String escolhaJogador1 = jogadores[1];
		String escolhaJogador2 = jogadores[3];
		
		//input.next();
		
		String[] n = input.nextLine().replaceAll(" ", " ").split(" ");
		int n1 = Integer.parseInt(n[0]);
		int n2 = Integer.parseInt(n[1]);
		
		int soma = n1 + n2;
		
		if(soma % 2 == 0){
		    resultado = par;
		} else {
		    resultado = impar;
		}
		
		if(resultado.equals(escolhaJogador1)){
		    System.out.println(jogador1);
		}else{
		    System.out.println(jogador2);
		}   
		
		}		
		
		input.close();
		
	}
}

