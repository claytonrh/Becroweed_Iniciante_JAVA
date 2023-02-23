import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        
        int[] numeros = {a, b, c};
		
        Arrays.sort(numeros);
        System.out.printf("%d\n%d\n%d\n\n", numeros[0], numeros[1], numeros[2]);
        System.out.printf("%d\n%d\n%d\n", a, b, c);

        input.close();
    }
}
