package modulo02.aula24.view;

import java.util.ArrayList;
import java.util.Scanner;

import modulo02.aula24.controller.BookController;
import modulo02.aula24.model.Book;

/**
 * Crie um sistema de cadastro de livros. O sistema deve utilizar o padrão de
 * arquitetura MVC. O modelo deve possuir um id e outros atributos de sua
 * escolha. A controller deve possuir os quatro métodos de CRUD e deve utilizar
 * um ArrayList privado para manter os dados. A view deve possuir um menu para
 * usuário poder escolher quais das operações de CRUD utilizar.
 */
public class BookView {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BookController newBookController = new BookController();
        Book newBook = new Book();
        int option;

        do {
            header("LIVRARIA CAP");
            option = menu(input);

            switch (option) {
                case 1:
                    header("CADASTRO DE LIVROS");
                    createBook(newBookController, input);
                    break;
                case 2:
                    header("LISTA DE LIVROS");
                    listBook(newBookController);
                    break;
                case 3:
                    header("ATUALIZAÇÃO DE LIVROS");
                    updateBook(newBookController, newBook, input);
                    break;
                case 4:
                    header("EXCLUSÃO DE LIVROS");
                    deleteBook(newBookController, newBook, input);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (option != 5);

        input.close();
    }

    /**
     * Método que imprime uma mensagem a ser definida
     *
     * @param word mensagem que será impressa
     */
    public static void header(String word) {
        System.out.println("\n***** " + word + " *****\n");
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
        System.out.println("5 - Sair\n");
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
        System.out.print("Nome do livro: ");
        newBook.setName(input.nextLine());
        System.out.print("Descrição: ");
        newBook.setDescription(input.nextLine());
        System.out.print("Autor(a): ");
        newBook.setAuthor(input.nextLine());
        System.out.print("Editora: ");
        newBook.setPublisher(input.nextLine());
        System.out.print("Ano de publicação: ");
        newBook.setYearOfPublication(Integer.parseInt(input.nextLine()));

        newBookController.create(newBook);
    }

    /**
     * Método que lista os objetos do ArrayList de Book
     *
     * @param newBookController objeto do ArrayList para adição do objeto de Book
     */
    public static void listBook(BookController newBookController) {
        ArrayList<Book> book = newBookController.read();
        for (Book b : book) {
            System.out.printf("ID: %s\n", b.getId());
            System.out.printf("Nome: %s\n", b.getName());
            System.out.printf("Descrição: %s\n", b.getDescription());
            System.out.printf("Autor(a): %s\n", b.getAuthor());
            System.out.printf("Editora: %s\n", b.getPublisher());
            System.out.printf("Ano de publicação: %s\n\n", b.getYearOfPublication());
        }
    }

    /**
     * Método que altera um objeto da classe Book através do id
     *
     * @param newBookController objeto do ArrayList para adição do objeto de Book
     * @param input             entrada de dados pelo usuário
     */
    public static void updateBook(BookController newBookController, Book newBook, Scanner input) {
        System.out.print("ID do livro a ser alterado: ");
        String id = input.nextLine();
        System.out.print("Nome do livro: ");
        newBook.setName(input.nextLine());
        System.out.print("Descrição: ");
        newBook.setDescription(input.nextLine());
        System.out.print("Autor(a): ");
        newBook.setAuthor(input.nextLine());
        System.out.print("Editora: ");
        newBook.setPublisher(input.nextLine());
        System.out.print("Ano de publicação: ");
        newBook.setYearOfPublication(Integer.parseInt(input.nextLine()));

        newBookController.update(newBook);
    }

    /**
     * Método que exclui um objeto da classe Book através do id
     *
     * @param newBookController objeto do ArrayList para adição do objeto de Book
     * @param input             entrada de dados pelo usuário
     */
    public static void deleteBook(BookController newBookController, Book newBook, Scanner input) {
        ArrayList<Book> book = new ArrayList<Book>();
        System.out.print("ID do livro a ser deletado: ");
        String id = input.nextLine();
        newBookController.delete(newBook);
    }

}
