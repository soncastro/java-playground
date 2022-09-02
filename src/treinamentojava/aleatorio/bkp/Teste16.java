package treinamentojava.aleatorio.bkp;

public class Teste16 {

	public static void main(String[] args) {
		insertionSort();
	}

	public static void insertionSort() {

		int[] vetor = { 4, 7, 2, 8, 3, 9, 5 };
		for (int v : vetor) {
			System.out.println(v);
		}

		for (int i = 1; i < vetor.length; i++) {

			int aux = vetor[i];
			int j = i;

			while ((j > 0) && (vetor[j - 1] > aux)) {
				vetor[j] = vetor[j - 1];
				j -= 1;
			}
			vetor[j] = aux;
		}
		
		System.out.println("-----------");

		for (int v : vetor) {
			System.out.println(v);
		}
	}

}
