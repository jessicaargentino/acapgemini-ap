package modulo02.aula32.model;

public class Product extends Base {
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

    /** Getters e setters */
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    /** Sobreescrita equals para verificar objeto pelo id */
    @Override
    public boolean equals(Object object) {
        if (object instanceof Product) {
            Product product = (Product) object;
            if (this.getId() == product.getId()) {
                return true;
            }
        }
        return false;
    }

    /** Sobreescrita toString para impressão */
    @Override
    public String toString() {
        return "\nNome: " + this.getName() + "\nMarca: " + this.getBrand() + this.getCategory() + "\nQuantidade: "
                + this.getQuantity() + String.format("\nPreço: R$%.2f", this.getPrice());
    }
}