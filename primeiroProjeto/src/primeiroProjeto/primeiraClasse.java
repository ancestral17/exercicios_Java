package primeiroProjeto;

import java.util.Scanner;

public class primeiraClasse {

	public static void main(String[] args) {
		// declara��o de variaveis
		int ano, mes, dia, somadias;
		// declara��o de uso do scanner, para pegar dados de entrada do usu�rio
		Scanner entrada = new Scanner(System.in);
		
		// intera��o com o usuario
		System.out.println("Anos de vida: ");
		// a vari�vel entrada ser� preenchida com o proximo inteiro digitado no terminal
		// e depois ser� repassada para a variavel ano
		ano = entrada.nextInt();
		
		System.out.println("Mes de nascimento: ");
		mes = entrada.nextInt();
		
		System.out.println("Dia de nascimento: ");
		dia = entrada.nextInt();
		
		somadias = (((mes*31)+ dia)+(ano*365));
		System.out.println("Sua idade em dias eh: " + somadias);
	}

}