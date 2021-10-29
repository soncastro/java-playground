package treinamentojava.aleatorio;

import java.util.Calendar;

public class Teste04 {

	public static void main(String[] args) {

//		Teste04 teste04 = new Teste04();
//		for (int i = 0; i < 5; i++) {
//			System.out.println(teste04.teste());
//		}

		Thread t1 = new Thread() {
			@Override
			public void run() {

				Teste04 teste04 = new Teste04();
				for (int i = 0; i < 5; i++) {
					System.out.println("t1:" + teste04.teste());
				}
			}
		};

		Thread t2 = new Thread() {
			@Override
			public void run() {

				Teste04 teste04 = new Teste04();
				for (int i = 0; i < 5; i++) {
					System.out.println("t2:" + teste04.teste());
				}
			}
		};

		t1.start();
		t2.start();
	}

//	public void teste2() {
//
//		for (int i = 0; i < 5; i++) {
//			System.out.println(this.teste());
//		}
//	}

	public String teste() {

//		String codigoIdentificacao = "";

		synchronized (Teste04.class) {

			Calendar dataInsercao = Calendar.getInstance();
			String codigoIdentificacao = dataInsercao.get(Calendar.DAY_OF_MONTH) + "" + (dataInsercao.get(Calendar.MONTH) + 1) + "" + dataInsercao.get(Calendar.YEAR) + ""
					+ dataInsercao.get(Calendar.HOUR_OF_DAY) + "" + dataInsercao.get(Calendar.MINUTE) + "" + dataInsercao.get(Calendar.SECOND);

			try {
				Thread.sleep(1100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return codigoIdentificacao;
		}
	}

}
