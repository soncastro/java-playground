package treinamentojava.aleatorio;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Teste19 {

	public enum TipoRespostaHomologacaoDocumentoConvocacaoEnum {

		SIM(1L), //
		NAO(2L), //
		NA(3L); //

		private final Long id;

		private TipoRespostaHomologacaoDocumentoConvocacaoEnum(Long id) {
			this.id = id;
		}

		public Long getId() {
			return this.id;
		}
	}

	public static void main(String[] args) {

		Boolean valorTrue = Boolean.valueOf("true");
		Boolean valorFalse = Boolean.valueOf("false");

		System.out.println(valorTrue);
		System.out.println(valorFalse);
		System.out.println(Boolean.FALSE.toString());

		System.out.println(TipoRespostaHomologacaoDocumentoConvocacaoEnum.NA.toString());

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		cal2.add(Calendar.DAY_OF_MONTH, 3);
		System.out.println(sdf.format(cal1.getTime()));
		System.out.println(sdf.format(cal2.getTime()));
	}

}
