package treinamentojava.ordenacao.ricardo;

import java.util.ArrayList;
import java.util.List;

public class ClasseRicardo {

	public static void main(String[] args) {
		calcular();
	}

	public static void calcular() {

		List<ItemVendaSimulator> listaItensVenda = new ArrayList<ItemVendaSimulator>();
		listaItensVenda.add(new ItemVendaSimulator(3));
		listaItensVenda.add(new ItemVendaSimulator(9));
		listaItensVenda.add(new ItemVendaSimulator(1));
		listaItensVenda.add(new ItemVendaSimulator(6));
		listaItensVenda.add(new ItemVendaSimulator(2));
		listaItensVenda.add(new ItemVendaSimulator(5));
		listaItensVenda.add(new ItemVendaSimulator(4));

		System.out.println("Lista não ordenada:");
		exibeValores(listaItensVenda);

		for (int i = 0; i < listaItensVenda.size(); i++) {
			for (int j = 0; j < listaItensVenda.size(); j++) {

				if (listaItensVenda.get(i).getJan() < listaItensVenda.get(j).getJan()) {

					ItemVendaSimulator itemVendaTemp = listaItensVenda.get(i);
					listaItensVenda.set(i, listaItensVenda.get(j));
					listaItensVenda.set(j, itemVendaTemp);
				}
			}
		}

		System.out.println("Lista ordenada:");
		exibeValores(listaItensVenda);

	}

	public static void exibeValores(List<ItemVendaSimulator> listaItensVenda) {

		for (ItemVendaSimulator itemVnd : listaItensVenda) {
			System.out.println("Numero UA: " + itemVnd.getNumeroUa() + " Mes Janeiro " + "Vazao: " + itemVnd.getJan());
		}
	}

}