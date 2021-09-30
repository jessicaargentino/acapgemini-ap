package modulo02.aula15;

public class CalculadoraTaxas {
    // DEFINIÇÃO DOS ATRIBUTOS DA CLASSE
    private double taxaTransferencia;
    private double taxaSaque;

    // MÉTODO QUE RECEBE O VALOR A SER TRANSFERIDO E RETORNA O VALOR COM A TAXA DE
    // 0.001% EMBUTIDO
    public double calculaTaxaTransferencia(double valor) {
        return taxaTransferencia += (taxaTransferencia * 0.001);
    }
}
