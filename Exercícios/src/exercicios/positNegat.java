package exercicios;

/*4) Fa�a um sistema que leia um n�mero inteiro e mostre uma mensagem indicando se este n�mero � par ou �mpar, 
 * e se � positivo ou negativo*/

import java.util.Scanner;

public class positNegat {
		
	public static void main(String[] args) {
	
		int num = 0;
		
		Scanner entrada = new Scanner(System.in);
	
		System.out.println("Informe um n�mero: ");
		num = entrada.nextInt(); 
	
		if (num % 2 == 0) {
			System.out.println("Este n�mero � par: "  + num);
		
		}
		else {
			 System.out.println("Este n�mero � impar");
			 
		}
		
 		if (num < 0) {
 			System.out.println("Este n�mero � negativo" + num);
 		}
 		
 		else {
			 System.out.println("Este n�mero � positivo: " + num );
			 
	 
		 }
		 
	}
	
			
}

