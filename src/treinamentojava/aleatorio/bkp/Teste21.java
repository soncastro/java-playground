package treinamentojava.aleatorio.bkp;

public class Teste21 {

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
	
		TipoRespostaHomologacaoDocumentoConvocacaoEnum teste2 = TipoRespostaHomologacaoDocumentoConvocacaoEnum.valueOf("NAO");
		System.out.println(teste2 != null);
		System.out.println(teste2);
	}

}