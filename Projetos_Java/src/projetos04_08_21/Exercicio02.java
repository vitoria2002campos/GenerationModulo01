package projetos04_08_21;

import java.util.Scanner;

public class Exercicio02 {

public static void main(String[] args) {
		
		try (Scanner entrada = new Scanner(System.in)) {
			double N, X;
			int C=0, V=0;
			
			for(int A=0; A<10; A++) {
				
				if(A<1) {
					System.out.println("Digite dez n�meros: ");
				}
				
				N = entrada.nextDouble();
				
				X = N % 2;
				
				if(X>=1 && X<2) {
					C++;
				}
				else {
					V++;
				}
			}
				
			System.out.println("A quantidade de n�meros impares �: "+ C );
			System.out.println("A quantidade de n�meros pares �: "+ V );
			entrada.close();
		}
		
	}

}