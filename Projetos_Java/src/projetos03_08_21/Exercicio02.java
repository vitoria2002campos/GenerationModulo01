package projetos03_08_21;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double A, B, C;
		
		System.out.println("Digite tr�s n�meros: ");
		A = entrada.nextInt();
		B = entrada.nextInt();
		C = entrada.nextInt();
		
		if(A <= B && B <= C) {
			System.out.println("A ordem crescente �: \n" + A +", "+ B +", "+ C);
		}
		else if(A <= C && C <= B) {
			System.out.println("A ordem crescente �: \n" + A +", "+ C +", "+ B);
		}
		else if(B <= A && A <= C) {
			System.out.println("A ordem crescente �: \n" + B +", "+ A +", "+ C);
		}
		else if(B <= C && C <= A) {
			System.out.println("A ordem crescente �: \n" + B +", "+ C +", "+ A);
		}
		else if(C <= A && A <= B) {
			System.out.println("A ordem crescente �: \n" + C +", "+ A +", "+ B);
		}
		else {
			System.out.println("A ordem crescente �: \n" + C +", "+ B +", "+ A);
		}
		
		
		entrada.close();
	}

}