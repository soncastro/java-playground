package treinamentojava.ordenacao.comparator;

import java.util.Comparator;

public class CarroComparator implements Comparator<Carro> {

	@Override
	public int compare(Carro c1, Carro c2) {

		if (c1.getNumero() < c2.getNumero()) {
			return -1;
		} else if (c1.getNumero() > c2.getNumero()) {
			return 1;
		} else {
			return 0;
		}

	}

}
