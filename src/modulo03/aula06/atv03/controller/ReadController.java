package modulo03.aula06.atv03.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadController {

    /**
     * Método que recebe o caminho do arquivo por parâmetro e realiza a leitura e
     * impressão do mesmo no console.
     * 
     * @param path caminho do arquivo a ser lido
     */
    public void readFile(String path) {
        try {
            Scanner input = new Scanner(new File(path));
            while (input.hasNextLine()) {
                System.out.println(input.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado!");
        }
    }
}