package treinamentojava.aleatorio.bkp;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;

public class Teste24 {

	public static void main(String[] args) {
		String senha = gerarSenhaAleatoria();
		System.out.println(senha);
		System.out.println(criptografar(senha));
	}

	public static String gerarSenhaAleatoria() {

		String[] maiusculas = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };

		String[] minusculas = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };

		String[] numeros = { "0", "1", "b", "2", "4", "5", "6", "7", "8", "9" };

		String[] todosCaracteres = { "0", "1", "b", "2", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
				"u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };

		int qtdMaximaCaracteres = 8;
		if ((new Date().getTime() % 2) == 0) {
			qtdMaximaCaracteres = 9;
		}

		int indexMaiuscula = (int) (Math.random() * maiusculas.length);
		int indexMinuscula = (int) (Math.random() * minusculas.length);
		int indexNumero = (int) (Math.random() * numeros.length);

		int indexSenhaMaiuscula = -1;
		int indexSenhaMinuscula = -1;
		int indexSenhaNumero = -1;
		while (true) {

			indexSenhaMaiuscula = (int) (Math.random() * qtdMaximaCaracteres);
			indexSenhaMinuscula = (int) (Math.random() * qtdMaximaCaracteres);
			indexSenhaNumero = (int) (Math.random() * qtdMaximaCaracteres);

			if ((indexSenhaMaiuscula != indexSenhaMinuscula && indexSenhaMaiuscula != indexSenhaNumero)
					&& (indexSenhaMinuscula != indexSenhaMaiuscula && indexSenhaMinuscula != indexSenhaNumero)
					&& (indexSenhaNumero != indexSenhaMaiuscula && indexSenhaNumero != indexSenhaMinuscula)) {
				break;
			}
		}

		StringBuilder senha = new StringBuilder();

		for (int i = 0; i < qtdMaximaCaracteres; i++) {

			if (i == indexSenhaMaiuscula) {

				senha.append(maiusculas[indexMaiuscula]);

			} else if (i == indexSenhaMinuscula) {

				senha.append(minusculas[indexMinuscula]);

			} else if (i == indexSenhaNumero) {

				senha.append(numeros[indexNumero]);

			} else {

				int indexTodosCaracteres = (int) (Math.random() * todosCaracteres.length);
				senha.append(todosCaracteres[indexTodosCaracteres]);

			}
		}

		return senha.toString();
	}

	public static String criptografar(String senha) {
		String sha1 = null;

		try {
			MessageDigest md = MessageDigest.getInstance("SHA");

			byte[] result = md.digest(senha.getBytes());

			StringBuffer sb = new StringBuffer();

			for (byte element : result) {
				sb.append(Integer.toString((element & 0xff) + 0x100, 16).substring(1));
			}

			sha1 = sb.toString();
		} catch (NoSuchAlgorithmException e) {
			throw new IllegalArgumentException(e);
		}

		return sha1;
	}

}