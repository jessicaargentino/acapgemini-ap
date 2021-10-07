package modulo02.aula20.atv02;

public class TelaBanco {
    public static void main(String[] args) {
        /*
         * CRIAÇÃO DE UM OBJETO ATRAVÉS DA INSTÂNCIA DA CLASSE CONTACORRENTE
         */
        ContaCorrente conta = new ContaCorrente(1500.0, 234567);

        /* CHAMADA DO MÉTODO DE REALIZAR DEPÓSITO */
        conta.recebeDeposito(500.0);

        /* CHAMADA DO MÉTODO DE REALIZAR SAQUE */
        conta.realizaSaque(1000.0);

        /* IMPRESSÃO ATRAVÉS DO TOSTRING */
        System.out.println(conta);
    }
}
