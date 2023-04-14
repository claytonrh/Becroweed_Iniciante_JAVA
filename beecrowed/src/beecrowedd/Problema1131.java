//está correto mas retorna Presentation error (100%)

import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int TotGolInter = 0;
		int TotGolGremio = 0;
		int grenais = 0;
		int vitoriasInter = 0;
		int vitoriasGremio = 0;
		int empates = 0;
		int novoGrenal;
		
		do{
			String[] gols = input.nextLine().replaceAll(" ", " ").split(" ");
			int golInter = Integer.parseInt(gols[0]);
			int golGremio = Integer.parseInt(gols[1]);
			
			if(golInter > golGremio) {
				vitoriasInter = vitoriasInter + 1;
				}else if(golInter < golGremio) {
					vitoriasGremio = vitoriasGremio + 1; 
					}else if(golInter == golGremio) {
						empates = empates + 1; 
						}						
			TotGolInter = TotGolInter + golInter; 
			TotGolGremio = TotGolGremio + golGremio; 		 
			grenais = grenais +1;
		
			do{
				System.out.println("Novo grenal (1-sim 2-nao)");
				novoGrenal = input.nextInt();
			}while(novoGrenal <= 0 || novoGrenal > 2);
		
		input.nextLine();
			
		}while(novoGrenal != 2);
		
		System.out.println(grenais + "grenais");
		System.out.println("Inter:" + vitoriasInter);
		System.out.println("Gremio:" + vitoriasGremio);
		System.out.println("Empates:" + empates);
		
		if(vitoriasInter > vitoriasGremio) {
			System.out.println("Inter venceu mais");
			}else if(vitoriasInter < vitoriasGremio) {				
				System.out.println("Gremio venceu mais");
				}else if(vitoriasInter == vitoriasGremio) {				
					System.out.println("Nao houve vencedor");
					}
				
		input.close();
	}
}
