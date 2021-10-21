package modulo02.aula29.model;

public class IndividualPerson extends People {
    public String cpf;

    @Override
    public String toString() {
        return super.toString() + "\nCPF: " + this.cpf + this.homeAdress.toString();
    }
}
