package modulo02.aula17;

public class ContaCorrente {
    /* DECLARAÇÃO DOS ATRIBUTOS DA CLASSE */
    private int agencia;
    private int numero;
    private int codigoCliente;
    private double saldo;

    /* SETTERS E GETTERS */

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }
}
