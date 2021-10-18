package modulo02.aula24.model;

import java.util.Random;

public abstract class BaseModel {
    private String id;
    private Random random = new Random();

    public BaseModel() {
        this.id = String.valueOf(random.nextInt(100));
    }

    /**
     * Getter
     */
    public String getId() {
        return id;
    }
}
