package modulo02.aula31;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option = 0;
        do {
            try {
                option = menu(input);
            } catch (NumberFormatException e) {
                System.out.println("\nCaractere inválido, tente novamente!\n");
            }
        } while (option != 5);
    }

    public static int menu(Scanner input) throws NumberFormatException {
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 - Sair");
        System.out.print("Escolha uma opção: ");
        int option = Integer.parseInt(input.nextLine());
        System.out.println();
        return option;
    }
}
