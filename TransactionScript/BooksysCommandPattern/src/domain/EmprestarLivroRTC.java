package domain;

import java.util.Date;
import java.util.List;

import data.CamadaDadosInterface;
import entities.EmprestimoDTO;
import entities.LivroDTO;

public class EmprestarLivroRTC implements EfetuarEmprestimoRTCommandInterface{
	
	private int idLivro;
	private CamadaDadosInterface dados; 
	private List<Integer> emprestimos;
	
	public EmprestarLivroRTC (int idLivro, CamadaDadosInterface dados, List<Integer> emprestimos) {
		this.idLivro = idLivro;
		this.dados = dados;
		this.emprestimos = emprestimos;
	}
	
	@Override
	public Object executar() {

		LivroDTO livro = dados.buscarLivro(idLivro);
		
		List<EmprestimoDTO> nc = dados.buscarEmpLivroNConcluidos(idLivro);
		
		if (nc.isEmpty()) {
			emprestimos.add(idLivro);
		}
		
		System.out.println("Emprestado com sucesso");
		
		return EfetuarEmprestimoRTCommandInterface.calculaDataDevolucao(new Date());
	}
}
