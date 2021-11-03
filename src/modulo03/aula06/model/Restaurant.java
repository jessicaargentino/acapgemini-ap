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
}
