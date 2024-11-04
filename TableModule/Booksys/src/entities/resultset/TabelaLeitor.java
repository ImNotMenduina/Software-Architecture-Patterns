package entities.resultset;

public class TabelaLeitor extends Tabela{
	public TabelaLeitor() {
		super("Leitor");
		
		this.addColuna("id");
		this.addColuna("nome");
		this.addColuna("situacaoLeitor");
	}
	
	public void addNovoLeitor(int idLeitor, String nomeLeitor) {
		Linha novaLinha = new LinhaTabelaLeitor(idLeitor, nomeLeitor);
		this.addLinha(novaLinha);
	}
}
