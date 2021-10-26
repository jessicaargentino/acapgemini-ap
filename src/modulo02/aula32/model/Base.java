package modulo02.aula32.model;

public abstract class Base {
    private int id;
    private static int counter = 1;

    /**
     * Construtor - Através do counter, incrementa o id a cada instância da classe
     */
    public Base() {
        this.id = counter++;
    }

    /** Getter */
    public int getId() {
        return id;
    }
}
