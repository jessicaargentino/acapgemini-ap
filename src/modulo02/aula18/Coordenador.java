package modulo02.aula18;

/* CLASSE FILHA DE FUNCIONARIO */
public class Coordenador extends Funcionario {
    /* DEFINIÇÃO DOS ATRIBUTOS */
    private String cursoCoordenado;
    private int bonus;

    /* GETTERS E SETTERS */
    public void setCursoCoordenado(String cursoCoordenado) {
        this.cursoCoordenado = cursoCoordenado;
    }

    public String getCursoCoordenado() {
        return cursoCoordenado;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }
}
