package data;

import java.util.Date;
import java.util.List;

import entities.EmprestimoDTO;
import entities.LeitorDTO;
import entities.LivroDTO;

//Fachada
public interface CamadaDadosInterface {
	LeitorDTO buscarLeitor( int idLeitor );
	List<EmprestimoDTO> buscaNConcluidos( int idLeitor );
	LivroDTO buscarLivro( int idLivro );
	List<EmprestimoDTO> buscaEmpLivroNConcluidos ( int idLivro );
	void armazenaEmprestimoLivro(int idLeitor, Integer idLivro, Date dataEmprestimo, Date dataDevolucao);
}
