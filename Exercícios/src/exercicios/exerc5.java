package exercicios;

	/*5. Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste aluno.
	Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5, respectivamente.*/ 

import java.util.Scanner;
import java.text.DecimalFormat;

public class exerc5 {
	
	public static void main(String[] args) {

	Scanner entrada = new Scanner(System.in);	
	DecimalFormat decimal = new DecimalFormat("0.00");
	
	int nota1 = 0, nota2 = 0, nota3 = 0, pesoT;
	int peso1, peso2, peso3 = 0;
	float mediap;
	
			
	peso1 = 2;
	peso2 = 3 ;
	peso3 = 5;
	pesoT = (peso1+peso2+peso3);
	
	
	System.out.println(" Insira 1� nota : ");
	nota1 = entrada.nextInt();
	
	System.out.println(" Insira 2� nota : ");
	nota2 = entrada.nextInt();
	
	System.out.println(" Insira 3� nota : ");
	nota3 = entrada.nextInt();
	
	mediap = nota1 * 2 + nota2 * 3 + nota3 * 5 /(pesoT);
	
	System.out.println(" As notas do aluno foram: " + nota1 +"," + nota2 +","+ nota3 + "e  a m�dia foi: " + decimal.format(mediap));

}
}