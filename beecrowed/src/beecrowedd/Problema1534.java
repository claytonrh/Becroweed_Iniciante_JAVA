import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
		
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String linha;
        int n = 0;
        
        while ((linha = input.readLine()) != null) {
            n = Integer.parseInt(linha);
            int matriz[][] = new int[n][n];
		
            int ini = 0;
            int fim = n - 1;
            int variavel = 3;
		
            for (int i = 0; i < matriz.length; i++) {
                for (int j = fim; j >= 0; j--) {
                    if (j == fim) {
                        matriz[i][j] = variavel - 1;
                    } else if (j == i) {
                        matriz[i][j] = variavel - 2;
                    } else {
                        matriz[i][j] = variavel;
                    }
                }
                ini++;
                fim--;
            }
		
            ini = 0;
            fim = n - 1;
		
            for (int i = fim; i >= 0; i--) {
                for (int j = ini + 1; j < matriz.length; j++) {
                    if (i == j) {
                        matriz[i][j] = variavel - 2;
                    } else {
                        matriz[i][j] = variavel;
                    }
                }
                ini++;
                fim--;
            }
		
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.printf("%d", matriz[i][j]);
                }
                System.out.println();
            }
        }
		
        input.close();
    }
}
