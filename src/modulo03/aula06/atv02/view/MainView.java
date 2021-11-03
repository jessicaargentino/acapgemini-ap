package modulo03.aula06.atv02.view;

import modulo03.aula06.atv02.controller.ReadController;
import modulo03.aula06.atv02.controller.WritingController;

/**
 * Crie um sistema para leitura e escrita em arquivos. Crie uma classe que
 * contenha a estrutura para a leitura de um arquivo de texto, o arquivo deve
 * estar salvo em uma pasta de nome dados. Esta leitura deve conter o fluxo de
 * entrada de dados de um arquivo, um leitor de fluxo e um buffer de leitura.
 * Com o buffer, imprima as linhas do arquivo no console. Crie uma outra classe
 * que contenha a estrutura de escrita em um arquivo de texto, o arquivo deve
 * estar salvo em uma pasta de nome dados. A escrita de conter um fluxo de saída
 * para o arquivo, um forma de escrita no fluxo e um buffer de escrita. Com o
 * buffer, escreva algumas linhas dentro do arquivo texto.
 */
public class MainView {
    public static void main(String[] args) {
        /** Criação de dois objetos das classes ReadController e WritingController */
        ReadController readController = new ReadController();
        WritingController writingController = new WritingController();

        /** Chamada dos métodos de escrita e leitura */
        String path = writingController.writingFile("dados\\audiovisual.txt");
        readController.readFile(path);
    }
}
