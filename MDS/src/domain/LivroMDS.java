package domain;

import java.util.ArrayList;
import java.util.List;

import data.CamadaDadosInterface;
import data.CamadaDadosMock;
import entities.EmprestimoDTO;
import entities.LivroDTO;

public class LivroMDS {
	private static CamadaDadosInterface dados = new CamadaDadosMock();
	private static LivroMDS instance = null;
	private int idLivro;
	
	private LivroMDS(int idLivro) {
		this.idLivro = idLivro;
	}

	public static LivroMDS getInstance(int idLivro) {
		if (instance == null) {
			instance = new LivroMDS(idLivro);
		}
		
		return instance;
	}
	
	public static LivroMDS buscarLivro(int idLivro) {
		LivroDTO livroDto = dados.buscarLivro(idLivro);
		
		LivroMDS livro = LivroMDS.getInstance(idLivro);
		
		return livro;
	}

	public List<EmprestimoDTO> buscarEmprestimosNConcluidos() {
		List<EmprestimoDTO> nc = dados.buscaEmpLivroNConcluidos(idLivro);
		
		return nc;
	}

	
	
}
