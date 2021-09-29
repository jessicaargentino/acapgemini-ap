package modulo02.aula14;

public class Pessoa {
    // DEFINIÇÃO DOS ATRIBUTOS DA CLASSE
    private String nome;
    private String sobrenome;
    private int idade;

    public static void main(String[] args) {
        // CRIAÇÃO DE DOIS OBJETOS ATRAVÉS DA INSTÂNCIA DA CLASSE PESSOA
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

        // PASSAGEM DE VALORES PARA OS ATRIBUTOS DA CLASSE
        pessoa1.nome = "Laura";
        pessoa1.sobrenome = "Palmer";
        pessoa1.idade = 17;

        pessoa2.nome = "Luke";
        pessoa2.sobrenome = "Skywalker";
        pessoa2.idade = 53;

        // CHAMADA DO MÉTODO DE IMPRESSÃO DO CABEÇALHO
        pessoa1.imprimeCabecalho();

        // CHAMADA DO MÉTODO DE IMPRESSÃO DOS VALORES PASSADOS PARA OS ATRIBUTOS
        pessoa1.imprimePessoas();
        pessoa2.imprimePessoas();
    }

    // MÉTODO QUE IMPRIME O CABEÇALHO/MENSAGEM INFORMATIVA
    public void imprimeCabecalho() {
        System.out.println("****** PESSOAS ******");
    }

    // MÉTODO QUE IMPRIME OS VALORES ATRIBUÍDOS AO OBJETO PESSOA
    public void imprimePessoas() {
        System.out.printf("Nome: %s %s\n", nome, sobrenome);
        System.out.printf("Idade: %d\n", idade);
    }
}
