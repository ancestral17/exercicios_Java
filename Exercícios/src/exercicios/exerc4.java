package exercicios;
	/*4. Escreva  um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e calcule a seguinte express�o:*/


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
	
	System.out.println ("A soma de A + B� � igual a: " + R);
	System.out.println ("A soma de B + C� � igual a: " + S);
	System.out.println ("O resultado da express�o �: " + result);
		}

	
}
