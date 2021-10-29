//package treinamentojava.file;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.math.BigDecimal;
//import java.util.Scanner;
//
//import treinamentojava.temp.Util;
//
//public class ReadFile {
//
//	public static void main(String[] args) {
//		try {
//			
////			BigDecimal teste = new BigDecimal(123422345);
////			String retorno = Util.removerPontoERetornarCom2CasasDecimais(teste);
////			System.out.println("A" + retorno + "A");
////			
////			String teste2 = Util.removeAllExceptNumbers((1) + "");
////			System.out.println(teste2);
////			
////			if (true) {
////				return;
////			}
////			
//			
//			File myObj = new File("res/PG07072020.REM");
//			Scanner myReader = new Scanner(myObj);
//			
//			BigDecimal somatorio = BigDecimal.ZERO;
//			
//			int i = 0;
//			while (myReader.hasNextLine()) {
//				i++;
//				String linha = myReader.nextLine();
//				
//				//if (i > 2) {
//				if (i >= 1787) {
//					break;
//				}		
//				else if (i == 1) {
//					continue;
//				}
//				
//				//System.out.println(data);
//				//String valor = linha.substring(195, 204);
//				String valor2 = linha.substring((195 - 1), 202) + "." + linha.substring((203 -1), 204);
//				//System.out.println(valor2);
//				
//				if (!valor2.contains("2964.08")) {
//					System.out.println(valor2);
//				}
//				
//				BigDecimal bigDecimalValor = new BigDecimal(valor2);
//				
//				somatorio = somatorio.add(bigDecimalValor);
//				
//			}
//			
//			myReader.close();
//			
////			System.out.println(somatorio);
////			
////			System.out.println("double value:");
////			System.out.println(somatorio.doubleValue());
//			
//			// Total dos Valores de pagamento
//			String valorDocumento = Util.removeAllExceptNumbers(somatorio.doubleValue() + "");
//			System.out.println("valorDocumento:" + valorDocumento);
//			Integer valorTotalPagamento = Integer.parseInt(valorDocumento);
//			String valorTotal = valorTotalPagamento.toString();
//
//			while (valorTotal.length() < 17) {
//				valorTotal = "0" + valorTotal;
//			}
//			System.out.println(valorTotal);
//			
//			///
//			///
//			///
//			// Total dos Valores de pagamento
////			String valorDocumento2 = Util.removerPontoERetornarCom2CasasDecimais(somatorio);
////			System.out.println("valorDocumento:" + valorDocumento2);
////			Integer valorTotalPagamento2 = Integer.parseInt(valorDocumento2);
////			String valorTotal2 = valorTotalPagamento2.toString();
////
////			while (valorTotal2.length() < 17) {
////				valorTotal2 = "0" + valorTotal2;
////			}
////			System.out.println(valorTotal2);
//			
//			
//		} catch (FileNotFoundException e) {
//			System.out.println("An error occurred.");
//			e.printStackTrace();
//		}
//	}
//}
