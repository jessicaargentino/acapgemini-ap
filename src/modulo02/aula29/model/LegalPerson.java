package modulo02.aula29.model;

public class LegalPerson extends People {
    public String cnpj;

    public LegalPerson() {
        this.businessAdress = new Adress();
    }

    @Override
    public String toString() {
        return super.toString() + "\nCNPJ: " + this.cnpj + this.businessAdress.toString();
    }
}
