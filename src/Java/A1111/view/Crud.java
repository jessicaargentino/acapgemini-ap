package Java.A1111.view;

import Java.A1111.model.Create;
import Java.A1111.model.Delete;
import Java.A1111.model.Read;
import Java.A1111.model.Update;

public class Crud {
    public static void main(String[] args) {
        /** Criação de objetos das classes */
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
