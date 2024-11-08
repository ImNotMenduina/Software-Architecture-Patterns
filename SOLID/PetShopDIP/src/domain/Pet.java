package domain;

public abstract class Pet {
	protected String nome;
	protected String dono;
	protected int patas;
	protected int idade;
	
	public Pet(String nome, String dono, int patas, int idade) {
		this.nome = nome;
		this.dono = dono;
		this.patas = patas;
		this.idade = idade;
	}
	
	public abstract String alimentar();
	public abstract String banhar();
	public abstract String falar();
	public abstract String andar();
	public abstract String atacar();
}
