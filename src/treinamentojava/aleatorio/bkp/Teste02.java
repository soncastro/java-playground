package treinamentojava.aleatorio.bkp;

public class Teste02 {

	public static void main(String[] args) {
		
		String teste = "ABC|";
		
		String ultimo = teste.substring((teste.length() - 1), teste.length());
		System.out.println("m" + ultimo + "m");
		
		String teste2 = teste.substring(0, (teste.length() - 1));
		System.out.println(teste2);
	
		teste2 += "OPA";
		System.out.println(teste2);
	}
	
}
