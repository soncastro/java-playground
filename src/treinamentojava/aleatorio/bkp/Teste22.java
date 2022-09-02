package treinamentojava.aleatorio.bkp;

import org.apache.commons.lang.exception.ExceptionUtils;

public class Teste22 {

	public static void main(String[] args) {
		
		try {
			
			throw new IllegalArgumentException("teste");
			
		}
		catch (Exception e) {
			
			String s = ExceptionUtils.getStackTrace(e);
			System.out.println(s);
			
		}
		
	}

}
