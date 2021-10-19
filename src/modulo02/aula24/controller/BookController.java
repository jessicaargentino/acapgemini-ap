package modulo02.aula24.controller;

import java.util.ArrayList;

import modulo02.aula24.model.Book;

public class BookController {
    private ArrayList<Book> book = new ArrayList<Book>();

    /**
     * CRUD - Método CREATE: Criar um objeto de Categoria
     *
     * @param b objeto da classe Book
     */
    public void create(Book b) {
        this.book.add(b);
    }

    /*
     * CRUD - Método READ: Ler um objeto de Categoria/retornar os objetos de
     * Categoria presentes no ArrayList
     */
    public ArrayList<Book> read() {
        return book;
    }

    /**
     * CRUD - Método UPDATE: Verifica se o ArrayList de Book possui o objeto b
     * passado por parâmetro, essa verificação ocorre utilizando verificando o id
     * pelo equals sobreescrito da classe Book. Se existir um elemento de mesmo id,
     * ele é excluído e o objeto de id passado por parametro é adicionado ao
     * ArrayList
     *
     * @param b objeto da classe Book
     */
    public void update(Book b) {
        if (book.contains(b)) {
            this.delete(b);
            this.create(b);
        }
    }

    /**
     * CRUD - Método DELETE: Exclui um objeto Categoria
     *
     * @param b objeto da classe Book
     */
    public void delete(Book b) {
        book.remove(b);
    }
}
