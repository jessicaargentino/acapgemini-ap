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

    }
}
