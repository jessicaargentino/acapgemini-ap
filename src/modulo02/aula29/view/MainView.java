package modulo02.aula29.view;

import modulo02.aula29.controller.IndividualPersonController;
import modulo02.aula29.controller.LegalPersonController;
import modulo02.aula29.model.IndividualPerson;
import modulo02.aula29.model.LegalPerson;

/**
 * Crie um sistema de cadastro de Pessoa Física e Pessoa Jurídica. Tanto Pessoa
 * Física como Pessoa Jurídica devem possuir Endereço. O sistema deve utilizar o
 * padrão de arquitetura MVC. Os modelos devem possuir um id e outros atributos
 * públicos de sua escolha. As controllers devem possuir os quatro métodos de
 * CRUD e deve utilizar um ArrayList privado para manter os dados. (Utilize o
 * conceito de Generics nas Controllers). A view deve testar as operações de
 * CRUD para cada controller (Utilize dados fixo, sem entrada do usuário)
 */
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

        /** Adição no ArrayList */
        individualController.create(individualPerson);
        legalController.create(legalPerson);

        /** Impressão dos objetos no ArrayList */
        System.out.println("***** PESSOAS INICIAIS *****");
        for (IndividualPerson i : individualController.read()) {
            System.out.println(i);
        }

        for (LegalPerson l : legalController.read()) {
            System.out.println(l);
        }

        /** Update dos dois objetos alterando o nome da rua */
        individualPerson.homeAdress.adress = "Rua Bernice";
        individualController.update(individualPerson);

        legalPerson.businessAdress.adress = "Rua Coop";
        legalController.update(legalPerson);

        /** Impressão dos objetos no ArrayList */
        System.out.println("\n***** PESSOAS COM RUA ALTERADA *****");
        for (IndividualPerson i : individualController.read()) {
            System.out.println(i);
        }

        for (LegalPerson l : legalController.read()) {
            System.out.println(l);
        }

        /** Criando uma nova IndividualPerson */
        IndividualPerson individualPersonTwo = new IndividualPerson();

        individualPersonTwo.name = "Audrey Horne";
        individualPersonTwo.cpf = "826.009.374.00";
        individualPersonTwo.homeAdress.adress = "Rua Prudence";
        individualPersonTwo.homeAdress.number = "18";
        individualPersonTwo.homeAdress.zipCode = "98273-025";
        individualPersonTwo.homeAdress.city = "Twin Peaks";
        individualPersonTwo.homeAdress.state = "Washington";

        /** Adição no ArrayList */
        individualController.create(individualPersonTwo);

        /** Impressão dos objetos no ArrayList */
        System.out.println("\n***** PESSOAS COM NOVA PESSOA CRIADA *****");
        for (IndividualPerson i : individualController.read()) {
            System.out.println(i);
        }

        for (LegalPerson l : legalController.read()) {
            System.out.println(l);
        }

        /** Excluindo um filme e uma série */
        individualController.delete(individualPerson);
        legalController.delete(legalPerson);

        /** Reimpressão dos objetos no ArrayList */
        System.out.println("\n***** PESSOAS APÓS A EXCLUSÃO *****");
        for (IndividualPerson i : individualController.read()) {
            System.out.println(i);
        }

        for (LegalPerson l : legalController.read()) {
            System.out.println(l);
        }
    }
}
