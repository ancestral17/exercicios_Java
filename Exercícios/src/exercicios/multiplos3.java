package exercicios;

	/*Desenvolver um sistema que efetue a soma de todos os n?meros ?mpares que s?o  m?ltiplos de tr?s e 
	 * que se encontram  no conjunto dos n?meros de 1 at? 500.*/

public class multiplos3 {

	public static void main(String[] args) {
		
	int soma = 0;
	
	for(int i = 1; i <= 500; i++){
		if (i % 3 == 0 && i % 2 !=0) {
			soma = soma + i;
			System.out.println(i);
		}
	
	}
	
	System.out.println(soma);
	
	}
	
}
