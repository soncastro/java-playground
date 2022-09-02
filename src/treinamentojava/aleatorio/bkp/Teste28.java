package treinamentojava.aleatorio.bkp;

import java.math.BigDecimal;
import java.math.MathContext;

public class Teste28 {

	public static void main(String[] args) {

		BigDecimal bg1 = new BigDecimal(2);
		BigDecimal bg2 = new BigDecimal(1);
		
		BigDecimal bg3 = bg1.divide(bg2, MathContext.DECIMAL128);
		
		System.out.println(bg3);
		System.out.println(bg3.intValue());
		
		System.out.println(bg1.compareTo(bg2) > 0);
		
	}

}
