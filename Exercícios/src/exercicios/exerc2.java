package exercicios;

	/*2. Faça um sistema que leia a idade de uma pessoa expressa em dias
	 *  e mostre-a expressa em anos, meses e dias. */
import java.util.Scanner;

public class exerc2 {
	

	public static void main(String[] args) {
		
		int idade, mes, dia, diasVida, mesesVida;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println(" Qual sua idade em anos : ");
		idade = entrada.nextInt();
	
		diasVida = idade*365;
				
		mesesVida = idade*12;
		
		System.out.println("Sua idade em dias e: " + diasVida + " O total em anos é de: " + idade + " anos. E o total em meses é de : " + mesesVida + " meses");
	
	}

}