package database;

public class SituacaoLeitorDTO {
	private String nome;
	private Boolean situacao;
	
	public SituacaoLeitorDTO(String nome, Boolean situacao) {
		this.situacao = situacao;
		this.nome = nome;
	}
}
