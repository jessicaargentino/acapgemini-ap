package modulo02.aula24.model;

import java.util.Random;

public class BaseModel {
    private int id;
    private Random random = new Random();

    public BaseModel() {
        this.id = random.nextInt(1000);
    }

    /**
     * Getter
     */
    public long getId() {
        return id;
    }
}
