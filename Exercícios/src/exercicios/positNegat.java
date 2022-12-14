package exercicios;

/*4) Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este número é par ou ímpar, 
 * e se é positivo ou negativo*/

import java.util.Scanner;

public class positNegat {
		
	public static void main(String[] args) {
	
		int num = 0;
		
		Scanner entrada = new Scanner(System.in);
	
		System.out.println("Informe um número: ");
		num = entrada.nextInt(); 
	
		if (num % 2 == 0) {
			System.out.println("Este número é par: "  + num);
		
		}
		else {
			 System.out.println("Este número é impar");
			 
		}
		
 		if (num < 0) {
 			System.out.println("Este número é negativo" + num);
 		}
 		
 		else {
			 System.out.println("Este número é positivo: " + num );
			 
	 
		 }
		 
	}
	
			
}

