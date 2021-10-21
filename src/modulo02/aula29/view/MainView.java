package modulo02.aula29.view;

import modulo02.aula29.controller.IndividualPersonController;
import modulo02.aula29.controller.LegalPersonController;
import modulo02.aula29.model.Adress;
import modulo02.aula29.model.IndividualPerson;
import modulo02.aula29.model.LegalPerson;

/**
 * Crie um sistema de cadastro de Pessoa Física e Pessoa Jurídica. Tanto Pessoa
 * Física como Pessoa Jurídica devem possuir Endereço. O sistema deve utilizar o
 * padrão de arquitetura MVC. Os modelos devem possuir um id e outros atributos
 * públicos de sua escolha. As controllers devem possuir os quatro métodos de
 * CRUD e deve utilizar um ArrayList privado para manter os dados. (Utilize o
 * conceito de Generics nas Controllers). A view deve testar as operações de
 * CRUD para cada controller (Utilize dados fixo, sem entrada do usuário).
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
        Adress adress = new Adress();

        /** Atribuição de valores */
        individualPerson.name = "Laura Palmer";
        individualPerson.cpf = "987.225.467.12";
        adress.adress = "Rua Bolinho";
        adress.number = "17";
        adress.zipCode = "98076-229";
        adress.city = "Twin Peaks";
        adress.state = "Washington";
        individualPerson.homeAdress = adress;

        adress = new Adress();
        legalPerson.name = "Dale Cooper";
        legalPerson.cnpj = "23.098.387/0001-23";
        adress.adress = "Rua Richard";
        adress.number = "34";
        adress.zipCode = "98263-098";
        adress.city = "Twin Peaks";
        adress.state = "Washington";
        legalPerson.businessAdress = adress;

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
        adress.adress = "Rua Bernice";
        individualPerson.homeAdress.adress = adress.adress;
        individualController.update(individualPerson);

        adress = new Adress();
        adress.adress = "Rua Coop";
        legalPerson.businessAdress.adress = adress.adress;
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
        adress = new Adress();

        individualPersonTwo.name = "Audrey Horne";
        individualPersonTwo.cpf = "826.009.374.00";
        adress.adress = "Rua Prudence";
        adress.number = "18";
        adress.zipCode = "98273-025";
        adress.city = "Twin Peaks";
        adress.state = "Washington";
        individualPersonTwo.homeAdress = adress;

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
