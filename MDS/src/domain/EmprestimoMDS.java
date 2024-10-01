package domain;

import entities.SituacaoLeitorDTO;

public class EmprestimoMDS {
	private static EmprestimoMDS instance = null;
	
	private EmprestimoMDS() {}
	
	public static EmprestimoMDS getInstance() {
		if (instance == null)
			return new EmprestimoMDS();
		return instance;
	}
	
	public SituacaoLeitorDTO iniciarEmprestimo(int idLeitor)
	{
		LeitorMDS leitor = LeitorMDS.buscarLeitor(idLeitor);
		SituacaoLeitorDTO st = leitor.getSituacaoAtual();
		return st;
	}
	
}
