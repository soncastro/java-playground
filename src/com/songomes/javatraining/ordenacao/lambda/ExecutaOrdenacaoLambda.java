package com.songomes.javatraining.ordenacao.lambda;

import java.util.ArrayList;
import java.util.List;

public class ExecutaOrdenacaoLambda {

	public static void main(String[] args) {

		List<Item> itens = new ArrayList<>();
		itens.add(new Item(3));
		itens.add(new Item(1));
		itens.add(new Item(5));
		itens.add(new Item(2));
		itens.add(new Item(4));

		System.out.println("Lista n�o ordenada:");
		// Express�o lambda
		itens.forEach(item -> System.out.println(item.getNumero()));

		// Ordenando com lambda
		itens.sort((Item item1, Item item2) -> {
			if (item1.getNumero() < item2.getNumero()) {
				return -1;
			} else if (item1.getNumero() > item2.getNumero()) {
				return 1;
			} else {
				return 0;
			}
		});

		System.out.println("Lista ordenada:");
		// Express�o lambda
		itens.forEach(item -> System.out.println(item.getNumero()));

	}

}
