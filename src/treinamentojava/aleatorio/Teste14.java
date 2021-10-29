package treinamentojava.aleatorio;

import java.util.Arrays;
import java.util.List;

public class Teste14 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(5, 3, 50, 24, 40, 2, 9, 18);

		numbers.stream().sorted((a, b) -> a.compareTo(b));
		numbers.stream().sorted(Integer::compareTo);

	}

}
