package modulo02.aula20.atv02;

public class ContaCorrente {
    /* DEFINIÇÃO DOS ATRIBUTOS */
    private double saldo;
    private double taxaSaque = 1.50;
    private int codigoCliente;

    /* DEFINIÇÃO DO MÉTODO CONSTRUTOR DA CLASSE */
    public ContaCorrente(double saldo, double taxaSaque, int codigoCliente) {
        this.saldo = saldo;
        this.taxaSaque = taxaSaque;
        this.codigoCliente = codigoCliente;
    }

    /*
     * MÉTODO QUE RECEBE UM VALOR POR PARAMETRO E O REALIZA O SAQUE DIMINUINDO O
     * MESMO DO SALDO. DIMINUI TAMBÉM A TAXA DE SAQUE DO SALDO;
     */
    public void realizaSaque(double valor) {
        this.saldo -= valor - taxaSaque;
    }

    /*
     * MÉTODO QUE RECEBE UM VALOR POR PARAMETRO E O REALIZA O O DEPÓSITO,
     * ACRESCENTANDO O VALOR AO SALDO.
     */
    public void recebeDeposito(double valor) {
        this.saldo += valor;
    }

    /* GETTERS */
    public double getSaldo() {
        return saldo;
    }

    public double getTaxaSaque() {
        return taxaSaque;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    /*
     * SOBREESCRITA DO MÉTODO TOSTRING DA CLASSE OBJECT PARA IMPRESSÃO DOS ATRIBUTOS
     */
    @Override
    public String toString() {
        String retorno = "Código cliente: " + this.getCodigoCliente() + "\nSaldo: " + this.getSaldo()
                + "\nTaxa de saque: R$" + this.getTaxaSaque();
        return retorno;
    }
}
