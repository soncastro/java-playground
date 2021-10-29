package treinamentojava.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UtilData {

	public static String formatarDateParaDDMMYYYYHHMM(Date dataDDMMYYYYHHMM) {

		if (dataDDMMYYYYHHMM == null) {
			return null;
		}

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		String dataFormatada = simpleDateFormat.format(dataDDMMYYYYHHMM);
		return dataFormatada;
	}
}
