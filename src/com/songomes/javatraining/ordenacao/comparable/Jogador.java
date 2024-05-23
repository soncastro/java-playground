package com.songomes.javatraining.ordenacao.comparable;

public class Jogador implements Comparable<Jogador> {

	private int numero;

	public Jogador(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public int compareTo(Jogador j) {

		if (this.getNumero() < j.getNumero()) {
			return -1;
		} else if (this.getNumero() > j.getNumero()) {
			return 1;
		} else {
			return 0;
		}

	}

}
