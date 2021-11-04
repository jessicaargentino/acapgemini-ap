package modulo03.aula07.atv02.view;

import modulo03.aula07.atv02.controller.TouristAttractionController;
import modulo03.aula07.atv02.model.TouristAttraction;

public class TouristViewOne {
    public static void main(String[] args) {
        /**
         * Criação de dois objetos das classes TouristAttractionController e
         * TouristAttraction respectivamente
         */
        TouristAttractionController tController = new TouristAttractionController();
        TouristAttraction tourist = new TouristAttraction();

        /** Atribuição de valores */
        tourist.name = "Instituto Inhotim";
        tourist.description = "Museu de arte contemporânea e Jardim Botânico mineiro";
        tourist.location = "Brumadinho, MG";

        /** Métodos de salvar e leitura */
        tController.save(tourist);

        for (TouristAttraction t : tController.read()) {
            System.out.println(t);
        }

    }
}
