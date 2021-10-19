package modulo02.aula27;

public class People {
    public String name;
    public String lastName;
    public short age;

    /**
     * Sobreescrita do método equals para comparar os atributos específicos do
     * objeto
     * 
     * @param obj objeto de uma classe
     */
    @Override
    public boolean equals(Object obj) {
        People people = (People) obj;
        if (this.name.equals(people.name) && this.lastName.equals(people.lastName) && this.age == people.age) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return String.format("\nNome: %s %s", this.name, this.lastName) + "\nIdade: " + this.age;
    }
}
