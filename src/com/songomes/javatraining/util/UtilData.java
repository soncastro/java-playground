package com.songomes.javatraining.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
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

	public static Date parseToDateComFormatYYYYMMDDTHHmm(String dataHoraMinutoYYYYMMDDTHHmm) {

		if (dataHoraMinutoYYYYMMDDTHHmm == null || dataHoraMinutoYYYYMMDDTHHmm.trim().isEmpty()) {
			return null;
		}

		dataHoraMinutoYYYYMMDDTHHmm = dataHoraMinutoYYYYMMDDTHHmm.trim();

		String[] dataHora = dataHoraMinutoYYYYMMDDTHHmm.split("T");

		Date data = null;
		try {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
			simpleDateFormat.setLenient(false);
			data = simpleDateFormat.parse(dataHora[0]);
		} catch (ParseException e) {
			throw new IllegalArgumentException(e.getMessage());
		}

		Calendar calDataHora = Calendar.getInstance();
		calDataHora.setTime(data);
		calDataHora.set(Calendar.HOUR_OF_DAY, Integer.parseInt(dataHora[1].split(":")[0]));
		calDataHora.set(Calendar.MINUTE, Integer.parseInt(dataHora[1].split(":")[1]));
		calDataHora.set(Calendar.SECOND, 0);
		calDataHora.set(Calendar.MILLISECOND, 0);

		return calDataHora.getTime();
	}
}
