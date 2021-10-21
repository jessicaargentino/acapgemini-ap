package modulo02.aula29.model;

public abstract class People {
    public int id;
    public static int counter = 0;
    public String name;
    public Adress homeAdress;
    public Adress businessAdress;

    public People() {
        this.id = counter++;
    }

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