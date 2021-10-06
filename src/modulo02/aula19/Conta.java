package modulo02.aula19;

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