package modulo03.aula06.view;

import modulo03.aula06.controller.RestaurantController;
import modulo03.aula06.model.Restaurant;

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

        /** Impressão do objeto */
        System.out.println("***** CAP CANTEEN *****");
        for (Restaurant r : restaurantController.read()) {
            System.out.println(r);
        }

        

    }
}
