package database;

public class LeitorDTO{
	private String nome;
	private int id;
	
	private LeitorDTO(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	public static LeitorDTO buscarLeitor(int i) throws Exception{
		LeitorDTO leitor = new LeitorDTO(i, "nome");
		return leitor;
	}
	
	public String getNome() {
		return this.nome;
	}
}
