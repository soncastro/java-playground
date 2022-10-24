package treinamentojava.bigdecimal;

import java.math.BigDecimal;
import java.math.MathContext;

public class Teste02 {

	public static void main(String[] args) {
		
		Double teste = 2.99999;
		BigDecimal bd = new BigDecimal(teste, MathContext.DECIMAL128);
		System.out.println(bd.intValue());
	}
	
}
