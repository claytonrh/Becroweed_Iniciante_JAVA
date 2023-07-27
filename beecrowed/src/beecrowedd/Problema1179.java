import java.util.*;

public class Main{
	
	public static void main(String[]args){		
	
	Scanner input = new Scanner(System.in);
	
	List<Integer> vetorPar = new ArrayList<Integer>();
	List<Integer> vetorImpar = new ArrayList<Integer>();	
	
	int repet = 0;
	do{		
		int n = input.nextInt();
		repet++;
		
		if(n % 2 == 0){
			vetorPar.add(n);			
		}else if(n % 2 != 0){
			vetorImpar.add(n);			
		}
		
		if(vetorPar.size() >= 5) {
			for(int i = 0; i < 5 ; i++) {
			System.out.println("par[" + i + "] = " + vetorPar.get(i));		
			}
			vetorPar.clear();
		} 
		if(vetorImpar.size() >= 5) {
			for(int i = 0; i < 5 ; i++) {
			System.out.println("impar[" + i + "] = " + vetorImpar.get(i));	
			}
			vetorImpar.clear();
		}		
		
	}while(repet < 15);	
	
	int index2 = 0;
	for(Integer i : vetorImpar){            			
		System.out.println("impar[" + index2 + "] = " + vetorImpar.get(index2));	
		index2++;
		}
	
	int index1 = 0;
	for(Integer i : vetorPar){            			
		System.out.println("par[" + index1 + "] = " + vetorPar.get(index1));	
		index1++;
		}				
	}
}
