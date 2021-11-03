package modulo03.aula06.model;

public class BaseModel {
    private static int counter = 1;
    private int id;

    public BaseModel() {
        this.id = counter++;
    }

    /** Getter */
    public int getId() {
        return id;
    }
}