package main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import domain.EfetuarEmprestimoRT;
import entities.SituacaoDTO;

public class App {

	public static void main(String[] args) {
		int idLeitor = 55;
		List<Integer> livrosSolicitados = new ArrayList<Integer>();
		livrosSolicitados.add(12);
		
		List<Integer> emprestimos = new ArrayList<Integer>();
		EfetuarEmprestimoRT roteiro = new EfetuarEmprestimoRT();
		
		SituacaoDTO st = roteiro.iniciarEmprestimo(idLeitor);
		
		for (Integer idLivro : livrosSolicitados) {
			Date dataDev = roteiro.emprestarLivro(idLivro, emprestimos);
			System.out.println("devolucao: " + dataDev.toString());
		}
		
		roteiro.encerrarEmprestimo(idLeitor, emprestimos);
	}

}
