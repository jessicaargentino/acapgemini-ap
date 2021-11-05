package modulo03.aula07.atv01.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import modulo03.aula07.atv01.model.Company;

public class CompanyController {
    /**
     * Método que recebe o caminho onde será criado o arquivo e o objeto da classe e
     * realiza a criação do mesmo, através da escrita do objeto Company em String.
     * 
     * @param path caminho onde o arquivo será criado
     * @param c    objeto de Company
     */
    public void createFile(String path, Company c) {
        try {
            FileWriter write = new FileWriter(path, true);
            write.write(c.toString());
            write.close();
        } catch (IOException e) {
            System.out.println("Não foi possível ler o arquivo!");
        }
    }

    /**
     * Método que recebe o caminho onde se encontra o arquivo a ser lido e realiza a
     * leitura do mesmo, armazenando os dados em um array de String utilizando o
     * split. Após isso, os dados são convertidos para objetos, sendo salvos nos
     * respectivos atributos da classe Company e os mesmos são impressos na tela.
     * 
     * @param path caminho onde se encontra o arquivo a ser lido
     */
    public void readFile(String path) {
        try {
            Scanner input = new Scanner(new File(path));
            while (input.hasNextLine()) {
                String line = input.nextLine();
                String[] companyItems = line.split(";");
                Company c = new Company();
                c.name = companyItems[0];
                c.cpnj = companyItems[1];
                c.branch = companyItems[2];
                System.out.printf("\nNome: %s\nCNPJ: %s\nRamo: %s", c.name, c.cpnj, c.branch);
            }
            input.close();
        } catch (FileNotFoundException e) {
            System.out.println("Não foi possível ler o arquivo, arquivo não encontrado!");
        }
    }
}
