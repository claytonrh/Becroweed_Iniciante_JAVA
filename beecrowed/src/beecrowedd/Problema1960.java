//***Melhorar esse código*****

/*A ECI (Editio Chronica Incredibilis ou Editora de Crônicas Incríveis) é muito tradicional quando se trata de numerar as páginas de seus livros. Ela sempre usa a numeração romana para isso. E seus livros nunca ultrapassam as 999 páginas pois, quando necessário, dividem o livro em volumes.

Você deve escrever um programa que, dado um número arábico, mostra seu equivalente na numeração romana.

Lembre que I representa 1, V é 5, X é 10, L é 50, C é 100, D é 500 e M representa 1000.

Entrada
A entrada é um número inteiro positivo N (0 < N < 1000).

Saída
A saída é o número N escrito na numeração romana em uma única linha. Use sempre letras maiúsculas.
*/

import java.util.Scanner;

public class Main {
	
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		
		int I = 1;
		int V = 5;
		int	X = 10;
		int L = 50;
		int C = 100; 
		int D = 500;
		int M = 1000;		
		
		String NS = ""; 
		
		int NA = input.nextInt();
		int resto = NA;	
		
		if(NA == 999) {
			resto = resto - D - (D-C) ;
			NS = "CM";
		}
		
		if(resto == D) {
			resto = resto - D;
			NS = NS + "D";
		}
		
		if(resto > D) {
			resto = resto - D;
			NS = NS + "D";
		}
		
		if(resto == D) {
			resto = resto - D;
			NS = NS + "D";
		}
		
		if(resto > C * 4 ){
			resto = resto - ( C * 4);
			NS = NS + "CD";
		}
		
		if(resto > C * 3 ){
			resto = resto - C;
			NS = NS + "C";
		}
		
		if(resto > C * 2 ){
			resto = resto - C;
			NS = NS + "C";
		}
		
		if(resto > C ){
			resto = resto - C;
			NS = NS + "C";
		}
		
		if(resto == C ){
			resto = resto - C;
			NS = NS + "C";
		}
		
		if(resto > L + (X * 4)) {
			resto = resto - L - ( X * 4) ;
			NS = NS + "XC";
		}
		
		if(resto > L){
			resto = resto - L;
			NS = NS + "L";
		}
		
		if(resto == L) {
			resto = resto - L;
			NS = NS + "L";
		}
		
		if(resto > X * 4){
			resto = resto - ( X * 4);
			NS = NS + "XL";
		}
		
		if(resto > X * 3){
			resto = resto - X;
			NS = NS + "X";
		}
		
		if(resto > X * 2){
			resto = resto - X;
			NS = NS + "X";
		}
		
		if(resto > X ){
			resto = resto - X;
			NS = NS + "X";
		}
		
		if(resto == X) {
			resto = resto - X;
			NS = NS + "X";
		}
		
		if(resto ==  9) {
			resto = resto - ( X - I) ;
			NS = NS + "IX";
		}
		
		if(resto > V){
			resto = resto - V;
			NS = NS + "V";
		}
		
		if(resto == V){
		    resto = resto - V;
		    NS = NS + "V";
		}
		
		if(resto >  I * 3) {
			resto = resto - ( V - I) ;
			NS = NS + "IV";
		}
		
		if(resto < V && resto > I * 3){
			resto = resto - I;
			NS = NS + "IV";
		}
		
		if(resto <= I * 3 && resto > 0){
			resto = resto - I;
			NS = NS + "I";
		}
		
		if(resto <= I * 2 && resto > 0){
			resto = resto - I;
			NS = NS + "I";
		}
		
		if(resto == I ){
			resto = resto - I;
			NS = NS + "I";
		}
		
		System.out.println(NS);
		
		input.close();
	}
}

