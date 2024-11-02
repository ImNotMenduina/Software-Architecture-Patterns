package entities;

public class LeitorDTO {
	private int idLeitor;
	private String nome;

	public LeitorDTO(int idLeitor, String nome) {
		this.idLeitor = idLeitor;
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}
	
}
