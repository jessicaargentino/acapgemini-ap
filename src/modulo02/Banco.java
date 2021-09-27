package modulo02;

import java.util.Scanner;

public class Banco {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        byte opcao;

        cabecalho();
        menu();
        opcao = lerNumero("Escolha uma opção: ");
        executaOpcao(opcao);
    }

    static void cabecalho() {
        System.out.println("\n****** BRADESCO FINANCIAMENTOS ******");
    }

    static void menu() {
        System.out.println("1 - Crédito pessoal");
        System.out.println("2 - Crédito imobiliário");
        System.out.println("3 - Crédito empresarial");
        System.out.println("4 - Empréstimo consignado");
    }

    static byte lerNumero(String mensagem) {
        System.out.print(mensagem);
        byte numero = Byte.parseByte(entrada.nextLine());
        return numero;
    }

    static void executaOpcao(int opcao) {
        switch (opcao) {
            case 1:
                System.out.println("\nOlá, você entrou no ambiente de crédito pessoal!");
                validaOpcao(opcao);
                break;
            case 2:
                System.out.println("\nOlá, você entrou no ambiente de crédito imobiliário!");
                validaOpcao(opcao);
                break;
            case 3:
                System.out.println("\nOlá, você entrou no ambiente de crédito empresarial!");
                validaOpcao(opcao);
                break;
            case 4:
                System.out.println("\nOlá, você entrou no ambiente de empréstimo consignado!");
                validaOpcao(opcao);
                break;
            default:
                do {
                    System.out.println("\nOpção inválida!");
                    cabecalho();
                    menu();
                    opcao = lerNumero("Escolha uma opção: ");
                    executaOpcao(opcao);
                } while (opcao < 0 && opcao > 4);
                break;
        }
    }

    static void validaOpcao(int opcao) {
        char continua = 'S';

        if (opcao > 0 && opcao <= 4) {
            do {
                System.out.println("\nDeseja voltar ao menu principal?");
                System.out.println("V - Voltar");
                System.out.println("S - Sair");
                System.out.print("Sua opção: ");
                continua = entrada.nextLine().toUpperCase().charAt(0);

                if (continua == 'V' || continua == 'v') {
                    cabecalho();
                    menu();
                    opcao = lerNumero("Escolha uma opção: ");
                    executaOpcao(opcao);
                } else if (continua == 'S' || continua == 's') {
                    System.out.println("\nObrigada por escolher a Bradesco Financiamentos!");
                }
            } while (continua != 'V' && continua != 'v' && continua != 'S' && continua != 's');
        }
    }
}