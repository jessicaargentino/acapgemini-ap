package modulo03.aula07.atv02.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import modulo03.aula07.atv02.dao.BaseMethods;
import modulo03.aula07.atv02.model.TouristAttraction;

public class TouristAttractionController implements BaseMethods<TouristAttraction> {

    /**
     * Método que recebe um objeto de TouristAttraction e realiza a criação de um
     * arquivo txt com as informações do mesmo.
     * 
     * @param t objeto de TouristAttraction
     */
    @Override
    public String save(TouristAttraction t) {
        FileWriter write;
        try {
            write = new FileWriter("C:\\dados\\dados.txt", true);
            write.write(t.toString());
            write.close();
        } catch (IOException e) {
            System.out.println("Não foi possível ler o arquivo!");
        }
        return "Arquivo criado com sucesso!";
    }

    /**
     * Método que realiza a leitura do arquivo onde o objeto de TouristAttraction
     * está salvo e o armazena em um ArrayList de TouristAttraction.
     * 
     * @return objeto de String armazenado no ArrayList
     */
    @Override
    public ArrayList<TouristAttraction> read() {
        ArrayList<TouristAttraction> data = new ArrayList<TouristAttraction>();
        try {
            Scanner input = new Scanner(new File("C:\\dados\\dados.txt"));
            while (input.hasNextLine()) {
                String line = input.nextLine();
                data.add(new TouristAttraction(line));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Não foi possível ler o arquivo, arquivo não encontrado!");
        }
        return data;
    }
}
