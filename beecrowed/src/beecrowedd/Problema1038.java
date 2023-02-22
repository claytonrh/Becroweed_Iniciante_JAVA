import java.util.Scanner;

public class Main {
	
	public static class Item {
		int codigo; 
		String especificacao;
		double preco;
		
	public int getCodigo() { 
         return codigo; 
    } 
    public double getPreco(double preco) {
         return codigo;
    }     
		
	Item (int CodigoItem, String EspecificacaoItem, double PrecoItem) {
		
		 codigo = CodigoItem;
		 especificacao = EspecificacaoItem;
		 preco = PrecoItem;			
		}			
	}		
	
	public static void main (String[]args) {	
		
		Scanner input = new Scanner(System.in);

	Item[] itens = new Item[5]; 			// o objeto Item receberá um array com 5 objetos 

	itens[0] = new Item(1, "Cachorro Quente", 4.00);	
	itens[1] = new Item(2, "X-Salada", 4.50);
	itens[2] = new Item(3, "X-Bacon", 5.00);
	itens[3] = new Item(4, "Torrada Simples", 2.00);
	itens[4] = new Item(5, "Refrigerante", 1.50);

	int codigo = input.nextInt();
	int qtd = input.nextInt();

	Item itemEncontrado = null;
	for (Item item : itens) {				// percorrerá todo o array itens até localizar o objeto cujo código é igual ao codigo digitado no input
		if (item.getCodigo() == codigo) {
			itemEncontrado = item;
			break;
		}
	}
	
	double valor = qtd * itemEncontrado.preco;
	
	System.out.printf("Total: R$ %.2f\n", valor);

	input.close();		
		
	}
}
