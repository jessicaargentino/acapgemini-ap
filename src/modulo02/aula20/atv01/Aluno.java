package modulo02.aula20.atv01;

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
}