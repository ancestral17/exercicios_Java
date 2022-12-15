package lacosRepeticao;

	/*Escrever um programa que receba vários números inteiros no teclado. E no final imprimir a média dos números múltiplos de 3. 
		Para sair digitar 0(zero).(DO...WHILE)*/

import java.util.Scanner;

public class exerc6 {
	public static void main(String[] args) {
        
		int numero, soma = 0, media = 0, contador = 0;
        Scanner entrada = new Scanner(System.in);

        do{
            System.out.println("Digite um número: ");
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
        System.out.println("\nA media dos números multiplos de 3 é: "+ media);

        System.out.println("Finalizou execução!!");
    }

}