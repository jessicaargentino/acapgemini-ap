package modulo02.aula31.a02.view;

import java.util.Scanner;

import modulo02.aula31.a02.controller.CalculatorController;
import modulo02.aula31.a02.model.Calculator;

public class CalculatorView {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculator calculator = new Calculator();
        int option = 0;

        do {
            try {
                System.out.println("***** CALCULADORA *****\n");
                calculator.setNumberOne(readNumber("Digite o 1º número: ", input));
                calculator.setNumberTwo(readNumber("Digite o 2º número: ", input));
                menu();
                System.out.println();
                option = readNumber("Escolha uma opção: ", input);
                actions(option, calculator);
            } catch (ArithmeticException e) {
                System.out.println("\nNão é possível realizar divisão por zero, volte ao menu e tente novamente!");
            }
        } while (returnMenu(input));
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
                System.out.println("\nCaractere inválido, tente novamente!\n");
                validNumber = false;
            }
        } while (!validNumber);
        return number;
    }

    /**
     * Método que exibe as opções do menu
     */
    public static void menu() {
        System.out.println("\n1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
    }

    /**
     * Método que realizada a chamada dos métodos da Calculator de acordo com a
     * opção escolhida pelo usuário
     * 
     * @param option     opção escolhida pelo usuário
     * @param calculator instância de Calculator para acessar os gets dos números
     */
    public static void actions(int option, Calculator calculator) {
        CalculatorController calculatorController = new CalculatorController();
        int result = 0;

        switch (option) {
        case 1:
            result = calculatorController.sum(calculator);
            break;
        case 2:
            result = calculatorController.subtraction(calculator);
            break;
        case 3:
            result = calculatorController.multiplication(calculator);
            break;
        case 4:
            result = calculatorController.division(calculator);
            break;
        }

        System.out.printf("\nO resultado da operação é: %d\n", result);
    }

    /**
     * Método que de acordo com a escolha do usuário retorna ao menu inicial
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
