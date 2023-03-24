//não está funcionando

import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		Scanner input = new Scanner(System.in);		
		int totalDias = 0, totalHoras = 0, totalMinutos = 0, totalSegundos = 0;
	
	    
		String[] diaIni = input.nextLine().split(" ");	
		String[] horaIni = input.nextLine().replaceAll(" ", "").split(":");
		String[] diaFim = input.nextLine().split(" ");
		String[] horaFim = input.nextLine().replaceAll(" ", "").split(":");
	
	    
		int diaInicial = Integer.parseInt(diaIni[1]);
		int horaInicial = Integer.parseInt(horaIni[0]);
		int minutoInicial = Integer.parseInt(horaIni[1]);
		int segundoInicial = Integer.parseInt(horaIni[2]);
		
		int diaFinal = Integer.parseInt(diaFim[1]);
		int horaFinal = Integer.parseInt(horaFim[0]);
		int minutoFinal = Integer.parseInt(horaFim[1]);
		int segundoFinal = Integer.parseInt(horaFim[2]);
		
		if(diaFinal == diaInicial) {
			totalDias = 0;
		    }else if(diaInicial < diaFinal){
		             if(horaInicial > horaFinal){
		            totalDias = diaFinal - diaInicial - 1;
        		    }else if(horaInicial < horaFinal ){
    		    totalDias = diaFinal - diaInicial;
    		    }
		    }else if(diaInicial > diaFinal && horaInicial > horaFinal){
		        totalDias = 30 - diaInicial + diaFinal - 1;
		}else {totalDias = 30 - diaInicial + diaFinal;
		}
		
		
		
		if(horaInicial == horaFinal && minutoInicial == minutoFinal){
			totalHoras = 0;
		} else if(diaInicial == diaFinal) {
		    totalHoras = horaFinal - horaInicial;
		}else if(diaInicial < diaFinal && horaInicial > horaFinal && minutoInicial < minutoFinal) {
		    totalHoras = 24 - horaInicial + horaFinal;	
		}else if(diaInicial < diaFinal && horaInicial > horaFinal && minutoInicial > minutoFinal) {
			totalHoras = 23 - horaInicial + horaFinal;
		}
		
		if(minutoInicial == minutoFinal && totalDias == 0 && totalHoras == 0){
			totalMinutos = 1;
		}else if( minutoInicial < minutoFinal){
		    totalMinutos = minutoFinal - minutoInicial;
		}else if( minutoInicial > minutoFinal){
			totalMinutos = 60 - minutoInicial + minutoFinal;
		}else if(minutoInicial == minutoFinal){
		    totalMinutos = 0;
		}
		
		if(totalDias == 0 && totalHoras == 0 && totalMinutos <= 1){
		    totalSegundos = 0;
		}else if(segundoInicial == segundoFinal){
		    totalSegundos = 0;
		}else if(segundoInicial < segundoFinal){
		    totalSegundos = segundoFinal - segundoInicial;
		}else{
		    totalSegundos = 60 - segundoInicial + segundoFinal;
		}
		
		System.out.println(totalDias  + " dia(s)");
		System.out.println(totalHoras  +  " hora(s)");
		System.out.println(totalMinutos  + " minuto(s)");
		System.out.println(totalSegundos  + " segundo(s)");
		
		input.close();
	}
	
}
