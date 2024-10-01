package main;

import java.util.ArrayList;
import java.util.List;

import domain.EmprestimoMDS;
import entities.SituacaoLeitorDTO;

public class Main {

	public static void main(String[] args) {
		int idLeitor = 10;
		List<Integer> livrosSolicitados = new ArrayList<Integer>();
		livrosSolicitados.add(1);
		
		//passo 1.1
		EmprestimoMDS md = EmprestimoMDS.getInstance();
		
		//passo 1.2
		SituacaoLeitorDTO st = md.iniciarEmprestimo(idLeitor);
		
	}

}
