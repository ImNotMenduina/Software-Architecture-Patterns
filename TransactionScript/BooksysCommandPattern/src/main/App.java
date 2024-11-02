package main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import domain.ControladorEfetuarEmprestimo;
import domain.EfetuarEmprestimoRT;
import entities.SituacaoDTO;

public class App {

	public static void main(String[] args) {
		int idLeitor = 55;
		List<Integer> livrosSolicitados = new ArrayList<Integer>();
		livrosSolicitados.add(12);
		
		List<Integer> emprestimos = new ArrayList<Integer>();
		ControladorEfetuarEmprestimo control = new ControladorEfetuarEmprestimo();
		
		
		SituacaoDTO st = (SituacaoDTO) control.servico(ControladorEfetuarEmprestimo.Tipos.INICIAR_EMPRESTIMO, idLeitor);

		
		for (Integer idLivro : livrosSolicitados) {
			Date dataDev = (Date) control.servico(ControladorEfetuarEmprestimo.Tipos.EMPRESTAR_LIVRO, idLivro, emprestimos);
			System.out.println("devolucao: " + dataDev.toString());
		}
		
		control.servico(ControladorEfetuarEmprestimo.Tipos.ENCERRAR_EMPRESTIMO, idLeitor, emprestimos);
	}

}
