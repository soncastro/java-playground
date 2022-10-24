package treinamentojava.bigdecimal;

import java.math.BigDecimal;
import java.math.MathContext;

public class Teste03 {

	public static void main(String[] args) {

		BigDecimal teste01 = new BigDecimal(4, MathContext.DECIMAL128);
		BigDecimal teste02 = new BigDecimal(2, MathContext.DECIMAL128);
		
		BigDecimal teste03 = teste01.add(teste02,  MathContext.DECIMAL128);
		System.out.println(teste02);
	}

}
