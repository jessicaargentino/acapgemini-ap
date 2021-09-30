package modulo02.aula15;

public class CalculadoraTaxas {
    // DEFINIÇÃO DOS ATRIBUTOS DA CLASSE
    private double taxaTransferencia;
    private double taxaSaque;

    // MÉTODO QUE RECEBE O VALOR A SER TRANSFERIDO E RETORNA O VALOR COM A TAXA DE
    // 0.001% EMBUTIDO
    public double calculaTaxaTransferencia(double valor) {
        return taxaTransferencia = (valor * 0.001);
    }

    // MÉTODO QUE SIMULA UM SAQUE, RECEBENDO UM VALOR E RETORNANDO ELE
    public double simulaSaque(double valor) {
        return valor;
    }

    // MÉTODO QUE CALCULA A TAXA DE SAQUE, RECEBE A QUANTIDADE DE SAQUES REALIZADOS,
    // VERIFICA SE É DIVISÍVEL POR 5, SE FOR, ACRESCENTA 1 NO CONTADOR E DÁ E
    // RETORNA A TAXA BASEADA NOS GRUPOS DE 5 SAQUES QUE FORAM REALIZADOS
    public double calculaTaxaSaque(int quantidade) {
        if (quantidade % 5 == 0) {
            return taxaSaque = ((quantidade / 5) * 1.30);
        }else{
            return 0.0;
        }
    }

    // MÉTODO QUE IMPRIME O VALOR DA TAXA DE TRANSFERÊNCIA
    public void imprimeTaxaTransferencia() {
        System.out.printf("\nTaxa de transferência: R$%.2f\n", taxaTransferencia);
    }

    // MÉTODO QUE IMPRIME O VALOR DA TAXA DE SAQUE
    public void imprimeTaxaSaque() {
        System.out.printf("\nTaxa de saque: R$%.2f\n", taxaSaque);
    }
}
