package modulo02.aula12;

import java.util.Scanner;

/* Crie um programa em linguagem Java que atenda aos seguintes requisitos:
* Exiba um cabeçalho com o título “Bradesco Financiamentos”. Exiba um menu
* com as opções, Crédito Pessoal, Crédito Imobiliário, Crédito Empresarial e
* Empréstimo Consignado. Solicite ao usuário que escolha uma das opções do
* menu e caso a opção digitada não seja válida, o sistema deve imprimir o menu
* novamente, solicitar que ele digite a opção e validar a resposta até que uma
* opção válida seja digitada. Ao digitar uma opção válida o sistema deve
* exibir apenas uma mensagem com o nome do módulo, nenhuma implementação da
* funcionalidade do módulo será necessária. Após exibir a opção correta, o
* sistema deve perguntar ao usuário se ele deseja voltar ao menu principal
* (‘V’) ou sair do sistema(‘S’). O sistema deve ler a opção digitada pelo
* usuário e validar se ele digitou uma das opções válidas, caso contrário deve
* solicitar que digite novamente até que uma opção válida seja digitada. O
* sistema deve encaminhar o usuário para o menu principal caso a resposta seja
* ‘V’ e se a opção digitada for ‘S’ o sistema deve encerrar imprimindo uma
* mensagem de obrigado. */

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