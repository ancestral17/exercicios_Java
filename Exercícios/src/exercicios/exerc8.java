package exercicios;

 	/*8. O custo ao consumidor de um carro novo � a soma do custo de f�brica com a percentagem do distribuidor 
 	 * e dos impostos (aplicados ao custo de f�brica). Supondo que a percentagem do distribuidor seja de 28% 
 	 * e os impostos de 45%, escrever um sistema que leia o custo de f�brica de um carro e 
 	 * escreva o custo ao consumidor. */
import java.text.DecimalFormat;
import java.util.Scanner;

public class exerc8 {
	
	public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);	
	DecimalFormat decimal = new DecimalFormat("00.00");
	float custoFab, valorCons, porcD, porcI;

	
	System.out.println("Informe o valor do custo de  f�brica do carro: ");
	custoFab = entrada.nextFloat();
	
	
	porcD = custoFab/100 * 28;
	porcI = custoFab/100 * 45;
	
	 valorCons = ((porcD + porcI) + custoFab);
	 
	 System.out.println(" O custo total do carro novo ser�: R$ " + decimal.format(valorCons) + " O valor do imposto R$" + porcI + " valor do distribuidor R$" + decimal.format(porcD)); 


	}
}