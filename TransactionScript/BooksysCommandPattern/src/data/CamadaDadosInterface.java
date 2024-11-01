package data;

import java.util.Date;
import java.util.List;

import entities.LivroDTO;
import entities.EmprestimoDTO;
import entities.LeitorDTO;

public interface CamadaDadosInterface {
	public List<EmprestimoDTO> buscarNConcluidos(int idLeitor);
	public LeitorDTO buscarLeitor(int idLeitor);
	public LivroDTO buscarLivro(Integer idLivro);
	public List<EmprestimoDTO> buscarEmpLivroNConcluidos(Integer idLivro);
	public void armazenaEmprestimoLivro(int idLeitor, Integer idLivro, Date dataAtual, Date calculaDataDevolucao);
}
