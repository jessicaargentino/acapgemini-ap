package modulo02.aula19;

/* CLASSE FILHA DE CONTA */
public class ContaCorrente extends Conta {
    /* DEFINIÇÃO DOS ATRIBUTOS */
    private double taxaTransferencia = 10.50;
    private double taxaManuntencao = 2.50;
    private int numeroDeTransferencia;

    @Override
    public double realizaTransferencia(double valor) {
        numeroDeTransferencia++;
        double saldo = this.getSaldo();
        this.setSaldo(saldo - taxaTransferencia);
        return valor;
    }
}
