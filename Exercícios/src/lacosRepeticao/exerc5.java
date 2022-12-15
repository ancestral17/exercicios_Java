package lacosRepeticao;

	/*Crie um programa que leia um número do teclado até que encontre um
	//	número igual a zero. No final, mostre a soma dos números
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
