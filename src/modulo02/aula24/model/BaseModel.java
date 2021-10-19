package modulo02.aula24.model;

public abstract class BaseModel {
    private int id;
    private static int counter = 0;

    public BaseModel() {
        this.id = counter++;
    }

    /**
     * Getter e setter
     */
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
