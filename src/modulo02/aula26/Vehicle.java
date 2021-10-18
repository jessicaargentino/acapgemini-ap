package modulo02.aula26;

public class Vehicle {
    public String brand;
    public String model;
    public String plate;

    @Override
    public String toString() {
        return "\nMarca: " + this.brand + "\nModelo: " + this.model + "\nPlaca: " + this.plate;
    }
}