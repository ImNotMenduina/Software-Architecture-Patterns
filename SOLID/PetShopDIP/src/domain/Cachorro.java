package domain;

public class Cachorro extends Pet implements PetInterface{
	
	public Cachorro(String nome, String dono, int patas, int idade) {
		super(nome, dono, patas, idade);
	}

	@Override
	public String falar() {
		return "Late: AU AU AU";
	}

	@Override
	public String andar() {
		return "Corre";
	}

	@Override
	public String atacar() {
		return "Morde";
	}

	@Override
	public String alimentar() {
		return "racao";
	}

	@Override
	public String banhar() {
		return "banho de mangueira";
	}
	
}
