package modulo02.aula19;

/* CLASSE FILHA DE CONTA */
public class ContaCorrente extends Conta {
    /* DEFINIÇÃO DOS ATRIBUTOS */
    private double taxaTransferencia = 10.50;
    private double taxaManutencao = 2.50;
    private int numeroDeTransferencia;

    /*
     * MÉTODO SOBREESCRITO QUE RECEBE UM VALOR POR PARAMETRO E VERIFICA SE FORAM
     * REALIZADOS GRUPOS DE 5 TRANSFERÊNCIAS. SE SIM, DEBITA O VALOR RECEBIDO, TAXA
     * DE MANUTENÇÃO E TRANSFERENCIA, SE NÃO, SOMENTE VALOR E TAXA DE TRANSFERENCIA.
     */
    @Override
    public double realizaTransferencia(double valor) {
        numeroDeTransferencia++;

        double saldo = this.getSaldo();

        if (numeroDeTransferencia % 5 == 0) {
            this.setSaldo((saldo - valor) - taxaTransferencia - taxaManutencao);
            return valor;
        } else {
            this.setSaldo((saldo - valor) - taxaTransferencia);
            return valor;
        }
    }

}
