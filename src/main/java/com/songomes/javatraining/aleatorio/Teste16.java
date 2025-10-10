package com.songomes.javatraining.aleatorio;

import java.io.*;
import java.nio.charset.Charset;

public class Teste16 {

    public static void main(String[] args) {
        // 1️⃣ Verificando o encoding padrão do sistema
        System.out.println("Encoding padrão do sistema: " + Charset.defaultCharset());

        // 2️⃣ Criando um arquivo com caracteres acentuados
        String conteudo = "Olá, mundo! 🌎\nTeste de acentuação: á é í ó ú ç ã õ";

        File arquivo = new File("teste_utf8.txt");

        // 3️⃣ Escrevendo no arquivo usando UTF-8
        try (BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream(arquivo), "UTF-8"))) {
            writer.write(conteudo);
            System.out.println("Arquivo escrito com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 4️⃣ Lendo o arquivo de volta usando UTF-8
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream(arquivo), "UTF-8"))) {

            System.out.println("Conteúdo do arquivo:");
            String linha;
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
