package modulo02.aula31;

import java.util.Scanner;

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
                System.out.println("\nCaractere inválido, tente novamente!\n");
            } catch (ArithmeticException e) {
                System.out.println("Não é possível realizar divisão por zero, tente novamente!\n");
            }
        } while (option != 5);
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
        System.out.println("5 - Sair");
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
        switch (option) {
        case 1:
            System.out.printf("O resultado da soma é: %d\n\n", Calculator.sum(numberOne, numberTwo));
            break;
        case 2:
            System.out.printf("O resultado da subtração é: %d\n\n", Calculator.subtraction(numberOne, numberTwo));
            break;
        case 3:
            System.out.printf("O resultado da multiplicação é: %d\n\n",
                    Calculator.multiplication(numberOne, numberTwo));
            break;
        case 4:
            System.out.printf("O resultado da divisão é: %d\n\n", Calculator.division(numberOne, numberTwo));
            break;
        case 5:
            System.out.println("Obrigada por utilizar nossa calculadora!");
            break;
        }
    }
}
