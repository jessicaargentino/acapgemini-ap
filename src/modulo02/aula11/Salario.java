package modulo02.aula11;

import java.util.Scanner;

/**
 * Crie um programa em linguagem Java que solicita ao usuário que digite a
 * idade, armazene em uma variável do tipo byte e imprima uma mensagem para
 * idade maior que 25 anos, outra mensagem para idade menor que 25 e uma outra
 * mensagem se idade igual a 25 anos. Crie um programa em linguagem Java que
 * solicita ao usuário que digite o salário, armazene em uma variável do tipo
 * double e imprima uma mensagem caso o salário seja maior que R$ 1997,58, outra
 * mensagem se o salário for maior que R$5399,99 e outra mensagem se o salário
 * digitado for menor ou igual a zero. Caso o salário seja menor igual a zero o
 * sistema deve solicitar que o usuário digite o salário novamente para então
 * realizar as validações de faixas salariais mais uma vez até que o usuário
 * digite um valor acima de zero.
 */
public class Salario {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        double salario;

        cabecalho();

        do {
            salario = lerNumero("Digite seu salário: ");
        } while (!validaSalario(salario));

        verificaSalario(salario);
    }

    /** Método que imprime uma mensagem de cabeçalho */
    static void cabecalho() {
        System.out.println("***** VERIFICADOR DE SALÁRIO *****");
    }

    /**
     * Método que realiza a entrada de dados (um número) digitado pelo usuário.
     * 
     * @param mensagem mensagem que será exibida antes da entrada de dados
     * @return número digitado pelo usuário
     */
    static double lerNumero(String mensagem) {
        System.out.print(mensagem);
        double numero = Double.parseDouble(entrada.nextLine());
        return numero;
    }

    /**
     * Método que verifica se o salário é maior que zero
     * 
     * @param salario digitado pelo usuário
     * @return true se for maior que zero, false se não for
     */
    static boolean validaSalario(double salario) {
        boolean ehValido = true;

        if (salario <= 0) {
            System.out.println("\nSeu salário não é considerado válido!");
            System.out.println("O salário não pode ser menor/igual a 0, tente novamente!\n");
            ehValido = false;
        }
        return ehValido;
    }

    /**
     * Método que verifica se o valor do salário está dentro dos padrões.
     * 
     * @param salario salário digitado pelo usuário
     */
    static void verificaSalario(double salario) {
        if (salario >= 1997.58 && salario < 5399.99) {
            System.out.println("Seu salário é maior ou igual a R$1997.58, mas menor que R$5399.99");
        } else if (salario >= 5399.99) {
            System.out.println("Seu salário é maior que R$5399.99");
        } else {
            System.out.println("Seu salário não se encontra dentro do piso de R$1997.58 á R$5399.99");
        }
    }

}
