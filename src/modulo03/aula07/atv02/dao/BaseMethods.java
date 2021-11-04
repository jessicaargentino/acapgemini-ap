package modulo03.aula07.atv02.dao;

import java.util.ArrayList;

public interface BaseMethods<T> {
    public String save(T object);
    public ArrayList<T> read();
}
