package projetos09_08_21;

public class pregui�a extends Animal{
	private String escalar;
	

	public pregui�a (String nome, String ra�a, int idade, String som, String escalar) {
		super(nome, ra�a, idade, som);
		this.setEscalar(escalar);
	
	}
	
	public String getEscalar() {
		return escalar;
	}
	
	public void setEscalar(String escalar) {
		this.escalar = escalar;
	}
	
	
	
}
