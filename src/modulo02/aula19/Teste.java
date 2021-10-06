package modulo02.aula19;

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
        cc.setCodigoCliente(198970);
        cc.setSaldo(1500.00);
    }
}
