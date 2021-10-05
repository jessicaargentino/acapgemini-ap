package modulo02.aula18;

/* CLASSE FILHA DE FUNCIONARIO */
public class Coordenador extends Funcionario {
    /* DEFINIÇÃO DOS ATRIBUTOS */
    private String cursoCoordenado;
    private double bonus;

    /* GETTERS E SETTERS */
    public void setCursoCoordenado(String cursoCoordenado) {
        this.cursoCoordenado = cursoCoordenado;
    }

    public String getCursoCoordenado() {
        return cursoCoordenado;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }
}
