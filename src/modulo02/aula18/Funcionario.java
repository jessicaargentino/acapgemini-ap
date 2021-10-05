package modulo02.aula18;

/* CLASSE FILHA DE PESSOA */
public class Funcionario {
    /* DEFINIÇÃO DOS ATRIBUTOS */
    private double salario;
    private String departamento;

    /* GETTERS E SETTERS */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }
}
