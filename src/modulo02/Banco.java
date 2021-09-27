package modulo02;

import java.util.Scanner;

public class Banco {

    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        byte opcao;

        cabecalho();
        menu();
        opcao = lerNumero("Escolha uma opção: ");
    }

    static void cabecalho() {
        System.out.println("****** BRADESCO FINANCIAMENTOS ******");
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
}