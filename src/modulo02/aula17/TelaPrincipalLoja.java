package modulo02.aula17;

public class TelaPrincipalLoja {
    public static void main(String[] args) {
        /* CRIAÇÃO DE UM OBJETO ATRAVÉS DA INSTÂNCIA DA CLASSE PRODUTO */
        Produto produto = new Produto();

        /* ATRIBUIÇÃO DE VALORES UTILIZANDO OS SETTERS */
        produto.setCodigo(18365);
        produto.setNome("Kalimba");
        produto.setDescricao("Instrumento musical");
        produto.setValor(80.00);

        /*
         * ACESSO DOS VALORES UTILIZANDO OS GETTERS E ARMAZENAMENTO DOS MESMOS NAS
         * VARIÁVEIS
         */
        int codigo = produto.getCodigo();
        String nome = produto.getNome();
        String descricao = produto.getDescricao();
        double valor = produto.getValor();

        /* IMPRESSÃO DOS VALORES */
        System.out.println("***** PRODUTOS *****");
        System.out.printf("Código produto: %d\n", codigo);
        System.out.printf("Nome: %s\n", nome);
        System.out.printf("Descrição: %s\n", descricao);
        System.out.printf("Valor: R$%.2f\n", valor);
    }
}
