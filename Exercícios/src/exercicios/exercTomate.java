package exercicios;


	/*EXER 1 1) João, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. 
	 * Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento do estado de São Paulo 
	 * (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. 
	 * João precisa que você faça um sistema que leia a variável P (peso de tomates) e verifique se há excesso.
	 *  Se houver, gravar na variável E (Excesso) e na variável M o valor da multa que João deverá pagar.
	 *   Caso contrário mostrar tais variáveis com o conteúdo ZERO. */

import java.util.Scanner;
			/*para receber info do user*/

public class exercTomate {
	
	public static void main(String[] args) {
	
		int	pesoTomates, excedente = 0;
		float multa = 0 ;
		
		Scanner entrada = new Scanner(System.in);
		// declaração de uso do scanner, para pegar dados de entrada do usuário
		
		System.out.println(" Informe qual o peso de Tomates: ");
		pesoTomates = entrada.nextInt();
	
	
		if (pesoTomates > 50) {
			excedente = pesoTomates - 50;
			multa = excedente * 4;
			System.out.println(" Você excedeu os 50 kg permitidos, pagará um valor de R$: "  + multa);
			
		
		}
		else {
			System.out.println(" O Peso dos tomates não excederam 50 kg " + multa );		
			System.out.println(" O Peso dos tomates não excederam 50 kg " + excedente );
			}
		
		
	}
}
