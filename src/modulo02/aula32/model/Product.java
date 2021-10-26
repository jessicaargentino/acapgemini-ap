package modulo02.aula32.model;

import modulo02.aula32.model.Category;

public abstract class Product extends Base {
    private String name;
    private String brand;
    private Category category;
    private int quantity;
    private double price;

    /**
     * Construtor - Cria uma instância da classe Category a cada instância de
     * Product
     */
    public Product() {
        category = new Category();
    }

}