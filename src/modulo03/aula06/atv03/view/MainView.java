package modulo03.aula06.atv03.view;

import modulo03.aula06.atv03.controller.ReadWriteController;

/**
 * Crie um sistema para leitura e escrita de dados. Crie uma classe que contenha
 * a estrutura para a leitura de dados através do terminal. Esta leitura deve
 * conter o fluxo de entrada de dados do terminal, um leitor de fluxo e um
 * buffer de leitura. Crie uma estrutura para escrita em arquivo. A estrutura
 * deve conter um fluxo de saída de dados para arquivo, um forma de escrita no
 * fluxo e um buffer de escrita. Com o buffer, escreva algumas linhas dentro do
 * arquivo texto. Utilize o buffer de leitura como fonte de entrada para o
 * buffer de escrita, ou seja, a entrada será o terminal e a saída o arquivo
 * texto.
 */
public class MainView {
    public static void main(String[] args) {
        /** Criação de um objeto da classe ReadWriteController */
        ReadWriteController rwController = new ReadWriteController();

        /** Chamada do método para entrada de dados e geração de arquivo */
        System.out.println("***** ESCRITA DE ARQUIVOS *****");
        System.out.println("O arquivo gerado será salvo na pasta C:\\dados - Digite FIM para encerrar\n");
        rwController.generateFile();
    }
}
