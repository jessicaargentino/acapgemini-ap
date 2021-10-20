package modulo02.aula28.model;

public class Series {
    public int id;
    public static int counter = 1;
    public String name;
    public String genre;
    public int releaseYear;
    public int season;

    /**
     * Construtor O id é incrementado a cada instância da classe
     */
    public Series() {
        this.id = counter++;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Series) {
            Series series = (Series) object;
            if (this.id == series.id) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "\nID: " + this.id + "\nNome: " + this.name + "\nGênero: " + this.genre + "\nAno de lançamento: "
                + this.releaseYear + "\nTemporadas: " + this.season;
    }
}
