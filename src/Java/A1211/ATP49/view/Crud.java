package Java.A1211.ATP49.view;

import Java.A1211.ATP49.model.Create;
import Java.A1211.ATP49.model.Delete;
import Java.A1211.ATP49.model.Read;
import Java.A1211.ATP49.model.Update;

/**
 * Crie uma cópia das classes criadas durante a atividade ATP48. Crie uma classe
 * ConnectionFactory para abrigar sua fábrica de conexões. Esta classe deve ter
 * um método que retorne uma Conexão com o Postgres. Altere as 4 classes para
 * utilizarem a fábrica de conexões e tambem o try with resource para que a
 * conexão seja fechada automaticamente.
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
