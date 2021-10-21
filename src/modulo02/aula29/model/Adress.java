package modulo02.aula29.model;

public class Adress extends Base {
    public String adress;
    public String number;
    public String zipCode;
    public String city;
    public String state;

    @Override
    public String toString() {
        return String.format("\nEndereço: %s, nº %s", this.adress, this.number) + "\nCEP: " + this.zipCode
                + "\nCidade: " + this.city + "\nEstado: " + this.state;
    }
}