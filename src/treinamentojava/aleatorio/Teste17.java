package treinamentojava.aleatorio;

public class Teste17 {

	public static void main(String[] args) {
		
		String arquivo = "arquivo.pDf";
		
		System.out.println("---" + arquivo.substring(arquivo.lastIndexOf(".")).toLowerCase() + "---");
		
		
		StringBuilder sql = new StringBuilder();
		sql.append("TESTE");
		System.out.println(sql.toString());
	}
	
}
