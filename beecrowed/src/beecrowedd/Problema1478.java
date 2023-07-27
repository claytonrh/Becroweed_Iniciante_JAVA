//está funcionando porém está apresentando Time limit exceeded

//Modelo 1
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);		
		int n = input.nextInt();
		
        while (n != 0) {
            
		    int matriz[][] = new int[n][n];
		    int ini = 0;
		    
		    for (int i = 0; i < matriz.length; i++) {				
			    int indice = 1;
			    for (int j = ini; j < matriz.length; j++) {
				    matriz[i][j] = indice;								
				    matriz[j][i] = indice;
				    indice++;
			    }
			    ini++;
		    }
		    
		    StringBuilder sb = new StringBuilder();
		    for (int i = 0; i < n; i++) {
		    	for (int j = 0; j < n; j++) {
		    		sb.append(String.format("%3d", matriz[i][j]));
		    		if (j != n - 1) {
		    			sb.append(" ");
		    		}
		    	}
		    	sb.append("\n");
		    }
		    
		    System.out.println(sb.toString().trim()); // Remove espaços em branco no final
		    System.out.println(); // Linha em branco após a matriz
		
		    n = input.nextInt();	
		}
		
		input.close();
	}
}


//Modelo 2 
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        while (n != 0) {

            int matriz[][] = new int[n][n];
            int ini = 0;

            for (int i = 0; i < matriz.length; i++) {
                int indice = 1;
                for (int j = ini; j < matriz.length; j++) {
                    matriz[i][j] = indice;
                    matriz[j][i] = indice;
                    indice++;
                }
                ini++;
            }


            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    sb.append(String.format("%3d", matriz[i][j]));
                    if (j != n - 1) {
                        sb.append(" ");
                    }
                }
                sb.append("\n");
            }

            System.out.print(sb.toString().replaceAll("\\s+$", "")); // Remove espaços em branco no final
            System.out.println(); // Linha em branco após a matriz

            n = input.nextInt();
        }

        input.close();
    }
}

