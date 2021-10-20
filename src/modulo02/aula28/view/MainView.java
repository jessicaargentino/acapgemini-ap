package modulo02.aula28.view;

import modulo02.aula28.controller.FilmController;
import modulo02.aula28.controller.SeriesController;
import modulo02.aula28.model.Film;
import modulo02.aula28.model.Series;

public class MainView {
    public static void main(String[] args) {
        /** Instância dos controllers e dos objetos das classes Film e Series */
        FilmController filmController = new FilmController();
        SeriesController seriesController = new SeriesController();

        Film film = new Film();
        Series series = new Series();

        /** Atribuição de valores */
        film.name = "Star Wars - The Empire Strikes Back";
        film.genre = "Ficção científica";
        film.releaseYear = 1980;
        film.direction = "Irvin Kershner";

        series.name = "Twin Peaks";
        series.genre = "Suspense surrealista";
        series.releaseYear = 1990;
        series.season = 3;

    }
}