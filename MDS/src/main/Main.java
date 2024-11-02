package main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import domain.EmprestimoMDS;
import entities.SituacaoLeitorDTO;

public class Main {

	public static void main(String[] args) {
		int idLeitor = 10;
		int idLivro = 12;
		
		List<Integer> emprestimos = new ArrayList<Integer>();
		
		
		//init emprestimo
		EmprestimoMDS emprestimo = EmprestimoMDS.getInstance();
		
		SituacaoLeitorDTO st = emprestimo.iniciarEmprestimo(idLeitor);
		
		System.out.println(st.getNome() + " " + st.getSituacao());
		
		//emprestar
		Date dataDev = emprestimo.emprestarLivro(idLivro);
		
		//data dev 1 livro
		System.out.println(dataDev);
		
	}

}
