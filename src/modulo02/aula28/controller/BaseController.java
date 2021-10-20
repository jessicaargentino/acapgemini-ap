package modulo02.aula28.controller;

import java.util.ArrayList;

public class BaseController<T> {
    private ArrayList<T> data;

    /**
     * Construtor 
     * Cria uma instância de ArrayList a cada chamada
     */
    public BaseController() {
        this.data = new ArrayList<T>();
    }

    /**
     * CRUD - Método CREATE: Criar um objeto da classe informada
     *
     * @param object objeto generico
     */
    public void create(T object) {
        this.data.add(object);
    }

    /*
     * CRUD - Método READ: Ler um objeto de Categoria/retornar os objetos presentes
     * no ArrayList
     */
    public ArrayList<T> read() {
        return this.data;
    }

    /**
     * CRUD - Método UPDATE: Verifica se o ArrayList possui o objeto recebido por
     * parâmetro. Essa verificação ocorre verificando o id pelo equals sobreescrito
     * da classe. Se existir um elemento de mesmo id, ele é excluído e o objeto de
     * id passado por parametro é adicionado ao ArrayList
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
     * CRUD - Método DELETE: Exclui um objeto
     *
     * @param b objeto generico
     */
    public void delete(T object) {
        this.data.remove(object);
    }
}
