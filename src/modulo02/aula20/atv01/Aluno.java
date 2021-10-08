package modulo02.aula20.atv01;

/* Crie uma classe Aluno com os atributos privados nome completo, idade e
 * matricula. Crie os métodos getters e setters para cada atributo da classe
 * Aluno. Crie o métodos toString na classe Aluno, fazendo um override no
 * método padrão da classe Object. Crie uma classe Tela com um método main.
 * Crie na classe Tela, 2 objetos da classe Aluno, chame os métodos setters para
 * inserir valores e imprima os objetos utilizando o método toString. */

public class Aluno {
    /* DEFINIÇÃO DOS ATRIBUTOS */
    private String nomeCompleto;
    private int idade;
    private int matricula;

    /* GETTERS E SETTERS */
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getNomeCompleto() {
        return this.nomeCompleto;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    /* SOBREESCRITA DO MÉTODO TOSTRING DA CLASSE OBJECT */
    @Override
    public String toString() {
        return "Matrícula: " + this.getMatricula() + "\nNome completo: " + this.getNomeCompleto() + "\nIdade: "
                + this.getIdade() + " anos\n";
    }
}