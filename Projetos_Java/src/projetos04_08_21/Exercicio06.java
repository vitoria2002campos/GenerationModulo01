package projetos04_08_21;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		int N, S=0, total=0, contador=0;
		double media;
		try (Scanner entrada = new Scanner(System.in)) {
			do {
				System.out.println("Digite um n�mero inteiro: ");
				N = entrada.nextInt();
				S = N % 3;
				
				if(S==0 && N>0){
					total = total + N;
					contador++;
				}
				
			}while(N!=0);
			
				
		}
		
		if(contador==0){
			System.out.println("N�o foram inseridos n�meros m�ltiplos de 3.");
		}
		else {
			media = total / contador;
			System.out.println("A m�dia dos n�meros m�ltiplos de tr�s �: "+ media);
		}
		
		
		
	}

}
