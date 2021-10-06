package modulo02.aula19;

/* CLASSE FILHA DE CONTA */
public class ContaCorrente extends Conta {
    /* DEFINIÇÃO DOS ATRIBUTOS */
    private double taxaTransferencia = 10.50;
    private double taxaManutencao = 2.50;
    private int numeroDeTransferencia;

    /*
     * MÉTODO SOBREESCRITO QUE ALÉM DE DEBITAR O VALOR DO SALDO ATUAL, DEBITA A TAXA
     * DE TRANSFERÊNCIA TAMBÉM.
     */
    @Override
    public double realizaTransferencia(double valor) {
        numeroDeTransferencia++;
        double saldo = this.getSaldo();
        this.setSaldo(saldo - taxaTransferencia);
        return valor;
    }

    /*
     * MÉTODO QUE VERIFICA SE FORAM REALIZADOS GRUPOS DE 5 TRANSFERÊNCIAS. SE SIM,
     * DEBITA DO SALDO ATUAL A TAXA DE MANUTENÇÃO, SE NÃO, APENAS RETORNA O SALDO
     * ATUAL.
     */
    public double debitaTaxaManutencao() {
        if (numeroDeTransferencia % 5 == 0) {
            return (this.getSaldo() - taxaManutencao);
        } else {
            return this.getSaldo();
        }
    }
}
