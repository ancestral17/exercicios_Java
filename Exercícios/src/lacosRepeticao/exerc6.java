package lacosRepeticao;

	/*Escrever um programa que receba v�rios n�meros inteiros no teclado. E no final imprimir a m�dia dos n�meros m�ltiplos de 3. 
		Para sair digitar 0(zero).(DO...WHILE)*/

import java.util.Scanner;

public class exerc6 {
	public static void main(String[] args) {
        
		int numero, soma = 0, media = 0, contador = 0;
        Scanner entrada = new Scanner(System.in);

        do{
            System.out.println("Digite um n�mero: ");
            numero = entrada.nextInt();

            if(numero % 3 == 0){
                soma += numero;
            }
            if(numero % 3 == 0){
               contador++;
            }

            media = (soma/contador);

        }while(numero != 0);

        System.out.println(soma);
        System.out.println("\nA media dos n�meros multiplos de 3 �: "+ media);

        System.out.println("Finalizou execu��o!!");
    }

}