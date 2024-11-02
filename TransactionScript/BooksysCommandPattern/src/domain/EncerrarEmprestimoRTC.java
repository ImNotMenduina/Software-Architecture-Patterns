package domain;

import java.util.Date;
import java.util.List;

import data.CamadaDadosInterface;
import entities.EmprestimoDTO;
import entities.LivroDTO;

public class EncerrarEmprestimoRTC implements EfetuarEmprestimoRTCommandInterface{
	
	private List<Integer> emprestimos;
	private CamadaDadosInterface dados;
	private int idLeitor;
	
	public EncerrarEmprestimoRTC(int idLeitor, CamadaDadosInterface dados, List<Integer> emprestimos) {
		this.idLeitor = idLeitor;
		this.dados = dados;
		this.emprestimos = emprestimos;
	}
	

	@Override
	public Object executar() {
		for (Integer idLivro : emprestimos) {
					
			LivroDTO livro = dados.buscarLivro(idLivro);
			
			List<EmprestimoDTO> nc = dados.buscarEmpLivroNConcluidos(idLivro);
			
			if (nc.isEmpty()) {
				Date dataAtual = new Date();
				
				dados.armazenaEmprestimoLivro(this.idLeitor, idLivro, dataAtual, EfetuarEmprestimoRTCommandInterface.calculaDataDevolucao(dataAtual));
			}
		}
		
		System.out.println("Encerrado com sucesso");
		
		return null;
	}
	
}
