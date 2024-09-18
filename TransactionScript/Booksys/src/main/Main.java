package main;
import java.util.ArrayList;
import database.SituacaoLeitorDTO;
import domain.EfetuarEmprestimoRT;

public class Main {

	public static void main(String[] args) {
		
		SituacaoLeitorDTO st = EfetuarEmprestimoRT.iniciarEmprestimo(10);
		
	}
}
