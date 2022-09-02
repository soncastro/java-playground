package treinamentojava.aleatorio.bkp;

public class Teste13 {

	public static void main(String[] args) {

		String teste = "12345aA";
		System.out.println(teste.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$"));

		String teste2 = "aa@saude.pe.gov.br";

	}

}
