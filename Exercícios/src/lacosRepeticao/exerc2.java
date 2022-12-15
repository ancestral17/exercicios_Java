package lacosRepeticao;
	/*Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/


import java.util.Scanner;

public class exerc2 {
	
	public static void main(String[] args) {
		
	
		Scanner entrada = new Scanner(System.in);
		
		int vetor [];
		vetor = new int [10];
		int contPar=0;
		int contImpar=0;
		
		for (int i = 0; i <10;i++) {
				System.out.println("Informe um número: ");
				vetor [i] = entrada.nextInt();
				if (vetor [i] % 2 == 0){
					contPar = contPar +1;
				}else {
					contImpar = contImpar +1;
	}
}
		System.out.println("Os números pares são: " + contPar);
		System.out.println("Os números pares são: " + contImpar);
		
		
}
}




