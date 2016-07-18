package treinamentojava.ordenacao.comparator;

import java.util.Comparator;

import treinamentojava.ordenacao.Jogador;

public class JogadorComparator implements Comparator<Jogador> {

	@Override
	public int compare(Jogador j1, Jogador j2) {

		if (j1.getNumero() < j2.getNumero()) {
			return -1;
		} else if (j1.getNumero() > j2.getNumero()) {
			return 1;
		} else {
			return 0;
		}

	}

}
