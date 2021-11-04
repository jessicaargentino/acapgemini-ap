package modulo03.aula06.atv03.view;

import modulo03.aula06.atv03.controller.ReadController;
import modulo03.aula06.atv03.controller.WritingController;

/**
 * Crie um sistema para leitura e escrita em arquivos. Crie uma classe que
 * contenha a estrutura para a leitura de um arquivo de texto, o arquivo deve
 * estar salvo em uma pasta de nome dados. Esta leitura deve utilizar a classe
 * Scanner para ler os dados do arquivo. Imprima todas as linhas no terminal.
 * Crie uma outra classe que contenha a estrutura de escrita em um arquivo de
 * texto, o arquivo deve estar salvo em uma pasta de nome dados. A escrita deve
 * utilizar a classe FileWriter para salvar novas linhas no arquivo. Utilize a
 * opção de append para que o arquivo não seja reescrito.
 */
public class MainTwoView {
    public static void main(String[] args) {
        /** Criação de dois objetos das classes ReadController e WritingController */
        ReadController readController = new ReadController();
        WritingController writingController = new WritingController();

        /** Chamada dos métodos de escrita e leitura */
        System.out.println("***** LEITURA DE ARQUIVOS *****\n");
        String path = writingController.writingFile();
        readController.readFile(path);
    }
}
