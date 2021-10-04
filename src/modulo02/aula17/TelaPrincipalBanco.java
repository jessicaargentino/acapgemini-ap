package modulo02.aula17;

public class TelaPrincipalBanco {
    public static void main(String[] args) {
        /* CRIAÇÃO DE UM OBJETO ATRAVÉS DA INSTÂNCIA DA CLASSE CONTACORRENTE */
        ContaCorrente conta = new ContaCorrente();

        /* ATRIBUIÇÃO DE VALORES UTILIZANDO OS SETTERS */
        conta.setAgencia(8786);
        conta.setNumero(873361);
        conta.setCodigoCliente(9876);
        conta.setSaldo(6500.00);

        /*
         * ACESSO DOS VALORES UTILIZANDO OS GETTERS E ARMAZENAMENTO DOS MESMOS NAS
         * VARIÁVEIS
         */
        int agencia = conta.getAgencia();
        int numero = conta.getNumero();
        int codigoCliente = conta.getCodigoCliente();
        double saldo = conta.getSaldo();

        /* IMPRESSÃO DOS VALORES */
        System.out.println("***** CONTA CORRENTE *****");
        System.out.printf("Agência: %d\n", agencia);
        System.out.printf("Número: %d\n", numero);
        System.out.printf("Código cliente: %d\n", codigoCliente);
        System.out.printf("Saldo: R$%.2f\n", saldo);

    }
}
