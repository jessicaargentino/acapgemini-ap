package modulo02.aula28.model;

public class Series extends Audiovisual {
    public int season;

    @Override
    public String toString() {
        return super.toString() + "\nTemporadas: " + this.season;
    }
}
