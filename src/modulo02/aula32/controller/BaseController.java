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
}