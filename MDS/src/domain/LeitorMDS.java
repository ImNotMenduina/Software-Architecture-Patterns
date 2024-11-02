package domain;

import java.util.List;

import data.CamadaDadosInterface;
import data.CamadaDadosMock;
import entities.EmprestimoDTO;
import entities.LeitorDTO;
import entities.SituacaoLeitorDTO;

public class LeitorMDS {
	private static CamadaDadosInterface dados = new CamadaDadosMock();
	private static LeitorMDS instance = null;
	private int idLeitor;
	private String nome;
	
	public LeitorMDS(int idLeitor) {
		this.idLeitor = idLeitor;
	}

	public static LeitorMDS getInstance(int idLeitor) {
		if (instance == null) {
			return new LeitorMDS(idLeitor);
		}
		
		return instance;
	}

	public static LeitorMDS buscarLeitor(int idLeitor) {
		LeitorDTO leitorDto = dados.buscarLeitor(idLeitor);
		
		LeitorMDS leitor = LeitorMDS.getInstance(idLeitor);
		leitor.nome = leitorDto.getNome();
		
		return leitor;
	}

	public SituacaoLeitorDTO getSituacaoAtual(LeitorMDS leitor) {
		List<EmprestimoDTO> nc  = dados.buscaNConcluidos(idLeitor);
		
		if (nc.isEmpty()) {
			return new SituacaoLeitorDTO(nome ,true);
		}
		return null;
	}

}
