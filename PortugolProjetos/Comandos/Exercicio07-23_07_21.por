programa
{
	
		inclua biblioteca Matematica -> mat
	
	funcao inicio ()
	{
		real a, b, c, d, v, f, x, y

		escreva ("Qual o valor de a:")
		leia (a)
		escrever ("Qual o valor de b:")
		leia (b)
		escrever ("Qual o valor de c:")
		leia (c)
		escrever ("Qual o valor de d:")
		leia (d)
		escrever ("Qual o valor de e:")
		leia (v)
		escrever ("Qual o valor de f:")
		leia (f)

		x = ((c * v) - (b * f)) / ((a * v) - (b * d))
		y = ((a * f) - (c * d)) / ((a * v) - (b * d))

		escrever ("O valor de x é:" + mat.arredondar (x, 2))
		escreva ("\ nO valor de y é:" + mat.arredondar (y, 2))

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 14; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */