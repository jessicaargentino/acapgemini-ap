package modulo02.aula16;

public class Main {
    public static void main(String[] args) {
        /* CRIAÇÃO DE UM OBJETO ATRAVÉS DA INSTÂNCIA DA CLASSE CALCULOIMPOSTO */
        CalculoImposto imposto = new CalculoImposto();

        /*
         * CRIAÇÃO DE TRÊS VARIÁVEIS PARA ARMAZENAR OS VALORES RETORNADOS PELOS MÉTODOS
         * QUE ESTÃO SENDO CHAMADOS
         */
        double iss = imposto.calculaISS(500.00);
        double iof = imposto.calculaIOF(987.67);
        double ir = imposto.calculaIR(34.90);

        /* IMPRESSÃO DOS IMPOSTOS */
        System.out.println("***** IMPOSTOS *****");
        System.out.printf("ISS: R$%.2f\nIOF: R$%.2f\nIR: R$%.2f", iss, iof, ir);
    }

}
