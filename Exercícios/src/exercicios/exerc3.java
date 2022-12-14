package exercicios;

	/*3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos e
	mostre-o expresso em horas, minutos e segundos. */

import java.util.Scanner;

public class exerc3 {
	
	public static void main(String[] args) {
	
		
		int segundos, minutos, horas, tempoTotal;

		Scanner entrada = new Scanner(System.in);
		
		System.out.println(" Informe o tempo de duração do evento em horas: ");
		tempoTotal = entrada.nextInt();
		
		
		minutos = (tempoTotal * 60);
		segundos = (minutos * 60);
		
		System.out.println(" O evento teve um total de: " + tempoTotal + "horas. Total de: " + minutos + "minutos.  E um toral de: " +segundos + "de segundos");
		
		}	
		
	
		
}
