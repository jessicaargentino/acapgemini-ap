package modulo02.aula18;

/* CLASSE PAI*/
public class Pessoa {
    /* DEFINIÇÃO DOS ATRIBUTOS */
    private String nome;
    private String sobrenome;
    private int matricula;

    /* GETTERS E SETTERS */
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }
}