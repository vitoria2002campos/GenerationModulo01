package projetos04_08_21;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		double N, S=0.0;
		try (Scanner entrada = new Scanner(System.in)) {
			do {
				System.out.println("Digite o n�mero desejado para ser somado a outros: ");
				N = entrada.nextDouble();
				S = S + N;
				
			}while(N!=0.0);
		}
		
		System.out.println("A soma dos n�meros inseridos �: "+ S);
		
		
	}

}