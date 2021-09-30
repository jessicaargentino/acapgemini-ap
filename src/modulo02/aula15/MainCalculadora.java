package modulo02.aula15;

public class MainCalculadora {
    public static void main(String[] args) {
        // CRIAÇÃO DE UM OBJETO ATRAVÉS DA INSTÂNCIA DA CLASSES CALCULADORATAXAS
        CalculadoraTaxas calculadora = new CalculadoraTaxas();

        // VARIÁVEL FIXA PARA TESTE DE VALOR
        double valor = 500.00;

        // IMPRESSÃO DE MENSAGEM DE INICIALIZAÇÃO
        System.out.println("***** CALCULADORA DE TAXAS *****\n");

        // CHAMADA DO MÉTODO PARA CALCULAR A TAXA
        calculadora.calculaTaxaTransferencia(valor);
        // IMPRESSÃO DO VALOR A SER TRANSFERIDO
        System.out.printf("Valor a ser transferido: R$%.2f", valor);
        // IMPRESSÃO DO VALOR DE TAXA DE TRANSFERÊNCIA
        calculadora.imprimeTaxaTransferencia();

        // ENQUANTO N FOR MENOR QUE 10, A FUNÇÃO CALCULA TAXA SAQUE É CHAMADA, O VALOR A
        // SER SACADO E A QUANTIDADE DE SAQUES JÁ REALIZADOS É IMPRESSA, E APÓS ISSO, A
        // TAXA DE SAQUE DE CADA TRANSAÇÃO É IMPRESSA
        for (int n = 0; n <= 10; n++) {
            calculadora.calculaTaxaSaque(valor);
            System.out.printf("\nValor a ser sacado: R$%.2f", valor);
            System.out.printf("\nQuantidade de saques realizados: %d", n + 1);
            calculadora.imprimeTaxaSaque();
        }
    }
}
