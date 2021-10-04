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
    
        /* ACESSO DOS VALORES UTILIZANDO OS GETTERS E ARMAZENAMENTO DOS MESMOS NAS VARIÁVEIS */
        int codigo = produto.getCodigo();
        String nome = produto.getNome();
        String descricao = produto.getDescricao();
        double valor = produto.getValor();

    }
}
