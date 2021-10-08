package modulo02.aula17;

public class Numero {
    /* Crie uma classe Números com um método main. _ Crie nesta classe um array de
     * números inteiros com 10 posições. _ Adicione um valor para cada posição do
     * array. _ Imprima ao final da execução do main, todas as posições do array
     * utilizando o laço de repetição for. */
    public static void main(String[] args) {
        /* DECLARAÇÃO DO ARRAY DE INTEIROS COM 10 POSIÇÕES */
        int numero[] = new int[10];

        /* ATRIBUIÇÃO DE VALORES CONFORME AS POSIÇÕES DO ARRAY */
        numero[0] = 15;
        numero[1] = 6;
        numero[2] = 7;
        numero[3] = 9;
        numero[4] = 10;
        numero[5] = 4;
        numero[6] = 3;
        numero[7] = 1;
        numero[8] = 0;
        numero[9] = 12;

        /* IMPRESSÃO DO CABEÇALHO */
        System.out.println("***** NÚMEROS *****");

        /* PERCORRENDO O ARRAY E IMPRIMINDO OS DADOS DAS POSIÇÕES */
        for (int i = 0; i < numero.length; i++) {
            System.out.printf("%d ", numero[i]);
        }
    }
}