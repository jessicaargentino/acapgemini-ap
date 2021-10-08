package modulo02.aula19;

/* Crie um método transferência na classe Conta. O método deve receber um valor
* double e debitar do saldo da conta. Crie uma classe Teste, adicione um
* método main, crie um objeto de Conta e um objeto de Conta Corrente. Utilize
* os métodos set para inserir os valores de saldo e de código de cliente para
* os dois objetos. Realize uma transferência em cada uma das contas.
* Imprima os dados de código de cliente, saldo e de saldo após a transferência,
* para cada objeto */

/* CLASSE PAI */
public class Conta {
    /* DEFINIÇÃO DOS ATRIBUTOS */
    private double saldo;
    private int codigoCliente;

    /* GETTERS E SETTERS */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    /* METÓDO QUE RECEBE UM VALOR E O REDUZ DO SALDO ATUAL */
    public double realizaTransferencia(double valor) {
        this.saldo -= valor;
        return valor;
    }
}