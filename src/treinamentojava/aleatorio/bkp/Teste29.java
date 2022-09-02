package treinamentojava.aleatorio.bkp;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Teste29 {

	public static void main(String[] args) {

		Calendar calPos1 = Calendar.getInstance();
		Calendar calPos2 = Calendar.getInstance();
		Calendar calPos3 = Calendar.getInstance();
		Calendar calPos4 = Calendar.getInstance();
		Calendar calPos5 = Calendar.getInstance();

		calPos1.set(Calendar.YEAR, 2008);
		calPos2.set(Calendar.YEAR, 2002);
		calPos3.set(Calendar.YEAR, 2105);
		calPos4.set(Calendar.YEAR, 2000);
		calPos5.set(Calendar.YEAR, 2010);

		List<Calendar> datas = new ArrayList<Calendar>();
		datas.add(calPos1);
		datas.add(calPos2);
		datas.add(calPos3);
		datas.add(calPos4);
		datas.add(calPos5);

		Calendar ultimaData = null;

		for (Calendar c1 : datas) {
			for (Calendar c2 : datas) {
				if (ultimaData == null || c1.after(c2) && c1.after(ultimaData)) {
					ultimaData = c1;
				}
			}
		}

		System.out.println(ultimaData);
		System.out.println(formatarDateParaDDMMYYYYHHMMSS(ultimaData.getTime()));
	}

	public static String formatarDateParaDDMMYYYYHHMMSS(Date dataDDMMYYYYHHMMSS) {

		if (dataDDMMYYYYHHMMSS == null) {
			return null;
		}

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String dataFormatada = simpleDateFormat.format(dataDDMMYYYYHHMMSS);
		return dataFormatada;
	}

}
