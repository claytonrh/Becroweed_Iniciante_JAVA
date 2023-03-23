//está correto mas o site não aceita dessa forma

import java.util.Scanner;

public class Main {
	
	public static void main (String[]args){
		
		Scanner input = new Scanner(System.in);		
		
		int horaInicial = input.nextInt();		
		int minutoInicial = input.nextInt();		
		int horaFinal = input.nextInt();
		int minutoFinal = input.nextInt();
		
		int horas = 0;
		int minutos = 0;		
				
		if ( horaInicial == horaFinal && minutoFinal > minutoInicial) {
			horas = 0;			
		}else if( horaInicial == horaFinal && minutoFinal <= minutoInicial ) {
			horas = 24;	
		}else if( horaInicial > horaFinal ) {
			horas = 24 - horaInicial + horaFinal;			
		}else if( horaInicial < horaFinal ) {
			horas = horaFinal - horaInicial;		
		}
				
		if ( minutoInicial == minutoFinal ) {
			minutos = 0;			
		}else if( minutoInicial > minutoFinal ) {
			minutos = 60 - minutoInicial + minutoFinal;			
		}else if( minutoInicial < minutoFinal ) {
			minutos = minutoFinal - minutoInicial;		
		}
		int totalMinutos = 60 * horas - 60 + (horaFinal - horaInicial) * (60 - minutoInicial + minutoFinal);
		
		if(totalMinutos < 60) {
		    horas = 0;
		} else {
		    horas = horas;
		}
		
		System.out.println("O JOGO DUROU " + horas + " HORA(S) E " + minutos + " MINUTO(S)");	
		
		input.close();
		
	}
}
