package modulo02.aula18;

/* CLASSE FILHA DE FUNCIONARIO */
public class Coordenador {
    /* DEFINIÇÃO DOS ATRIBUTOS */
    private String cursoCoordenado;
    private String bonus;

    /* GETTERS E SETTERS */
    public void setCursoCoordenado(String cursoCoordenado) {
        this.cursoCoordenado = cursoCoordenado;
    }

    public String getCursoCoordenado() {
        return cursoCoordenado;
    }

    public void setBonus(String bonus) {
        this.bonus = bonus;
    }

    public String getBonus() {
        return bonus;
    }
}
