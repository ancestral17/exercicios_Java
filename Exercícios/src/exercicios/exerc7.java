package exercicios;

	/*Escreva um sistema que l� os coeficientes a,b,c,d,e e f e calcula e mostra os valores de x e y. */

import java.util.Scanner;


public class exerc7 {

	
public static void main(String[] args) {
	
	float a, b, c, d, e, f, X, Y;
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Informe o valor de A: ");
	a = entrada.nextFloat();

	System.out.println("Informe o valor de B: ");
	b = entrada.nextFloat();
	
	System.out.println("Informe o valor de C: ");
	c = entrada.nextFloat();
	
	System.out.println("Informe o valor de D: ");
	d = entrada.nextFloat();
	
	System.out.println("Informe o valor de E: ");
	e = entrada.nextFloat();
	
	System.out.println("Informe o valor de F: ");
	f = entrada.nextFloat();
	
	X = (c*e)-(b*f)/(a*e)-(b*d);
	Y = (a*f)-(c*d)/(a*e)-(b*d);
	
	System.out.println("O valor de X �: " + X + " e o valor de Y �: " + Y);

}

