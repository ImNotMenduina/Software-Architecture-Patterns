package domain;

import entities.EmprestimoDTO;
import entities.SituacaoLeitorDTO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmprestimoMDS {
	private static EmprestimoMDS instance = null;
	private LeitorMDS leitor;
	private List<Integer> emprestimos;

	public static EmprestimoMDS getInstance() {
		if (instance == null) {
			instance = new EmprestimoMDS();
		}
		
		return instance;
	}
	
	private EmprestimoMDS() {
		emprestimos = new ArrayList<Integer>();
	}

	public SituacaoLeitorDTO iniciarEmprestimo(int idLeitor) {
		LeitorMDS leitor = LeitorMDS.buscarLeitor(idLeitor);
		
		SituacaoLeitorDTO st = leitor.getSituacaoAtual(leitor);

		return st;
	}

	public Date emprestarLivro(int idLivro) {
		LivroMDS livro = LivroMDS.buscarLivro(idLivro);
		
		List<EmprestimoDTO> nc = livro.buscarEmprestimosNConcluidos();
		
		if (nc.isEmpty()) {
			emprestimos.add(idLivro);
		}
		
		return calculaDataDevolucao(new Date());
	}

	private Date calculaDataDevolucao(Date dataEmprestimo) {
		Long prazo = (3600000L)*24*30;
		
		return new Date(dataEmprestimo.getTime() + prazo);
	}

	
}
