package domain;

public class Gato extends Pet implements PetInterface {
	public Gato(String nome, String dono, int patas, int idade) {
		super(nome, dono, patas, idade);
	}
	
	@Override
	public String falar() {
		return "Mia: MIAU MIAU MIAU";
	}

	@Override
	public String andar() {
		return "Anda Estiloso";
	}

	@Override
	public String atacar() {
		return "Mostra as garras";
	}

	@Override
	public String alimentar() {
		return "atum e peixe";
	}

	@Override
	public String banhar() {
		return "odeia tomar banho";
	}
	
}
