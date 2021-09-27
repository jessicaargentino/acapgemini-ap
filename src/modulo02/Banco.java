package modulo02;

import java.util.Scanner;

public class Banco {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        byte opcao;

        do {
            cabecalho();
            menu();
            opcao = lerNumero("Escolha uma opção: ");
            executaOpcao(opcao);
        } while (validaOpcao(opcao));
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
                break;
            case 2:
                System.out.println("\nOlá, você entrou no ambiente de crédito imobiliário!");
                break;
            case 3:
                System.out.println("\nOlá, você entrou no ambiente de crédito empresarial!");
                break;
            case 4:
                System.out.println("\nOlá, você entrou no ambiente de empréstimo consignado!");
                break;
            default:
                System.out.println("\nOpção inválida!");
                break;
        }
    }

    static char retornaMenu() {
        char continuar;
        
        do {
            System.out.println("\nDeseja voltar ao menu principal?");
            System.out.println("V - Voltar");
            System.out.println("S - Sair");
            System.out.print("Sua opção: ");
            continuar = entrada.nextLine().toUpperCase().charAt(0);
        } while (continuar != 'V' && continuar != 'v' && continuar != 'S' && continuar != 's');

        return continuar;
    }

    static boolean validaOpcao(int opcao) {
        boolean voltar = true;
        char continuar;

        if (opcao > 0 && opcao <= 4) {
            continuar = retornaMenu();

            if (continuar == 'V' || continuar == 'v') {
                voltar = true;
            } else if (continuar == 'S' || continuar == 's') {
                System.out.println("\nObrigada por escolher a Bradesco Financiamentos!");
                voltar = false;
            }
        } else {
            voltar = true;
        }

        return voltar;
    }
}