package modulo03.aula07.atv02.controller;

import java.util.ArrayList;

import modulo03.aula07.atv02.dao.BaseMethods;
import modulo03.aula07.atv02.model.TouristAttraction;

public class TouristAttractionListController implements BaseMethods<TouristAttraction> {
    private ArrayList<TouristAttraction> data;

    /** Construtor que inicializa o ArrayList */
    public TouristAttractionListController() {
        this.data = new ArrayList<TouristAttraction>();
    }

    /**
     * Método que adiciona o objeto de TouristAttraction ao ArrayList
     * 
     * @param object objeto de TouristAttraction
     */
    @Override
    public String save(TouristAttraction object) {
        this.data.add(object);
        return "Arquivo criado com sucesso!";
    }

    /** Método que retorna o ArrayList de TouristAttraction */
    @Override
    public ArrayList<TouristAttraction> read() {
        return this.data;
    }

}
