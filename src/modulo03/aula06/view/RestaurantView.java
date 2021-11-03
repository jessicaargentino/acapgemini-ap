package modulo03.aula06.view;

import modulo03.aula06.controller.RestaurantController;
import modulo03.aula06.model.Restaurant;

/**
 * Crie um sistema java para cadastro de pratos. O projeto deve utilizar MVC.
 * Utilize uma classe abstrata base model para manter o id. Utilize uma classe
 * abstrata base repository para realizar as operações de crud. Na View, teste
 * todos os metodos do Crud com dados fixos, sem a necessidade de menu ou
 * leitura e escrita pelo terminal.
 */
public class RestaurantView {
    public static void main(String[] args) {
        /** Criação de um objeto da classe RestaurantController e Restaurant */
        RestaurantController restaurantController = new RestaurantController();
        Restaurant restaurant = new Restaurant();

        /** Atribuição de valores e adição no ArrayList */
        restaurant.setName("Nhoque ao gorgonzola");
        restaurant.setDescription("Massa de batata inglesa com queijo gorgonzola");
        restaurant.setPrice(29.90);
        restaurantController.create(restaurant);

        /** Impressão dos objetos */
        System.out.println("***** CAP CANTEEN *****");
        for (Restaurant r : restaurantController.read()) {
            System.out.println(r);
        }

        /** Criação de um novo objeto, atribuição de valores e adição no ArrayList */
        Restaurant restaurantTwo = new Restaurant();
        restaurantTwo.setName("Salada Caesar");
        restaurantTwo.setDescription("Salada de alface com croutons, azeite e queijo parmesão");
        restaurantTwo.setPrice(22.99);
        restaurantController.create(restaurantTwo);

        /** Reimpressão dos objetos */
        System.out.println("***** CAP CANTEEN *****");
        for (Restaurant r : restaurantController.read()) {
            System.out.println(r);
        }

        /** Alteração do preço do objeto restaurantTwo */
        restaurantTwo.setPrice(19.99);
        restaurantController.update(restaurantTwo);

        /** Reimpressão dos objetos */
        System.out.println("***** CAP CANTEEN *****");
        for (Restaurant r : restaurantController.read()) {
            System.out.println(r);
        }

        /** Exclusão do objeto restaurant */
        restaurantController.delete(restaurant);

        /** Reimpressão dos objetos */
        System.out.println("***** CAP CANTEEN *****");
        for (Restaurant r : restaurantController.read()) {
            System.out.println(r);
        }
    }
}
