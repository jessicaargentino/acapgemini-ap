package modulo03.aula06.controller;

import java.util.ArrayList;

public abstract class BaseController<T> {
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

    /**
     * CRUD - Método READ: Retorna todos os objetos presentes no ArrayList
     * 
     * @return objetos contidos no ArrayList
     */
    public ArrayList<T> read() {
        return this.data;
    }

    /**
     * CRUD - Método UPDATE: Através do método contains, verifica se existe um
     * objeto de mesmo id no objeto recebido por parâmetro no ArrayList. Se sim,
     * exclui o objeto e adiciona o novo de mesmo id ao ArrayList.
     *
     * @param object objeto generico
     */
    public void update(T object) {
        if (this.data.contains(object)) {
            this.delete(object);
            this.create(object);
        }
    }

    /**
     * CRUD - Método DELETE: Remove um objeto do ArrayList
     *
     * @param object objeto generico
     */
    public void delete(T object) {
        this.data.remove(object);
    }
}
