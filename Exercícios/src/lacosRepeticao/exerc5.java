package lacosRepeticao;

	/*Crie um programa que leia um n�mero do teclado at� que encontre um
	//	n�mero igual a zero. No final, mostre a soma dos n�meros
	//	digitados.(DO...WHILE)*/

import java.util.Scanner;

public class exerc5 {
	 

	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
	int numero, soma = 0;
	
	do {
		System.out.println("Informe um numero: ");
		numero = entrada.nextInt();
		soma += numero;
//		soma = soma + numero;
	}while(numero != 0);
	System.out.println("A soma de todos os numeros digitados e igual a: " + soma);
}
}
