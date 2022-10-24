package treinamentojava.bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Teste01 {

	public static void main(String[] args) {

		double num1 = 0.1;
		double num2 = 0.2;
		double resultadoLouco1 = num1 + num2;
	
		System.out.print("Resultado de 0.1 + 0.2 usando double: ");
		System.out.println(resultadoLouco1);
		
		BigDecimal bigDecimal1 = new BigDecimal("0.1");
		BigDecimal bigDecimal2 = new BigDecimal("0.2");
		BigDecimal resultadoSomaBigDecimal = bigDecimal1.add(bigDecimal2);
		
		System.out.print("Resultado de 0.1 + 0.2 usando BigDecimal: ");
		System.out.println(resultadoSomaBigDecimal);
		
		BigDecimal bigDecimal3 = new BigDecimal("5");
		BigDecimal bigDecimal4 = new BigDecimal("3");
		BigDecimal resultadoDivisaoBigDecimal = bigDecimal3.divide(bigDecimal4, 2, RoundingMode.UP);
				
		System.out.print("Resultado da divis�o de 5/3 usando BigDecimal: ");
		System.out.println(resultadoDivisaoBigDecimal);		
		
	}
	
}
