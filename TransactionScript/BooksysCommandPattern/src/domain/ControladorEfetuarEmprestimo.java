package domain;

import java.util.List;

import data.CamadaDadosInterface;
import data.CamadaDadosMock;

public class ControladorEfetuarEmprestimo {
	CamadaDadosInterface dados = new CamadaDadosMock();
	
	public enum Tipos {
		INICIAR_EMPRESTIMO, 
		EMPRESTAR_LIVRO,
		ENCERRAR_EMPRESTIMO
	}
	
	public Object servico(Tipos tipoServico, int idLeitor) {
		switch (tipoServico) {
			case INICIAR_EMPRESTIMO:
				EfetuarEmprestimoRTCommandInterface commandRT;
				
				commandRT = new IniciarEmprestimoRTC(idLeitor, dados);
				
				return commandRT.executar();

			default:
				return null;
		}
	}
	
	public Object servico(Tipos tipoServico, int id, List<Integer> emprestimos) {
		EfetuarEmprestimoRTCommandInterface commandRT;
		
		switch(tipoServico) {
			case EMPRESTAR_LIVRO:
				commandRT = new EmprestarLivroRTC(id, dados, emprestimos);
				
				return commandRT.executar();
				
			case ENCERRAR_EMPRESTIMO:
				commandRT = new EncerrarEmprestimoRTC(id, dados, emprestimos);
				
				return commandRT.executar();
				
			default:	
				return null;
		}
	}
}
