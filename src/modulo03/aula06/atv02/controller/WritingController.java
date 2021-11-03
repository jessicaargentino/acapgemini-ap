package modulo03.aula06.atv02.controller;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class WritingController {
    /**
     * Método que recebe o caminho do arquivo a ser criado por parâmetro e realiza a
     * escrita no mesmo.
     * 
     * @param path caminho onde o arquivo escrito será salvo
     * @return caminho do arquivo lido
     */
    public String writingFile(String path) {
        try {
            FileOutputStream file = new FileOutputStream(path);
            OutputStreamWriter writer = new OutputStreamWriter(file);
            BufferedWriter buffer = new BufferedWriter(writer);

            buffer.write("Star Wars - The Empire Strikes Back\n");
            buffer.write("Twin Peaks\n");
            buffer.write("El Laberinto del Fauno\n");
            buffer.write("Elvira, Mistress of the Dark\n");
            buffer.write("Coraline\n");
            buffer.write("Fantastic Mr.Fox\n");

            buffer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado!");

        } catch (IOException e) {
            System.out.println("Não foi possível ler o arquivo!");
        }
        return path;
    }
}
