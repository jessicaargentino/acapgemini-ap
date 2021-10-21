package modulo02.aula29.model;

public class Base {
    public int id;
    public static int counter = 0;

    public Base() {
        this.id = counter++;
    }

}
