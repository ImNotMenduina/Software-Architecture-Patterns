package entities;

public class LeitorDTO {
	private Integer idLeitor;
	private String nome;
	
	public LeitorDTO(int idLeitor, String nome) {
		this.idLeitor = idLeitor;
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}
	
	public Integer getId() {
		return this.idLeitor;
	}
}
