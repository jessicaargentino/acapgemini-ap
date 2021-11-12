package Java.A1211.ATP48.view;

import Java.A1211.ATP48.model.Create;
import Java.A1211.ATP48.model.Delete;
import Java.A1211.ATP48.model.Read;
import Java.A1211.ATP48.model.Update;

/**
 * Crie uma cópia das classes criadas durante a atividade ATP47. Altere a
 * classe1 para utilizar preparedStatement. Altere a classe2 para receber os
 * parâmetros nome e descrição através de variáveis e troque o Statement para
 * PreparedStatement. Altere a classe3 para receber os nomes das categorias que
 * serão alteradas, através de variáveis e troque o Statement para
 * PreparedStatement. Altere a classe4 para receber o Id da categorias a ser
 * deletada através de variável e troque o Statement para PreparedStatement.
 */
public class Crud {
    public static void main(String[] args) {
        /** Criação dos objetos classes */
        Create create = new Create();
        Read read = new Read();
        Update update = new Update();
        Delete delete = new Delete();

        /** Chamada dos métodos */
        read.read();
        create.create();
        update.update();
        delete.delete();
    }
}
