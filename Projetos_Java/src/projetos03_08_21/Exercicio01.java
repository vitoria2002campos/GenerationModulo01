package projetos03_08_21;

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int a, b, c, M=0;
		
		System.out.println("Digite tr�s n�meros ? ");
		a = entrada.nextInt();
		b = entrada.nextInt();
		c = entrada.nextInt();
		
		if(a>M) {
			M=a;
		}
		if(b>M) {
			M=b;
		}
		if(c>M) {
			M=c;
		}
				
		System.out.println("O maior n�mero �: "+ M);
		
		entrada.close();
		
		
	}	
			
}