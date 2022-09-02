package treinamentojava.aleatorio.bkp;

public class Teste08 {

	public static void main(String[] args) {

		String numeroSolicitacaoTESTE = "2021SA12345";
		//String numeroSolicitacaoTESTE = "20BCDD34A98";

		if (numeroSolicitacaoTESTE != null && !numeroSolicitacaoTESTE.trim().isEmpty()) {

			numeroSolicitacaoTESTE = numeroSolicitacaoTESTE.trim().toUpperCase();

			Integer[] numeros = new Integer[] { -1, -1 };

			if (numeroSolicitacaoTESTE.matches("[0-9]{4}[Ss][Aa][0-9]{5}")) {

				numeros[0] = Integer.parseInt(numeroSolicitacaoTESTE.split("SA")[0]);
				numeros[1] = Integer.parseInt(numeroSolicitacaoTESTE.split("SA")[1]);
			}
			
			System.out.println("::" + numeros[0] + "::");
			System.out.println("::" + numeros[1] + "::");

			//criteria.add(Restrictions.eq(SolicitacaoAquisicao.ATTR_NUMERO_SOLICITACAO_ANO, numeros[0]));
			//criteria.add(Restrictions.eq(SolicitacaoAquisicao.ATTR_NUMERO_SOLICITACAO_SEQUENCIAL, numeros[1]));
		}

	}

}
