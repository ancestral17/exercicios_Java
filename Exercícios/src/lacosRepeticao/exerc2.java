package lacosRepeticao;
	/*Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)*/


import java.util.Scanner;

public class exerc2 {
	
	public static void main(String[] args) {
		
	
		Scanner entrada = new Scanner(System.in);
		
		int vetor [];
		vetor = new int [10];
		int contPar=0;
		int contImpar=0;
		
		for (int i = 0; i <10;i++) {
				System.out.println("Informe um n�mero: ");
				vetor [i] = entrada.nextInt();
				if (vetor [i] % 2 == 0){
					contPar = contPar +1;
				}else {
					contImpar = contImpar +1;
	}
}
		System.out.println("Os n�meros pares s�o: " + contPar);
		System.out.println("Os n�meros pares s�o: " + contImpar);
		
		
}
}




