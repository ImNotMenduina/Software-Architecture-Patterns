package data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.EmprestimoDTO;
import entities.LeitorDTO;
import entities.LivroDTO;

public class CamadaDadosMock implements CamadaDadosInterface {

	@Override
	public List<EmprestimoDTO> buscarNConcluidos(int idLeitor) {
		return new ArrayList<EmprestimoDTO>();
	}

	@Override
	public LeitorDTO buscarLeitor(int idLeitor) {
		return new LeitorDTO(idLeitor, "Pablo Escobinho");
	}

	@Override
	public LivroDTO buscarLivro(Integer idLivro) {
		return new LivroDTO(idLivro);
	}

	@Override
	public List<EmprestimoDTO> buscarEmpLivroNConcluidos(Integer idLivro) {
		return new ArrayList<EmprestimoDTO>();
	}

	@Override
	public void armazenaEmprestimoLivro(int idLeitor, Integer idLivro, Date dataAtual, Date calculaDataDevolucao) {
		//faz nada
	}

}
