package modulo02.aula16;

/* Crie uma classe para cálculo de impostos. A classe de calculo deve possuir
* 3 métodos, um para calculo de ISS, outro para cálculo de IOF e outro para
* cálculo de IR. A classe deve manter em variáveis privadas o valor de cada
* imposto que deve ser definido por você. Os métodos devem receber como
* parâmetro um valor que servirá de base para cálculo do imposto e retornar o
* valor do imposto calculado. Crie uma segunda classe que contenha o método
* main. Nesta segunda classe, crie um objeto da classe calculadora, realize a
* chamada aos três métodos e ao final da execução, imprima o valor de todos os
* impostos calculados. */

public class CalculoImposto {
    /* DEFINIÇÃO DOS ATRIBUTOS DA CLASSE */
    private double iss = 0.078; // 7.8%
    private double iof = 0.034; // 3.4%
    private double ir = 0.225; // 22.5%;

    /*
     * MÉTODO QUE RECEBE UM VALOR POR PARÂMETRO E CALCULA O IMPOSTO ISS SOBRE O
     * MESMO
     */
    public double calculaISS(double valor) {
        return (valor * iss);
    }

    /*
     * MÉTODO QUE RECEBE UM VALOR POR PARÂMETRO E CALCULA O IMPOSTO IOF SOBRE O
     * MESMO
     */
    public double calculaIOF(double valor) {
        return (valor * iof);
    }

    /*
     * MÉTODO QUE RECEBE UM VALOR POR PARÂMETRO E CALCULA O IMPOSTO IR SOBRE O MESMO
     */
    public double calculaIR(double valor) {
        return (valor * ir);
    }
}
