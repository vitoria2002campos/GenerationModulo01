package projetos09_08_21;

public class Animal {
		private String nome;
		private String ra�a;
		private int idade;
		private String som;
		
		
		public Animal (String nome, String ra�a, int idade, String som) {
			this.nome = nome;
			this.ra�a = ra�a; 
			this.idade = idade;
			this.som = som;
		}
		
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public int getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}

		public String getSom() {
			return som;
		}

		public void setSom(String som) {
			this.som = som;
		}

		public String getRa�a() {
			return ra�a;
		}

		public void setRa�a(String ra�a) {
			this.ra�a = ra�a;
		}
		
		
		
}