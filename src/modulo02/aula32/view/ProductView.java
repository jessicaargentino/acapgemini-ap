package modulo02.aula32.view;

import java.util.Scanner;

import modulo02.aula32.controller.ProductController;

public class ProductView {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;
        System.out.println("****** CADASTRO DE PRODUTOS ******\n");
        menu();
        option = readNumber("\nEscolha uma opção: ", input);
    }

    /** Método que imprime um menu com as opções do programa */
    public static void menu() {
        System.out.println("1 - Adicionar um produto");
        System.out.println("2 - Alterar um produto");
        System.out.println("3 - Deletar um produto");
        System.out.println("4 - Listar produtos");
    }

    /**
     * Método que recebe uma mensagem e realiza a leitura de um número
     * 
     * @param message
     * @param input
     * @return número digitado pelo usuário
     */
    public static int readNumber(String message, Scanner input) {
        int number = 0;
        boolean validNumber;
        do {
            try {
                System.out.print(message);
                number = Integer.parseInt(input.nextLine());
                validNumber = true;
            } catch (NumberFormatException e) {
                System.out.println("\nCaractere inválido, tente novamente!");
                validNumber = false;
            }
        } while (!validNumber);
        return number;
    }
}
