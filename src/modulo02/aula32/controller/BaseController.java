package modulo02.aula32.controller;

import java.util.ArrayList;

public class BaseController<T> {
    private ArrayList<T> data;

    /**
     * Construtor - Cria uma instância de ArrayList a cada instância da classe
     */
    public BaseController() {
        this.data = new ArrayList<T>();
    }

    /**
     * CRUD - Método CREATE: Adiciona um objeto de uma classe no ArrayList da mesma
     *
     * @param object objeto generico
     */
    public void create(T object) {
        this.data.add(object);
    }
}