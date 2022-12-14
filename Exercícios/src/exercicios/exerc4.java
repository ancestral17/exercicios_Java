package exercicios;
	/*4. Escreva  um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão:*/


public class exerc4 {
	
	public static void main(String[] args) {
	
	int A, B, C, R, S, D, result;
	
	
	A = 3;
	B = 4;
	C = 5;
	R = (A + B) * (A + B);
	S = (B + C) * (B + C);
	D = (R + S) / 2;
	result = D ;
	
	System.out.println ("A soma de A + B² é igual a: " + R);
	System.out.println ("A soma de B + C² é igual a: " + S);
	System.out.println ("O resultado da expressão é: " + result);
		}

	
}
