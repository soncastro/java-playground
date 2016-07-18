package treinamentojava.ordenacao.ricardo;

import java.util.ArrayList;
import java.util.List;

public class ClasseRicardo {

	public static void calcular() {
				
	List<ItemVendaSimulator> listaItensVenda = new ArrayList<ItemVendaSimulator>();
	
	 int tamanho = listaItensVenda.size();
	 double aux;
	 System.out.println(tamanho);
	
	
	 for (int i = tamanho - 1; i >= 1; i--) {
	
	 for (int j = 0; j < i; j++) {
	
	 if (listaItensVenda.get(j).getJan() > listaItensVenda.get(j +
	 1).getJan()){
	
	 aux = listaItensVenda.get(j).getJan();
	 List listaItensVenda.get(j).setJan(listaItensVenda.get(j+1);
	 listaItensVenda.get(j+1) = aux;
	 }
	 }
	
	 System.out.println("Numero UA: " + listaItensVenda.get(i).getNumeroUa() +
	 " Mes Janeiro " + "Vazao: "
	 + listaItensVenda.get(i).getJan());
	
	 }

}
}
