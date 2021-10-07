package modulo02.aula20.atv02;

public class ContaCorrente {
    /* DEFINIÇÃO DOS ATRIBUTOS */
    private double saldo;
    private double taxaSaque;
    private int codigoCliente;

    /* DEFINIÇÃO DO MÉTODO CONSTRUTOR DA CLASSE */
    public ContaCorrente(double saldo, double taxaSaque, int codigoCliente) {
        this.saldo = saldo;
        this.taxaSaque = taxaSaque;
        this.codigoCliente = codigoCliente;
    }
}
