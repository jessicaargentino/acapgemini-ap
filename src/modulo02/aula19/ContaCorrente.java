package modulo02.aula19;

/* Crie uma classe Conta que deve possuir os atributos privados: saldo e código
 * do cliente. Crie os métodos set e get para os atributos privados da classe
 * Conta. _ Crie uma classe Conta Corrente com os atributos privados: taxa
 * transferência, taxa manutenção e número de transferências. Defina um valor
 * padrão para taxa de transferência de R$10.50, um valor de R$2.50 para taxa de
 * manutenção e 0 para o número de transferências; A classe Conta Corrente
 * deve herdar da classe Conta. */

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
