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

        /** Atribuição de valores */
        individualPerson.name = "Laura Palmer";
        individualPerson.cpf = "987.225.467.12";
        individualPerson.homeAdress.adress = "Rua Bolinho";
        individualPerson.homeAdress.number = "17";
        individualPerson.homeAdress.zipCode = "98076-229";
        individualPerson.homeAdress.city = "Twin Peaks";
        individualPerson.homeAdress.state = "Washington";

        legalPerson.name = "Dale Cooper";
        legalPerson.cnpj = "23.098.387/0001-23";
        legalPerson.businessAdress.adress = "Rua Richard";
        legalPerson.businessAdress.number = "34";
        legalPerson.businessAdress.zipCode = "98263-098";
        legalPerson.businessAdress.city = "Twin Peaks";
        legalPerson.businessAdress.state = "Washington";
    }
}
