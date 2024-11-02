package domain;

import java.util.List;

import data.CamadaDadosInterface;
import data.CamadaDadosMock;
import entities.EmprestimoDTO;
import entities.LeitorDTO;
import entities.SituacaoDTO;

public class IniciarEmprestimoRTC implements EfetuarEmprestimoRTCommandInterface {
	
	private CamadaDadosInterface dados; 
	private int idLeitor;
	
	public IniciarEmprestimoRTC(int idLeitor, CamadaDadosInterface dados) {
		this.dados = dados;
		this.idLeitor = idLeitor;
	}

	@Override
	public Object executar() {
		LeitorDTO leitor = dados.buscarLeitor(idLeitor);
		
		List<EmprestimoDTO> nc = dados.buscarNConcluidos(idLeitor);
		
		SituacaoDTO st = null;
		
		if (nc.isEmpty()) {
			String nome = leitor.getNome();
			
			st = new SituacaoDTO(nome, true);
			
			System.out.println("Iniciado com sucesso, Leitor : " + nome);
			
			return st;
		}
		
		System.out.println("Leitor não encontrado");
		
		return st;
	}
}
