package treinamentojava.aleatorio.bkp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Teste25 {

	public static void main(String[] args) {
		Date data = null;
		try {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
			simpleDateFormat.setLenient(false);
			data = simpleDateFormat.parse("01/10/2021");
		} catch (ParseException e) {
			throw new IllegalArgumentException("teste");
		}

		System.out.println(data);
	}

}
