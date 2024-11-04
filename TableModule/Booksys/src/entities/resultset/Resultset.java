package entities.resultset;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Resultset {
	private Map<String, Tabela> tabelas;

	public Resultset() {
		tabelas = new HashMap<String, Tabela>();
	}
	
	public void addTabela(String nomeTabela, Tabela novaTabela) {
		tabelas.put(nomeTabela, novaTabela);
	}
	
	public Tabela getTabela(String nomeTabela) {
		return tabelas.get(nomeTabela);
	}
	
	public Iterator<Linha> getLinhas(String nomeTabela) {
		Tabela tabela = getTabela(nomeTabela);
		return tabela.iterator();
	}
}
