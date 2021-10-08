package modulo02.aula20.atv02;

/* Crie uma classe Conta Corrente com os atributos privados: saldo, taxa saque
 * e codigo de cliente. Crie um método Construtor na classe Conta Corrente que
 * receba o valor do saldo e do código do cliente; Crie um método saque que
 * recebe um valor double e que debita do saldo o valor mais a taxa de saque.
 * Crie um método depósito que recebe um valor double e soma ao valor do saldo.
 * Adicione um valor fixo ao atributo taxa saque; Crie uma classe Tela Banco
 * que contenha um método main. Crie um objeto da classe Conta Corrente,
 * insira as informações no construtor, realize um saque, um depósito e imprima
 * saldo, taxa saque e codigo de cliente usando toString; */

public class ContaCorrente {
    /* DEFINIÇÃO DOS ATRIBUTOS */
    private double saldo;
    private double taxaSaque = 1.50;
    private int codigoCliente;

    /* DEFINIÇÃO DO MÉTODO CONSTRUTOR DA CLASSE */
    public ContaCorrente(double saldo, int codigoCliente) {
        this.saldo = saldo;
        this.codigoCliente = codigoCliente;
    }

    /*
     * MÉTODO QUE RECEBE UM VALOR POR PARAMETRO E O REALIZA O SAQUE DIMINUINDO O
     * MESMO DO SALDO. DIMINUI TAMBÉM A TAXA DE SAQUE DO SALDO;
     */
    public void realizaSaque(double valor) {
        this.saldo = (this.saldo - valor - taxaSaque);
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
        return "Código cliente: " + this.getCodigoCliente() + "\nSaldo: R$" + String.format("%.2f", this.getSaldo())
                + "\nTaxa de saque: R$" + String.format("%.2f", this.getTaxaSaque());
    }
}
