package modulo02.aula15;

public class ContaCorrente {
    private double saldo;

    // MÉTODO PARA RECEBER UM VALOR E ACRESCENTÁ-LO Á VARIÁVEL SALDO
    public void depositarValor(double valor) {
        saldo += valor;
    }

    // MÉTODO PARA RECEBER UM VALOR E DECREMENTÁ-LO DA VARIÁVEL SALDO
    public double sacarValor(double valor) {
        saldo -= valor;
        return valor;
    }

    public double transferirValor(double valor, ContaCorrente conta){
        saldo -= valor;
        conta.depositarValor(valor);
        return valor;
    }

    // MÉTODO QUE VERIFICA SE O VALOR A SER SACADO É MENOR QUE O SALDO EM CONTA, SE
    // FOR, RETORNA TRUE, SE NÃO, RETORNA FALSE
    public boolean validaValores(double valor) {
        if (saldo > valor) {
            return true;
        } else {
            return false;
        }
    }

    // MÉTODO QUE RETORNA O SALDO
    public double getSaldo() {
        return saldo;
    }

}
