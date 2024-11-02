package domain;

import java.util.Date;

public interface EfetuarEmprestimoRTCommandInterface {
	Object executar();
	
	public static Date calculaDataDevolucao(Date dataEmprestimo) {
		Long prazo = (3600000L) * 24 * 30;
		
		return new Date(dataEmprestimo.getTime() + prazo);
	}
}
