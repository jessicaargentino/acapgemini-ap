package modulo03.aula07.atv01.model;

public class Company {
    public String name;
    public String cpnj;
    public String branch;
    
    @Override
    public String toString() {
        return this.name + ";" + this.cpnj + ";" + this.branch;
    }
}