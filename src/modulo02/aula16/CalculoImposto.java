package modulo02.aula16;

public class CalculoImposto {
    /* DEFINIÇÃO DOS ATRIBUTOS DA CLASSE */
    private double iss = 0.079; // 7.9%
    private double iof = 0.034; // 3.4%
    private double ir = 0.225; // 22.5%;

    /*
     * MÉTODO QUE RECEBE UM VALOR POR PARÂMETRO E CALCULA O IMPOSTO ISS SOBRE O
     * MESMO
     */
    public double calculaISS(double valor) {
        return (valor * iss);
    }

    /*
     * MÉTODO QUE RECEBE UM VALOR POR PARÂMETRO E CALCULA O IMPOSTO IOF SOBRE O
     * MESMO
     */
    public double calculaIOF(double valor) {
        return (valor * iof);
    }

    /*
     * MÉTODO QUE RECEBE UM VALOR POR PARÂMETRO E CALCULA O IMPOSTO IR SOBRE O
     * MESMO
     */
    public double calculaIR(double valor) {
        return (valor * ir);
    }
}
