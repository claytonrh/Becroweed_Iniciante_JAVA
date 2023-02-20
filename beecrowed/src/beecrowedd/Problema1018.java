//site não aceita dessa forma

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        
        Locale.setDefault(new Locale("pt", "BR"));
        Scanner scan = new Scanner(System.in);
        int valor, notas[] = { 100, 50, 20, 10, 5, 2, 1 };
        valor = scan.nextInt();

        for (int nota : notas) {
            int qtde = valor / nota;
            valor = valor % nota;
            System.out.printf("%d nota(s) de R$ %.2f\n", qtde, (double)nota);
        }
    }
}
