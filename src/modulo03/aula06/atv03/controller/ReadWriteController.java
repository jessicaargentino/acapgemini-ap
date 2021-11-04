package modulo03.aula06.atv03.controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class ReadWriteController {

    /**
     * Método que realiza a leitura/entrada de dados através do console e
     * escreve/grava os dados em um arquivo de texto denomidado de dados.txt. A
     * entrada de dados é interrompida ao ser digitado "FIM/fim".
     */
    public void generateFile() {
        try {
            InputStream in = System.in;
            Reader reader = new InputStreamReader(in);
            BufferedReader bufferOne = new BufferedReader(reader);

            OutputStream fileOut = new FileOutputStream("C:\\dados\\dados.txt");
            Writer writer = new OutputStreamWriter(fileOut);
            BufferedWriter bufferTwo = new BufferedWriter(writer);

            String line = bufferOne.readLine();
            while (line != null && !line.equals("FIM") && !line.equals("fim")) {
                bufferTwo.write(line + "\n");
                line = bufferOne.readLine();
            }

            bufferOne.close();
            bufferTwo.close();

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado!");

        } catch (IOException e) {
            System.out.println("Não foi possível ler o arquivo!");
        }
    }
}