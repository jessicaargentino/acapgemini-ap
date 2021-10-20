package modulo02.aula28.view;

import modulo02.aula28.controller.FilmController;
import modulo02.aula28.controller.SeriesController;
import modulo02.aula28.model.Film;
import modulo02.aula28.model.Series;

/**
 * Crie um sistema de cadastro de Filmes e Séries. O sistema deve utilizar o
 * padrão de arquitetura MVC. Os modelos devem possuir um id e outros atributos
 * públicos de sua escolha. As controllers devem possuir os quatro métodos de
 * CRUD e deve utilizar um ArrayList privado para manter os dados. (Utilize o
 * conceito de Generics nas Controllers). A view deve testar as operações de
 * CRUD para cada controller (Utilize dados fixo, sem entrada do usuário)
 */
public class MainView {
    public static void main(String[] args) {
        /** Instância dos controllers e dos objetos das classes Film e Series */
        FilmController filmController = new FilmController();
        SeriesController seriesController = new SeriesController();

        Film filmOne = new Film();
        Film filmTwo = new Film();
        Series series = new Series();

        /** Atribuição de valores */
        filmOne.name = "Star Wars - The Empire Strikes Back";
        filmOne.genre = "Ficção científica";
        filmOne.releaseYear = 1980;
        filmOne.direction = "Irvin Kershner";

        filmTwo.name = "O Fantástico Sr Raposo";
        filmTwo.genre = "Animação";
        filmTwo.releaseYear = 2009;
        filmTwo.direction = "Wes Anderson";

        series.name = "Bates Motel";
        series.genre = "Drama e suspense";
        series.releaseYear = 2013;
        series.season = 5;

        /** Adição dos objetos no ArrayList */
        filmController.create(filmOne);
        filmController.create(filmTwo);
        seriesController.create(series);

        /** Impressão dos objetos nos ArrayList */
        System.out.println("***** FILMES E SÉRIES INICIAIS *****");
        for (Film film : filmController.read()) {
            System.out.println(film);
        }

        for (Series s : seriesController.read()) {
            System.out.println(s);
        }

        /** Atualização de um filme e uma série */
        series.name = "Twin Peaks";
        series.genre = "Suspense surrealista";
        series.releaseYear = 1990;
        series.season = 3;
        seriesController.update(series);

        filmTwo.name = "O Labirinto do Fauno";
        filmTwo.genre = "Fantasia";
        filmTwo.releaseYear = 2006;
        filmTwo.direction = "Guillermo del Toro";
        filmController.update(filmTwo);

        /** Reimpressão dos objetos no ArrayList */
        System.out.println("\n***** FILMES E SÉRIES ATUALIZADOS *****");
        for (Film film : filmController.read()) {
            System.out.println(film);
        }

        for (Series s : seriesController.read()) {
            System.out.println(s);
        }

        /** Excluindo um filme e uma série */
        filmController.delete(filmOne);
        seriesController.delete(series);

        /** Reimpressão dos objetos no ArrayList */
        System.out.println("\n***** FILMES E SÉRIES APÓS EXCLUSÃO *****");
        for (Film film : filmController.read()) {
            System.out.println(film);
        }

        for (Series s : seriesController.read()) {
            System.out.println(s);
        }
    }
}