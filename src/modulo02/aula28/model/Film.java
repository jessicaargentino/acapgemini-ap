package modulo02.aula28.model;

public class Film extends Audiovisual {
    public String direction;

    @Override
    public String toString() {
        return super.toString() + "\nDireção: " + this.direction;
    }
}
