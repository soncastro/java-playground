package treinamentojava.ordenacao.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import treinamentojava.ordenacao.Jogador;

public class ExecutaOrdenacaoComparator {

	public static void main(String[] args) {

		List<Jogador> jogadores = new ArrayList<Jogador>();
		jogadores.add(new Jogador(4));
		jogadores.add(new Jogador(8));
		jogadores.add(new Jogador(1));
		jogadores.add(new Jogador(5));
		jogadores.add(new Jogador(9));

		System.out.println("Lista de jogadores não ordenada:");
		exibeJogadores(jogadores);
		
		Collections.sort(jogadores, new JogadorComparator());
		System.out.println("Lista de jogadores ordenada:");
		exibeJogadores(jogadores);

	}

	public static void exibeJogadores(List<Jogador> jogadores) {
		for (Jogador j : jogadores) {
			System.out.println("Jogador " + j.getNumero());
		}
	}

}
