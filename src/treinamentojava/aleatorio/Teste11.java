package treinamentojava.aleatorio;

import java.util.Calendar;

import treinamentojava.util.UtilData;

public class Teste11 {

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();
		c.set(2021, 0, 2, 1, 1, 1);
		c.set(Calendar.MILLISECOND, 1);

		Calendar c2 = Calendar.getInstance();
		c2.set(2021, 0, 3, 1, 1, 1);
		c2.set(Calendar.MILLISECOND, 1);

		System.out.println(c.getTime().equals(c2.getTime()));
		System.out.println(c.getTime().after(c2.getTime()));

		while (true) {

			Calendar c3 = Calendar.getInstance();

			System.out.println(UtilData.formatarDateParaDDMMYYYYHHMM(c3.getTime()));

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
