package domain;

import java.util.List;

import data.CamadaDadosInterface;
import data.CamadaDadosMock;
import entities.EmprestimoDTO;
import entities.LeitorDTO;
import entities.LivroDTO;
import entities.SituacaoDTO;
import java.util.Date;

public class EfetuarEmprestimoRT {
	public CamadaDadosInterface dados = new CamadaDadosMock(); 

	public SituacaoDTO iniciarEmprestimo(int idLeitor) {
		LeitorDTO leitor = dados.buscarLeitor(idLeitor);
		
		List<EmprestimoDTO> nc = dados.buscarNConcluidos(idLeitor);
		
		SituacaoDTO st = null;
		
		if (nc.isEmpty()) {
			String nome = leitor.getNome();
			
			st = new SituacaoDTO(nome, true);
			
			return st;
		}
		
		return st;
	}
	
	private Date calculaDataDevolucao(Date dataEmprestimo) {
		Long prazo = (3600000L) * 24 * 30;
		
		return new Date(dataEmprestimo.getTime() + prazo);
	}

	public Date emprestarLivro(Integer idLivro, List<Integer> emprestimos) {
		LivroDTO livro = dados.buscarLivro(idLivro);
		
		List<EmprestimoDTO> nc = dados.buscarEmpLivroNConcluidos(idLivro);
		
		if (nc.isEmpty()) {
			emprestimos.add(idLivro);
		}
		
		return calculaDataDevolucao(new Date());
	}


	public void encerrarEmprestimo(int idLeitor, List<Integer> emprestimos) {
		for (Integer idLivro : emprestimos) {
			
			LivroDTO livro = dados.buscarLivro(idLivro);
			
			List<EmprestimoDTO> nc = dados.buscarEmpLivroNConcluidos(idLivro);
			
			if (nc.isEmpty()) {
				Date dataAtual = new Date();
				
				dados.armazenaEmprestimoLivro(idLeitor, idLivro, dataAtual, calculaDataDevolucao(dataAtual));
			}
		}
	}
	
}
