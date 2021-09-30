package modulo02.aula15;

public class CalculadoraTaxas {
    // DEFINIÇÃO DOS ATRIBUTOS DA CLASSE
    private double taxaTransferencia;
    private double taxaSaque;

    // MÉTODO QUE RECEBE O VALOR A SER TRANSFERIDO E RETORNA O VALOR COM A TAXA DE
    // 0.001% EMBUTIDO
    public double calculaTaxaTransferencia(double valor) {
        return taxaTransferencia += (taxaTransferencia * 0.001);
    }

    // MÉTODO QUE VALIDA A QUANTIDADE DE SAQUES REALIZADOS PELO USUÁRIO, SE FOR
    // IGUAL A 5, RETORNA TRUE/CARECE DE APLICAÇÃO DE TAXA, SE NÃO, RETORNA FALSE
    public boolean validaSaque(int quantidade) {
        if (quantidade == 5) {
            return true;
        } else {
            return false;
        }
    }
}
