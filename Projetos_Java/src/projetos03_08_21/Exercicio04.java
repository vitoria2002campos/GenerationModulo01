package projetos03_08_21;

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double N, A, R, E;
		
		System.out.println("Digite um n�mero: ");
		N = entrada.nextDouble();
		
		A = N % 2;
		R = Math.sqrt(N);
		E = Math.pow(N, 2);
		
		if(A>=1 && A<2) {
			System.out.println("O n�mero inserido � impar.");
			System.out.printf("O n�mero inserido elevado ao quadrado �: %.2f ", E);	
		}
		
		else {
			System.out.println("O n�mero inserido � par.");
			System.out.printf("A raiz quadrada do n�mero inserido �: %.2f ", R);
		}
		
		
		entrada.close();
	}

}