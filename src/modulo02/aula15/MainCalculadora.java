package modulo02.aula15;

public class MainCalculadora {
    public static void main(String[] args) {
        // CRIAÇÃO DE UM OBJETO ATRAVÉS DA INSTÂNCIA DA CLASSES CALCULADORATAXAS
        CalculadoraTaxas calculadora = new CalculadoraTaxas();

        // VARIÁVEL AUXILIAR PARA TESTES DE VALORES
        double valor = 0;

        // VARIÁVEL AUXILIAR PARA CONTAR OS SAQUES
        int contador = 0;

        // ATRIBUIÇÃO DE VALOR Á VARIÁVEL VALOR, CHAMADA DO MÉTODO DE CALCULAR TAXA
        // PASSANDO O VALOR COMO PARÂMETRO, IMPRESSÃO DO VALOR A SER TRANSFERIDO E DA
        // TAXA DE SAQUE A SER PAGA
        valor = 500.00;
        calculadora.calculaTaxaTransferencia(valor);
        System.out.printf("Valor a ser transferido: R$%.2f", valor);
        calculadora.imprimeTaxaTransferencia();

        valor = 980.00;
        calculadora.calculaTaxaTransferencia(valor);
        System.out.printf("\nValor a ser transferido: R$%.2f", valor);
        calculadora.imprimeTaxaTransferencia();

        // ATRIBUIÇÃO DE VALOR Á VARIÁVEL VALOR, CHAMADA DO MÉTODO DE SIMULAR SAQUE
        // PASSANDO O VALOR COMO PARÂMETRO, ACUMULA A QUANTIDADE DE SAQUES FEITOS NA
        // VARIÁVEL CONTADOR, AO FINAL, CHAMA O MÉTODO DE CALCULAR TAXA PASSANDO O
        // CONTADOR COMO PARÂMETRO, IMPRIME A QUANTIDADE DE SAQUES REALIDOS E O VALOR DA
        // TAXA
        valor = 60.00;
        calculadora.simulaSaque(valor);
        contador++;

        valor = 160.00;
        calculadora.simulaSaque(valor);
        contador++;

        valor = 92.00;
        calculadora.simulaSaque(valor);
        contador++;

        valor = 45.00;
        calculadora.simulaSaque(valor);
        contador++;

        valor = 20.00;
        calculadora.simulaSaque(valor);
        contador++;

        calculadora.calculaTaxaSaque(contador);
        System.out.printf("\nQuantidade de saques realizados: %d", contador);
        calculadora.imprimeTaxaSaque();

    }
}
