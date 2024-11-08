package domain;

public class Pessoa {
	private String nome;
	private Pet pet;
	
	public Pessoa(String nome, Pet pet) {
		this.nome = nome;
		this.pet = pet;
	}
	
	@Override
	public String toString() {
		String tipo;
		
		if (pet instanceof Gato) {
			tipo = "gato";
		} else {
			tipo  = "gachorro";
		}
		
		return "Meu nome eh " + 
				nome + 
				" e eu tenho um " +
				tipo + 
				" ele " + 
				pet.falar() + 
				", " + 
				pet.andar() + 
				" e quando fica nervoso, " + 
				pet.atacar() +
				". Mas fora isso, ele ama " + 
				pet.alimentar() + 
				" e ele " + 
				pet.banhar();
	}
}
