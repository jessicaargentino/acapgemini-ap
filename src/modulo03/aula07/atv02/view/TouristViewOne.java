package modulo03.aula07.atv02.view;

import modulo03.aula07.atv02.controller.TouristAttractionController;
import modulo03.aula07.atv02.model.TouristAttraction;

/**
 * Crie um sistema para cadastro de Pontos Turísticos. A classe de modelo deve
 * possuir três atributos públicos: nome, descrição e localização. Crie uma
 * interface que contenha os métodos de leitura e gravação de dados para pontos
 * turísticos. Crie duas implementações da interface. Uma que usará um lista
 * para armazenar os dados e outra que utilizará um arquivo texto como fonte de
 * dados. Crie duas classes View para testar cada uma das implementações
 * criadas.
 */
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
