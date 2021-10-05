package modulo02.aula18;

/* CLASSE FILHA DE PESSOA */
public class Aluno {
    /* DEFINIÇÃO DOS ATRIBUTOS */
    private String curso;
    private String turma;

    /* GETTERS E SETTERS */
    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getTurma() {
        return turma;
    }
}
