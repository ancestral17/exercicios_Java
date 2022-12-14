package la�os4;

	/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero � par ou �mpar.
	 *  Se for par exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado. */

import java.text.DecimalFormat;
import java.util.Scanner;

public class exerc4 {

	public static void main(String[] args) {
        
        float num;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite um n�mero qualquer:\n");
        
        DecimalFormat teste = new DecimalFormat("0.0000");
        
        num = entrada.nextFloat();

        if(num % 2 == 0) {
            double raiz = Math.sqrt(num);
            System.out.println(num+" � par e a raiz quadrada = "+ teste.format(raiz));
        }else {
            double quadrado = Math.pow(num, 2);
            System.out.println(num+" � impar e o quadrado = "+ teste.format(quadrado));
        }

    }
	
}
