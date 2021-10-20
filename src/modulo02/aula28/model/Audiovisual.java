package modulo02.aula28.model;

/** Classe base com os atributos comuns a classe Film e Series */
public abstract class Audiovisual {
    public int id;
    public static int counter = 1;
    public String name;
    public String genre;
    public int releaseYear;

    /**
     * Construtor O id é incrementado a cada instância da classe
     */
    public Audiovisual() {
        this.id = counter++;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Audiovisual) {
            Audiovisual audiovisual = (Audiovisual) object;
            if (this.id == audiovisual.id) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "\nID: " + this.id + "\nNome: " + this.name + "\nGênero: " + this.genre + "\nAno de lançamento: "
                + this.releaseYear;
    }
}
