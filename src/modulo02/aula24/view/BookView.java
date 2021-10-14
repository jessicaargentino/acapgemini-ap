package modulo02.aula24.view;

import java.util.Scanner;

import modulo02.aula24.controller.BookController;
import modulo02.aula24.model.Book;

public class BookView {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BookController newBookController = new BookController();

        header("LIVRARIA CAP");
        int option = menu(input);

        input.close();
    }

    /**
     * Método que imprime cabeçalho com a palavra recebida por parâmetro
     * 
     * @param word palavra que será exibida como cabeçalho
     */
    public static void header(String word) {
        System.out.println("*****" + word + " *****");
    }

    /**
     * Método que exibe as opções para o usuário, recebe a opção escolhida e a
     * retorna
     * 
     * @param input entrada de dados do usuário
     * @return opção escolhida pelo usuário
     */
    public static int menu(Scanner input) {
        System.out.println("1 - Criar um livro");
        System.out.println("2 - Listar livros");
        System.out.println("3 - Alterar um livro");
        System.out.println("4 - Deletar um livro");
        System.out.print("Escolha uma opção: ");
        int option = Integer.parseInt(input.nextLine());
        return option;
    }

    /**
     * Método que cria um novo objeto da classe Book
     * 
     * @param newBookController objeto do ArrayList para adição do objeto de Book
     * @param input             entrada de dados pelo usuário
     */
    public static void createBook(BookController newBookController, Scanner input) {
        Book newBook = new Book();

        System.out.println("Nome do livro: ");
        newBook.setName(input.nextLine());
        System.out.println("Descrição: ");
        newBook.setDescription(input.nextLine());
        System.out.println("Autor(a): ");
        newBook.setAuthor(input.nextLine());
        System.out.println("Editora: ");
        newBook.setPublisher(input.nextLine());
        System.out.println("Ano de publicação: ");
        newBook.setYearOfPublication(Integer.parseInt(input.nextLine()));

        newBookController.create(newBook);
    }

}
