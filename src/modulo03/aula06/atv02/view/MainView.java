package modulo03.aula06.atv02.view;

import modulo03.aula06.atv02.controller.ReadController;
import modulo03.aula06.atv02.controller.WritingController;

public class MainView {
    public static void main(String[] args) {
        /** Criação de dois objetos das classes ReadController e WritingController */
        ReadController readController = new ReadController();
        WritingController writingController = new WritingController();

        /** Chamada dos métodos de escrita e leitura */
        String path = writingController.writingFile("C:\\dados\\audiovisual.txt");
        readController.readFile(path);
    }
}
