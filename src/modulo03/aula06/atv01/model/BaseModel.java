package modulo03.aula06.atv01.model;

public abstract class BaseModel {
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