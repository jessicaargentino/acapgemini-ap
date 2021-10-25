package modulo02.aula31.a01;

import java.util.Scanner;

/**
 * Crie uma calculadora para realizar as quatro operações básicas: soma,
 * subtração, multiplicação e divisão. Deve possuir um menu para o usuário
 * escolher a operação a realizar. O sistema deve possuir um tratamento de
 * exceção para evitar erro em uma divisão por zero. O sistema deve possuir um
 * tratamento de exceção durante a leitura dos dados para evitar que o usuário
 * insira algo diferente de números inteiros tanto para as operação quanto para
 * o menu.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option = 0, numberOne, numberTwo;

        do {
            try {
                System.out.println("***** CALCULADORA *****\n");
                numberOne = readNumber("Digite o 1º número: ", input);
                numberTwo = readNumber("Digite o 2º número: ", input);
                option = menu(input);
                actions(option, numberOne, numberTwo);
            } catch (NumberFormatException e) {
                System.out.println("\nCaractere inválido, volte ao menu e tente novamente!");
            } catch (ArithmeticException e) {
                System.out.println("Não é possível realizar divisão por zero, volte ao menu e tente novamente!");
            }
        } while (returnMenu(input));
    }

    /**
     * Método que recebe uma mensagem e realiza a leitura de um número
     * 
     * @param message
     * @param input
     * @return número digitado pelo usuário
     * @throws NumberFormatException exceção de caractere inválido
     */
    public static int readNumber(String message, Scanner input) throws NumberFormatException {
        System.out.print(message);
        int number = Integer.parseInt(input.nextLine());
        return number;
    }

    /**
     * Método que exibe as opções do menu e realiza a entrada de uma opção
     * 
     * @param input entrada de dados pelo usuário
     * @return opção digitada pelo usuário
     * @throws NumberFormatException exceção de caractere inválido
     */
    public static int menu(Scanner input) throws NumberFormatException {
        System.out.println("\n1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("\nEscolha uma opção: ");
        int option = Integer.parseInt(input.nextLine());
        System.out.println();
        return option;
    }

    /**
     * Método que realizada a chamada dos métodos da Calculator de acordo com a
     * opção escolhida pelo usuário
     * 
     * @param option    opção escolhida pelo usuário
     * @param numberOne 1º número digitado pelo usuário
     * @param numberTwo 2º número digitado pelo usuário
     * @throws ArithmeticException exceção de divisão por zero
     */
    public static void actions(int option, int numberOne, int numberTwo) throws ArithmeticException {
        int result = 0;

        switch (option) {
        case 1:
            result = Calculator.sum(numberOne, numberTwo);
            break;
        case 2:
            result = Calculator.subtraction(numberOne, numberTwo);
            break;
        case 3:
            result = Calculator.multiplication(numberOne, numberTwo);
            break;
        case 4:
            result = Calculator.division(numberOne, numberTwo);
            break;
        }

        System.out.printf("O resultado da operação é: %d\n", result);
    }

    /**
     * Método que recebe a opção do usuário para retornar ao menu ou não
     * 
     * @param input entrada do usuário
     * @return true para retornar ao menu ou false para não retornar ao menu
     */
    private static boolean returnMenu(Scanner input) {
        int option = 0;
        boolean turnBack = true;
        do {
            try {
                System.out.println("\nDeseja voltar ao menu?\n1 - Sim\n2 - Não");
                System.out.print("\nSua opção: ");
                option = Integer.parseInt(input.nextLine());
                System.out.println();

                if (option == 1) {
                    turnBack = true;
                } else if (option == 2) {
                    System.out.println("Obrigada por utilizar nossa calculadora!\n");
                    turnBack = false;
                } else {
                    System.out.println("Opção inválida, tente novamente!");
                    turnBack = false;
                }

            } catch (NumberFormatException e) {
                System.out.println("\nCaractere inválido, tente novamente!");
            }
        } while (option != 1 && option != 2);
        return turnBack;
    }
}
