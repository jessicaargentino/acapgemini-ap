package modulo02.aula11;

import java.util.Scanner;

public class Idade {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        byte idade;

        cabecalho();
        idade = lerNumero("Digite sua idade: ");
        verificaIdade(idade);
    }

    /** Método que imprime uma mensagem de cabeçalho */
    static void cabecalho() {
        System.out.println("***** VERIFICADOR DE IDADE *****");
    }

    /**
     * Método que realiza a entrada de dados (um número) digitado pelo usuário.
     * 
     * @param mensagem mensagem que será exibida antes da entrada de dados
     * @return número digitado pelo usuário
     */
    static byte lerNumero(String mensagem) {
        System.out.print(mensagem);
        byte numero = Byte.parseByte(entrada.nextLine());
        return numero;
    }

    /**
     * Método que verifica se a idade é menor, igual ou maior que 25 e imprime
     * mensagem informativa
     */
    static void verificaIdade(byte idade) {
        if (idade < 25) {
            System.out.println("Idade menor que 25 anos!");
        } else if (idade == 25) {
            System.out.println("Idade igual a 25 anos!");
        } else if (idade > 25) {
            System.out.println("Idade maior que 25 anos!");
        }
    }
}
