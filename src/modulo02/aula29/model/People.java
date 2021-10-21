package modulo02.aula29.model;

public abstract class People extends Base {
    public String name;
    public Adress homeAdress;
    public Adress businessAdress;

    @Override
    public boolean equals(Object object) {
        if (object instanceof People) {
            People people = (People) object;
            if (this.id == people.id) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "\nID: " + this.id + "\nNome: " + this.name + "\nEndereço residencial: " + this.homeAdress
                + "\nEndereço comercial: " + this.businessAdress;
    }
}