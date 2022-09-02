package treinamentojava.aleatorio.bkp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Teste30 {

	public static void main(String[] args) {
		System.out.println(formatarCEP("12345678"));
	}
	
	public static String formatarCEP(String cep) {
		if ((cep != null) && !cep.isEmpty()) {
			Pattern pattern = Pattern.compile("(\\d{5})(\\d{3})");
			Matcher matcher = pattern.matcher(cep);

			if (matcher.matches()) {
				cep = matcher.replaceAll("$1-$2");
			}

			return cep;
		}

		return null;
	}
}
