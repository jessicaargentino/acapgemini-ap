package modulo02.aula19;

/* Altere a classe Conta Corrente construindo um método para sobrescrever o
* método de transfêrencia, da classe Conta. _ O novo método deve utilizar as
* funções do método principal, além de debitar a taxa de transferência do saldo
* da conta. O método de transferência da Conta Corrente também deve
* armazenar, no atributo número de transferencias, a quantidade de
* transferências realizadas e a cada 5 transferências deve debitar do saldo, o
* valor da taxa de manutenção de conta.
* 
* Altere a classe Teste, para realizar mais de 5 transferências na Conta
* Corrente, antes de imprimir os resultados. */

public class Teste {
    public static void main(String[] args) {
        /*
         * CRIAÇÃO DE DOIS OBJETOS ATRAVÉS DA INSTÂNCIA DAS CLASSES CONTA E
         * CONTACORRENTE
         */
        Conta conta = new Conta();
        ContaCorrente cc = new ContaCorrente();

        /* ATRIBUIÇÃO DE VALORES PARA CONTA E CC UTILIZANDO SETTER */
        conta.setCodigoCliente(120004);
        conta.setSaldo(1000.00);
        double saldoConta = conta.getSaldo();
        cc.setCodigoCliente(198970);
        cc.setSaldo(1500.00);
        double saldoCc = cc.getSaldo();

        /* CHAMADA DO MÉTODO DE TRANSFERÊNCIA PARA CADA OBJETO */
        conta.realizaTransferencia(500.00);
        cc.realizaTransferencia(200.00);

        /* IMPRESSÃO DE CABEÇALHO */
        System.out.println("***** CAPBANCO *****");

        /* IMPRESSÃO DOS ATRIBUTOS */
        System.out.printf("\nConta - código cliente: %d\n", conta.getCodigoCliente());
        System.out.printf("Saldo prévio: R$%.2f\n", saldoConta);
        System.out.printf("Saldo atual pós transferência: R$%.2f\n", conta.getSaldo());

        System.out.printf("\nConta Corrente - código cliente: %d\n", cc.getCodigoCliente());
        System.out.printf("Saldo prévio: R$%.2f\n", saldoCc);
        System.out.printf("Saldo atual pós transferência: R$%.2f\n", cc.getSaldo());

        /* REALIZAÇÃO DE 4 TRANSFERÊNCIAS */
        cc.realizaTransferencia(170.00);
        cc.realizaTransferencia(89.00);
        cc.realizaTransferencia(83.00);
        cc.realizaTransferencia(98.00);

        /* IMPRESSÃO APÓS NOVAS TRANSFERÊNCIAS */
        System.out.printf("\nConta Corrente - código cliente: %d\n", cc.getCodigoCliente());
        System.out.printf("Saldo prévio: R$%.2f\n", saldoCc);
        System.out.printf("Saldo atual pós transferência: R$%.2f\n", cc.getSaldo());
    }
}
