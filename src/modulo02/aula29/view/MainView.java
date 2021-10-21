package modulo02.aula29.view;

import modulo02.aula29.controller.IndividualPersonController;
import modulo02.aula29.controller.LegalPersonController;
import modulo02.aula29.model.IndividualPerson;
import modulo02.aula29.model.LegalPerson;

public class MainView {
    public static void main(String[] args) {
        /**
         * Instância dos controllers e dos objetos das classes IndividualPerson e
         * LegalPerson
         */
        IndividualPersonController individualController = new IndividualPersonController();
        LegalPersonController legalController = new LegalPersonController();
        IndividualPerson individualPerson = new IndividualPerson();
        LegalPerson legalPerson = new LegalPerson();
    }
}
