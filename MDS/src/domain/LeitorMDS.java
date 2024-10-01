package domain;

import entities.SituacaoLeitorDTO;

public class LeitorMDS {
	private static LeitorMDS instance = null;
	
	private LeitorMDS() {}
	
	public static LeitorMDS getInstance() {
		if (instance == null)
			return new LeitorMDS();
		return instance;
	}

	public static LeitorMDS buscarLeitor(int idLeitor) {
		return null;
	}

	public SituacaoLeitorDTO getSituacaoAtual() {
		return null;
	}

}
