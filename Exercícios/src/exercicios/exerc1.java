package exercicios;

	/*1. Faça um sistema que leia a idade de uma pessoa expressa em anos,
 	meses e dias e mostre-a expressa apenas em dias. */

import java.util.Scanner;

public class exerc1 {

	public static void main(String[] args) {
		
		int ano, mes, dia, somaDias;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println(" Qual sua idade em anos : ");
		ano = entrada.nextInt();
		
		System.out.println("Qual seu mês de nascimento: ");
		mes = entrada.nextInt();
		
		System.out.println("Qual seu dia de nascimento: ");
		dia = entrada.nextInt();
		
		somaDias = (((mes*31)+ dia)+(ano*365));
		System.out.println("Sua idade em dias e: " + somaDias);
	
	}
}
