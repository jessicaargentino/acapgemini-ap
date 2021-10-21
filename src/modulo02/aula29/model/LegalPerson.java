package modulo02.aula29.model;

public class LegalPerson extends People {
    public String cnpj;

    @Override
    public String toString() {
        return super.toString() + "\nCNPJ: " + this.cnpj;
    }
}
