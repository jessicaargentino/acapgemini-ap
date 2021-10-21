package modulo02.aula29.model;

public abstract class Base {
    public int id;
    public static int counter = 1;

    public Base() {
        this.id = counter++;
    }

}
