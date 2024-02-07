/*
Ana e suas amigas estão fazendo um trabalho de geometria para o colégio, em que precisam formar vários triângulos, numa cartolina, com algumas varetas de comprimentos diferentes. Logo elas perceberam que não dá para formar triângulos com três varetas de comprimentos quaisquer: se uma das varetas for muito grande em relação às outras duas, não dá para formar o triângulo.

Neste problema, você precisa ajudar Ana e suas amigas a determinar se, dados os comprimentos de quatro varetas, é ou não é possível selecionar três varetas, dentre as quatro, e formar um triângulo.

Entrada
A entrada é composta por apenas uma linha contendo quatro números inteiros A, B, C e D (1 ≤ A, B, C, D ≤ 100).

Saída
Seu programa deve produzir apenas uma linha contendo apenas um caractere, que deve ser ‘S’ caso seja possível formar o triângulo, ou ‘N’ caso não seja possível formar o triângulo.
*/


import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String forma = "S";
		
		String[] n = input.nextLine().replaceAll(" ", " ").split(" ");
		int n1 = Integer.parseInt(n[0]);
		int n2 = Integer.parseInt(n[1]);
		int n3 = Integer.parseInt(n[2]);
		int n4 = Integer.parseInt(n[3]);
		
		List<Integer> varetas = new ArrayList<Integer>();
		varetas.add(n1);
		varetas.add(n2);
		varetas.add(n3);
		varetas.add(n4);
		Collections.sort(varetas);
		
		int a = varetas.get(0);
		int b = varetas.get(1);
		int c = varetas.get(2);
		int d = varetas.get(3);
		
		
		if(a + b <= c && b + c <= d){
		    forma = "N";
		}
		
		System.out.println(forma);
		
		input.close();
	}
}

