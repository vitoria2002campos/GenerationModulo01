package projetos09_08_21;

public class cavalo extends Animal{
	private String correr;
	
	
	public cavalo (String nome, String ra�a, int idade, String som, String correr) {
		super(nome, ra�a, idade, som);
		this.setCorrer(correr);
	
	}

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}
	
	
	
	
}
