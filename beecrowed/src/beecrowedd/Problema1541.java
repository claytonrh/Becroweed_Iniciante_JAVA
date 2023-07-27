import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String executa = "sim";
		
		do{
		
		for(int i = 0; i < 4; i++) {
		    
		    int a;
		    int b;
		    int c;
		    
            a = input.nextInt();
        	if(a == 0){
        	    executa = "nao";
        	    break;
        	}else{
        	    b = input.nextInt();
        	    }
        	
        	if(b == 0){
        	    executa = "nao";
        	    break;
        	}else{
        	    c = input.nextInt();    
        	    }
        	
        	if(c == 0) {
        	    executa = "nao";
        	    break;
    		}else{
    		    double resultado = (a*b)*100/c;
    		    double lado = ((Math.sqrt(resultado))-(Math.sqrt(resultado) % 1));
    		    System.out.println((int)lado);  
    		    
    		}    		    
		}
		
		}while(executa.equals("sim"));
	    
	    input.close();
	}
}
