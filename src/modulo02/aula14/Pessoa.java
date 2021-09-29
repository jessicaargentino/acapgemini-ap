package modulo02.aula14;

public class Pessoa {
    String nome;
    String sobrenome;
    int idade;

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

        pessoa1.nome = "Laura";
        pessoa1.sobrenome = "Palmer";
        pessoa1.idade = 17;

        pessoa2.nome = "Luke";
        pessoa2.sobrenome = "Skywalker";
        pessoa2.idade = 53;
    }
}
