//está correto mas o site não aceita dessa forma

import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String word1 = input.next();
		String word2 = input.next();
		String word3 = input.next();		
		
		if(word1 == "vertebrado" && word2 == "mamifero" && word3 == "onivoro") {
			System.out.println("homem");
		} else if (word1 == "vertebrado" && word2 == "mamifero" && word3 == "herbivoro") {
			System.out.println("vaca");
		} else if(word1 == "vertebrado" && word2 == "ave" && word3 == "carnivoro") {
			System.out.println("aguia");
		} else if(word1 == "vertebrado" && word2 == "ave" && word3 == "onivoro") {
			System.out.println("pomba");
		}
		
		if(word1 == "invertebrado" && word2 == "inseto" && word3 == "hematofago") {
			System.out.println("pulga");
		} else if (word1 == "invertebrado" && word2 == "inseto" && word3 == "herbivoro") {
			System.out.println("lagarta");
		} else if(word1 == "invertebrado" && word2 == "anelideo" && word3 == "hematofago") {
			System.out.println("sanguessuga");
		} else if(word1 == "invertebrado" && word2 == "anelideo" && word3 == "onivoro") {
			System.out.println("minhoca");
		}	
		input.close();
	}
}
