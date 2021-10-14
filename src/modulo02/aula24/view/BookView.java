package modulo02.aula24.view;

import java.util.Scanner;

public class BookView {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

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

}
