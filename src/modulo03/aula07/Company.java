package modulo03.aula07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Company {
    public String name;
    public String cpnj;
    public String branch;

    /**
     * Método que recebe o caminho onde será criado o arquivo e realiza a criação do
     * mesmo, através da escrita do objeto Company em String.
     * 
     * @param path caminho onde o arquivo será criado
     */
    public void createFile(String path) {
        try {
            FileWriter write = new FileWriter(path, true);
            write.write(toString());
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
        } catch (FileNotFoundException e) {
            System.out.println("Não foi possível ler o arquivo, arquivo não encontrado!");
        }
    }

    @Override
    public String toString() {
        return this.name + ";" + this.cpnj + ";" + this.branch;
    }
}