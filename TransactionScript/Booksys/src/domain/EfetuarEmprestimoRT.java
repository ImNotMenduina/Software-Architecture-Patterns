package domain;

import java.util.List;

import database.EmprestimoDTO;
import database.LeitorDTO;
import database.SituacaoLeitorDTO;

// Roteiro de Transacao
public class EfetuarEmprestimoRT {

	public static SituacaoLeitorDTO iniciarEmprestimo(int i) {
		// busca o leitor em uma database
		LeitorDTO leitorDto;
		try {
			leitorDto = LeitorDTO.buscarLeitor(i);
			System.out.println("-- sucesso, o leitor existe --");
		} catch (Exception e) {
			System.out.println("-- erro, leitor inexistente --");
			return null;
		}
		
		// verifica se o leitor possui emprestimos em aberto
		List<EmprestimoDTO> emprestimos = EmprestimoDTO.buscarNConcluidos(leitorDto);
		
		if (emprestimos.size() == 0) {
			// retorna a situacao
			SituacaoLeitorDTO st = new SituacaoLeitorDTO(leitorDto.getNome(), true);
			return st;
		}
		return null;
	}
}
