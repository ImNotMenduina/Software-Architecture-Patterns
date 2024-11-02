package entities;

public class SituacaoLeitorDTO {
	private String nome;
	private boolean situacao;
	
	public SituacaoLeitorDTO(String nome, boolean b) {
		this.nome = nome;
		this.situacao = b;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public boolean getSituacao() {
		return this.situacao;
	}
}
