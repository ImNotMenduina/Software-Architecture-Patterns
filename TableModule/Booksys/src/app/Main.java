package app;

import java.util.Iterator;

import entities.resultset.Linha;
import entities.resultset.Resultset;
import entities.resultset.TabelaLeitor;

public class Main {

	public static void main(String[] args) {
		int idLeitor = 25;
			
		TabelaLeitor tabelaLeitor = new TabelaLeitor();
		Resultset rs = new Resultset();	
		
		rs.addTabela("leitor", tabelaLeitor);
		tabelaLeitor.addNovoLeitor(12, "Serjão");
		tabelaLeitor.addNovoLeitor(23, "Jão");
		tabelaLeitor.addNovoLeitor(43, "Menduinix");
		tabelaLeitor.addNovoLeitor(55, "Lucas");
		
		Iterator<Linha> leitores = rs.getLinhas("leitor");
		
		while(leitores.hasNext()) {
			Linha linha = leitores.next();
			int id = linha.getInt("idLeitor");
			String nome = linha.getString("nome");
			System.out.println("id: " + id + ", nome: " + nome);
		}
		
	}

}
