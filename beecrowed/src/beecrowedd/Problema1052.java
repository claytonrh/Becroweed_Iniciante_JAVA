//está correto mas o site não aceita dessa forma

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
		Scanner input = new Scanner(System.in);
		
		//int valor = input.nextInt();
		int valor = 1;
        
        if(valor >= 1 && valor <= 12){
        Calendar instance = Calendar.getInstance();
        instance.set(Calendar.MONTH, valor - 1);
        System.out.println( new SimpleDateFormat("MMMM").format(instance.getTime()));
        }
    }
}

