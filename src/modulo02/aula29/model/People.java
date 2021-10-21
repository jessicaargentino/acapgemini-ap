package modulo02.aula29.model;

public class People {
    public int id;
    public static int counter = 0;
    public String name;
    public Adress homeAdress;
    public Adress businessAdress;

    public People() {
        this.id = counter++;
    }
}