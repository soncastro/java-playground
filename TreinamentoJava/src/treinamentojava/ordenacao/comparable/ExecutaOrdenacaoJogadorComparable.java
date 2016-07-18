package treinamentojava.ordenacao.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import treinamentojava.ordenacao.comparator.Carro;

public class ExecutaOrdenacaoJogadorComparable {

	public static void main(String[] args) {

		List<Jogador> jogadores = new ArrayList<Jogador>();
		jogadores.add(new Jogador(3));
		jogadores.add(new Jogador(2));
		jogadores.add(new Jogador(9));
		jogadores.add(new Jogador(1));
		jogadores.add(new Jogador(7));
		
		System.out.println("Lista de jogadores não ordenada:");
		exibeJogadores(jogadores);
		
		Collections.sort(jogadores);
		System.out.println("Lista de jogadores ordenada:");
		exibeJogadores(jogadores);

	}

	public static void exibeJogadores(List<Jogador> jogadores) {
		for (Jogador j : jogadores) {
			System.out.println("Jogador " + j.getNumero());
		}
	}

}
