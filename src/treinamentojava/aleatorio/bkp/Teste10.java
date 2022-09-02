package treinamentojava.aleatorio.bkp;

public class Teste10 {

	public static void main(String[] args) {
		
		String str1 = "teste1";
		String str2 = "teste1";
		System.out.println("teste1 com == : " + (str1 == str2));
		System.out.println("teste1 com equals : " + (str1.equals(str2)));
		
		System.out.println();
		
		String str3 = new String("teste2");
		String str4 = new String("teste2");
		System.out.println("teste2 com == : " + (str3 == str4));
		System.out.println("teste2 com equals : " + (str3.equals(str4)));
		
	}
	
}
