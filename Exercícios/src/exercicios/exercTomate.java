package exercicios;


	/*EXER 1 1) Jo�o, homem de bem, comprou um microcomputador para controlar o rendimento di�rio de seu trabalho. 
	 * Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento do estado de S�o Paulo 
	 * (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. 
	 * Jo�o precisa que voc� fa�a um sistema que leia a vari�vel P (peso de tomates) e verifique se h� excesso.
	 *  Se houver, gravar na vari�vel E (Excesso) e na vari�vel M o valor da multa que Jo�o dever� pagar.
	 *   Caso contr�rio mostrar tais vari�veis com o conte�do ZERO. */

import java.util.Scanner;
			/*para receber info do user*/

public class exercTomate {
	
	public static void main(String[] args) {
	
		int	pesoTomates, excedente = 0;
		float multa = 0 ;
		
		Scanner entrada = new Scanner(System.in);
		// declara��o de uso do scanner, para pegar dados de entrada do usu�rio
		
		System.out.println(" Informe qual o peso de Tomates: ");
		pesoTomates = entrada.nextInt();
	
	
		if (pesoTomates > 50) {
			excedente = pesoTomates - 50;
			multa = excedente * 4;
			System.out.println(" Voc� excedeu os 50 kg permitidos, pagar� um valor de R$: "  + multa);
			
		
		}
		else {
			System.out.println(" O Peso dos tomates n�o excederam 50 kg " + multa );		
			System.out.println(" O Peso dos tomates n�o excederam 50 kg " + excedente );
			}
		
		
	}
}
