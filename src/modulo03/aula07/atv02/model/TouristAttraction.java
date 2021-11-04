package modulo03.aula07.atv02.model;

public class TouristAttraction {
    public String name;
    public String description;
    public String location;

    /** Construtor genérico */
    public TouristAttraction() {
    }

    /**
     * Construtor que recebe uma String e a converte para objeto TouristAttraction
     * armazenando os valores nos atributos
     * 
     * @param touristAttractionString
     */
    public TouristAttraction(String touristAttractionString) {
        String[] data = touristAttractionString.split(";");
        this.name = data[0];
        this.description = data[1];
        this.location = data[2];
    }

    @Override
    public String toString() {
        return this.name + ";" + this.description + ";" + this.location;
    }
}
