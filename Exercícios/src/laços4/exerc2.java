package la�os4;

	/*Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.*/

 
import java.util.Scanner;

public class exerc2 {

	
	public static void main(String[] args) {

        int n1,n2,n3, cont = 0;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite um n�mero inteiro:");
        n1= entrada.nextInt();
        System.out.println("Digite um n�mero inteiro:");
        n2= entrada.nextInt();
        System.out.println("Digite um n�mero inteiro:");
        n3= entrada.nextInt();

        
        if (n1 > n2 && n1 > n3) {
        	System.out.println(n1);        	
        	
        }
        else if (n2 > n3 ){
        	n2 = n1;	
        }
        
        else if (n3 > n1){
        	n3 = cont++;        
        }
        System.out.println("Os n�meros digitados em ordem crescente s�o: " + n1 + n2 + n3);	
	}
        
}
