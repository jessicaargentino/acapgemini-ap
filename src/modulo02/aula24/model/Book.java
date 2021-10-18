package modulo02.aula24.model;

public class Book extends BaseModel {
    private String name;
    private String description;
    private String author;
    private String publisher;
    private int yearOfPublication;

    /**
     * Getters e setters
     */
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    /**
     * Sobreescrita do equals para comparação de um objeto com outro
     */
    @Override
    public boolean equals(Object obj) {
        Book book = (Book) obj;
        if (this.getId() == book.getId()) {
            return true;
        } else {
            return false;
        }
    }
}