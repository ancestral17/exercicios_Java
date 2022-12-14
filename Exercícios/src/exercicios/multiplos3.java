package exercicios;

	/*Desenvolver um sistema que efetue a soma de todos os números ímpares que são  múltiplos de três e 
	 * que se encontram  no conjunto dos números de 1 até 500.*/

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
