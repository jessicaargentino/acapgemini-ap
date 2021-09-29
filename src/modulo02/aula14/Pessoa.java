package modulo02.aula14;

public class Pessoa {
    // DEFINIÇÃO DOS ATRIBUTOS DA CLASSE
    String nome;
    String sobrenome;
    int idade;

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

        // IMPRESSÃO DOS VALORES PASSADOS PARA OS ATRIBUTOS
        System.out.println("***** PESSOAS *****");
        System.out.printf("Nome: %s %s\n", pessoa1.nome, pessoa1.sobrenome);
        System.out.printf("Idade: %d\n", pessoa1.idade);
        System.out.printf("Nome: %s %s\n", pessoa2.nome, pessoa2.sobrenome);
        System.out.printf("Idade: %d\n", pessoa2.idade);
    }
}
