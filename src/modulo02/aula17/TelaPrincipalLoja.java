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
    
    }
}
