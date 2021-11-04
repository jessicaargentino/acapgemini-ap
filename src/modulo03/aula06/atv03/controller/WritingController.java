package modulo03.aula06.atv03.controller;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WritingController {

    /**
     * Metódo que realiza a escrita/geração de um arquivo de texto com nomes de
     * filmes, utilizando o append true para o arquivo não ser sobreescrito.
     */
    public void writingFile() {
        FileWriter writer = null;
        try {
            writer = new FileWriter("C:\\dados\\dados.txt", true);

            writer.write("Star Wars - The Empire Strikes Back\n");
            writer.write("Twin Peaks\n");
            writer.write("El Laberinto del Fauno\n");
            writer.write("Elvira, Mistress of the Dark\n");
            writer.write("Coraline\n");
            writer.write("Fantastic Mr.Fox");

            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado!");
        } catch (IOException e) {
            System.out.println("Não foi possível ler o arquivo!");
        }
    }
}
