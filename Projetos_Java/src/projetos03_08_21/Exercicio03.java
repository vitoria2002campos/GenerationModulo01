package projetos03_08_21;

import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int N;
		
		System.out.println("Digite sua idade somente em anos: ");
		N = entrada.nextInt();
		
		if(N>=5 && N<=7) {
			System.out.println("Sua categoria na nata��o � a INFANTIL A.");
		}
		if(N>=8 && N<=11) {
			System.out.println("Sua categoria na nata��o � a INFANTIL B.");
		}
		if(N>=12 && N<=13) {
			System.out.println("Sua categoria na nata��o � a JUVENIL A.");
		}
		if(N>=14 && N<=17) {
			System.out.println("Sua categoria na nata��o � a JUVENIL B.");
		}
		if(N>=18) {
			System.out.println("Sua categoria na nata��o � a ADULTO.");
		}
		if(N<5) {
			System.out.println("De acordo com sua idade voc� n�o possui categoria para nata��o.");
		}
		
		
		entrada.close();
	}

}