package treinamentojava.aleatorio.bkp;

import java.util.InputMismatchException;

public class Teste26 {

	public static void main(String[] args) {

		System.out.println(validarCPF("03702289445"));
		
		String teste = "131l0kjndsfksf9832u42hfolds";
		teste.replaceAll("[^0-9]*$", "");
		System.out.println(teste);
	}

	public static boolean validarCPF(String cpf) {

		if (cpf == null) {
			return false;
		}

		cpf = removerFormatacaoCPF(cpf.trim());

		// considera-se erro CPF formados por uma sequencia de numeros iguais
		if (cpf.equals("00000000000") || cpf.equals("11111111111") || cpf.equals("22222222222") || cpf.equals("33333333333") || cpf.equals("44444444444") || cpf.equals("55555555555")
				|| cpf.equals("66666666666") || cpf.equals("77777777777") || cpf.equals("88888888888") || cpf.equals("99999999999") || (cpf.length() != 11)) {
			return (false);
		}

		char dig10, dig11;
		int sm, i, r, num, peso;

		try {

			// Calculo do 1o. Digito Verificador
			sm = 0;
			peso = 10;
			for (i = 0; i < 9; i++) {
				// converte o i-esimo caractere do cpf em um numero:
				// por exemplo, transforma o caractere '0' no inteiro 0
				// (48 eh a posicao de '0' na tabela ASCII)
				num = cpf.charAt(i) - 48;
				sm = sm + (num * peso);
				peso = peso - 1;
			}

			r = 11 - (sm % 11);
			if ((r == 10) || (r == 11)) {
				dig10 = '0';
			} else {
				dig10 = (char) (r + 48); // converte no respectivo caractere
			}
			// numerico
			// Calculo do 2o. Digito Verificador
			sm = 0;
			peso = 11;
			for (i = 0; i < 10; i++) {
				num = cpf.charAt(i) - 48;
				sm = sm + (num * peso);
				peso = peso - 1;
			}
			r = 11 - (sm % 11);
			if ((r == 10) || (r == 11)) {
				dig11 = '0';
			} else {
				dig11 = (char) (r + 48);
			}
			// Verifica se os digitos calculados conferem com os digitos
			// informados.
			if ((dig10 == cpf.charAt(9)) && (dig11 == cpf.charAt(10))) {
				return (true);
			} else {
				return (false);
			}
		} catch (InputMismatchException erro) {
			return (false);
		}
	}

	public static String removerFormatacaoCPF(String cpf) {
		cpf = cpf.replace(".", "");
		cpf = cpf.replace("-", "");
		return cpf;
	}

}