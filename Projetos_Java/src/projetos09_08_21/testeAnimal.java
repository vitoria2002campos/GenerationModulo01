package projetos09_08_21;

public class testeAnimal {

public static void main(String[] args) {
		
		Animal elefante = new Animal("Elefante" , "elefante asi�tico (Elephas maximus)", 80, "fuumm uuuuh");
		cachorro labrador = new cachorro("Cachorro", "Labrador", 10, "Auuuu", "20 km/h");
		cavalo frisio = new cavalo("Cavalo","Fr�sio", 15, "Hiin in in", "88 km/h");
		pregui�a cd = new pregui�a("Pregui�a", "Choloepus didactylus", 10, "AHHAHH", "0,27 km/h");
		
		System.out.println("Animal: " + elefante.getNome());
		System.out.println("Ra�a: " + elefante.getRa�a());
		System.out.println("Idade: " + elefante.getIdade() + " anos");
		System.out.println("Som: " + elefante.getSom());
		
		System.out.println();
		
		System.out.println("Animal: " + labrador.getNome());
		System.out.println("Ra�a: " + labrador.getRa�a());
		System.out.println("Idade: " + labrador.getIdade() + " anos");
		System.out.println("Som: " + labrador.getSom());
		System.out.println("Velocidade: consegue correr at� " + labrador.getCorrer());
		
		System.out.println();
		
		System.out.println("Animal: " + frisio.getNome());
		System.out.println("Ra�a: " + frisio.getRa�a());
		System.out.println("Idade: " + frisio.getIdade() + " anos");
		System.out.println("Som: " + frisio.getSom());
		System.out.println("Velocidade: consegue correr at� " + frisio.getCorrer());
		
		System.out.println();
		
		System.out.println("Animal: " + cd.getNome());
		System.out.println("Ra�a: " + cd.getRa�a());
		System.out.println("Idade: " + cd.getIdade() + " anos");
		System.out.println("Som: " + cd.getSom());
		System.out.println("Velocidade: consegue escalar at� " + cd.getEscalar());
		
		System.out.println();

	}

}
