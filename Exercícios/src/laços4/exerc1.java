package la�os4;

//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.

import java.util.Scanner;

public class exerc1 {

			    public static void main(String[] args) {

		        int n1,n2,n3;
		        
		        Scanner entrada = new Scanner(System.in);

		        System.out.println("Informe o primeiro valor: ");
		        n1 = entrada.nextInt();

		        System.out.println("Informe o segundo valor");
		        n2 = entrada.nextInt();

		        System.out.println("Informe o ter�eiro valor");
		        n3 = entrada.nextInt();

		        if(n1 > n2 && n1 > n3) {
		            System.out.println("O primeiro numero inserido e maior " + n1);
		        }

		        else if(n3 < n2) {
		            System.out.println("O segundo numero inserido � o maior "+ n2);
		        }

		        else {
		            System.out.println("O terceiro numero � o maior "+ n3);
		        }

		        System.out.println("Fim do programa");
		    }
		}

