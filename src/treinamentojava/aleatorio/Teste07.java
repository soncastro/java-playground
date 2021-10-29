package treinamentojava.aleatorio;

public class Teste07 {

	public static void main(String[] args) {
		
		String regex = "[0-9]{4}SA[0-9]{5}";
		
		String teste1 = "2021SA12345";
		String teste2 = "2021SA2345";
		
		System.out.println(teste1.matches(regex));
		System.out.println(teste2.matches(regex));
		
	}
	
}
