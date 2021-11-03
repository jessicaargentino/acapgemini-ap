package modulo03.aula06.atv02.controller;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadController {
    /**
     * Método que recebe o caminho do arquivo a ser lido por parâmetro e realiza a
     * leitura do mesmo enquanto houverem linhas.
     * 
     * @param path caminho do arquivo a ser lido
     */
    public void readFile(String path) {
        try {
            FileInputStream file = new FileInputStream(path);
            InputStreamReader reader = new InputStreamReader(file);
            BufferedReader buffer = new BufferedReader(reader);

            while (buffer.ready()) {
                String line = buffer.readLine();
                System.out.println(line);
            }
            buffer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado!");

        } catch (IOException e) {
            System.out.println("Não foi possível ler o arquivo!");
        }
    }
}
