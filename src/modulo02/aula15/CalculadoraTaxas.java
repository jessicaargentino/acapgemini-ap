package modulo02.aula15;

/* Crie uma nova classe para esta atividade e que possua um método main para
* executar a aplicação. Construa uma classe CalculadoraTaxas que possua os
* métodos de cálculo de taxas. Crie dois métodos para cálculo de taxa sobre
* transações bancárias, o primeiro será aplicado uma taxa de 0,001% sobre o
* valor transferido, o segundo uma taxa de saque de R$1.30 a cada 5 saques
* realizados. Na classe principal, dentro do metodo main, construa um objeto da
* classe Calculadora de Taxas e execute os métodos de transferência e de saque.
* Ao final da execução do método main, imprima todos os dados das taxas
* cobradas. */

public class CalculadoraTaxas {
    // DEFINIÇÃO DOS ATRIBUTOS DA CLASSE
    private double taxaTransferencia;
    private double taxaSaque;
    private int quantidadeSaque;

    // MÉTODO QUE RECEBE O VALOR A SER TRANSFERIDO E RETORNA A TAXA DE
    // 0.001% CALCULADA SOBRE O VALOR
    public double calculaTaxaTransferencia(double valor) {
        return taxaTransferencia = (valor * 0.001);
    }

    // MÉTODO QUE RECEBE UM VALOR POR PARÂMETRO, INCREMENTA O ATRIBUTO
    // QUANTIDADE_SAQUE E VERIFICA SE A MESMA É DIVISÍVEL POR 5. SE FOR,
    // RETORNA A TAXA DE 1,30 A SER PAGA PELO SAQUE, SE NÃO, RETORNA 0.0 PARA A TAXA
    public double calculaTaxaSaque(double valor) {
        quantidadeSaque++;

        if (quantidadeSaque % 5 == 0) {
            return taxaSaque = 1.30;
        } else {
            return taxaSaque = 0.0;
        }
    }

    // MÉTODO QUE IMPRIME O VALOR DA TAXA DE TRANSFERÊNCIA
    public void imprimeTaxaTransferencia() {
        System.out.printf("\nTaxa de transferência: R$%.2f\n", taxaTransferencia);
    }

    // MÉTODO QUE IMPRIME O VALOR DA TAXA DE SAQUE
    public void imprimeTaxaSaque() {
        System.out.printf("\nTaxa de saque: R$%.2f\n", taxaSaque);
    }
}
