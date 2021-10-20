package modulo02.aula28.model;

public class Film {
    public int id;
    public static int counter = 1;
    public String name;
    public String genre;
    public int releaseYear;
    public String direction;

    /**
     * Construtor O id é incrementado a cada instância da classe
     */
    public Film() {
        this.id = counter++;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Film) {
            Film film = (Film) object;
            if (this.id == film.id) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "\nID: " + this.id + "\nNome: " + this.name + "\nGênero: " + this.genre + "\nAno de lançamento: "
                + this.releaseYear + "\nDireção: " + this.direction;
    }
}
