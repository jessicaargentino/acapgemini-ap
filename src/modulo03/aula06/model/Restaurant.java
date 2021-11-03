package modulo03.aula06.model;

public class Restaurant extends BaseModel {
    private String name;
    private String description;
    private double price;

    /** Getters e setters */
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
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
        if (object instanceof Restaurant) {
            Restaurant restaurant = (Restaurant) object;
            if (this.getId() == restaurant.getId()) {
                return true;
            }
        }
        return false;
    }

    /** Sobreescrita toString para impressão dos dados */
    @Override
    public String toString() {
        return "ID: " + this.getId() + "\nPrato: " + this.getName() + "\nDescrição: " + this.getDescription()
                + String.format("\nPreço: R$%.2f", this.getPrice()) + "\n";
    }
}
