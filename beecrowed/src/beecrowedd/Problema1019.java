import java.util.Scanner;

public class Main {
public static void main (String args[]){
	
	Scanner input = new Scanner(System.in);
	
    int numero = input.nextInt();
    int divisao = numero / 60;
    int restoHoras = divisao % 60;
    int valor_decimal = restoHoras - (int)(restoHoras);
    
    int horas = (divisao  - restoHoras) / 60;
    int minutos = restoHoras - valor_decimal;
    int segundos = numero - ((horas * 60 * 60 )+(minutos *60 ));
    
    
    System.out.printf(horas + ":" + minutos + ":" + segundos +"\n");
    
    input.close();
    
	}
}
