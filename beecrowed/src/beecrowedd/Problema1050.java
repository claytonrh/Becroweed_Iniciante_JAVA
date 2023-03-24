import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
	
	public static class Estado {
		int codigo;
		String nome;
		
	public int getCodigo() {
		return codigo;
	} 
	
	public String getNome() {
		return nome;
	}
	
	Estado (int codigoEstado, String nomeEstado) {
		codigo = codigoEstado;
		nome = nomeEstado;
	}	
	}	

	public static void main (String[] args)  {
		
		Scanner input = new Scanner(System.in);		
		
		int codigo = input.nextInt();
		
		Estado[] estados = new Estado[8];
		
		estados[0] = new Estado(61, "Brasilia");
		estados[1] = new Estado(71, "Salvador");
		estados[2] = new Estado(11, "Sao Paulo");
		estados[3] = new Estado(21, "Rio de Janeiro");
		estados[4] = new Estado(32, "Juiz de Fora");
		estados[5] = new Estado(19, "Campinas");
		estados[6] = new Estado(27, "Vitoria");
		estados[7] = new Estado(31, "Belo Horizonte");		
		
		int codigos[] = {61,71,11,21,32,19,27,31};
		
		Estado resultado = null;
		for(Estado busca : estados) {
			if(busca.getCodigo() == codigo) {
				resultado = busca;
            break;
		    }
		}
		
		if(resultado == null) {
		    System.out.println("DDD não encontrado");
		}else {System.out.println(resultado.getNome());
		}		
	}
}

