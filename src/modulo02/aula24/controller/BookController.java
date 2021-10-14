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
}
