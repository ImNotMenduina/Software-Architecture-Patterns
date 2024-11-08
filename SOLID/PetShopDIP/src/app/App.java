package app;

import domain.Cachorro;
import domain.Gato;
import domain.Pessoa;

public class App {
	//Inversão de dependencia : Tem como objetivo tirar a responsabilidade das classes em buscar por suas dependências. 
	//A dependencia será "injetada" pelo método construtor.
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Lucas", new Cachorro("Max", "Lucas", 4, 4));
		Pessoa pessoa2 = new Pessoa("Valeria", new Gato("Garfield", "Valeria", 1, 2));
		System.out.println(pessoa1.toString());
		System.out.println(pessoa2.toString());
	}

}
