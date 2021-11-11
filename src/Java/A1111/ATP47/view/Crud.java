package Java.A1111.ATP47.view;

import Java.A1111.ATP47.model.Create;
import Java.A1111.ATP47.model.Delete;
import Java.A1111.ATP47.model.Read;
import Java.A1111.ATP47.model.Update;

/**
 * Utilize as tabelas e os registros criados durante as atividades ATP41 e
 * ATP42. Crie uma conexão com o banco de dados postgresql utilizando
 * JDBC(java.sql.*). Crie 4 classes para realizar as 4 operações de CRUD. Na
 * classe1, liste id e nome de todas as linhas da tabela Categoria. Na classe2,
 * insira uma nova Categoria e imprima o id gerado. Na classe3, altere o nome da
 * primeira e segunda categoria da tabela e exiba a quantidade de linhas
 * afetadas. Na classe4, delete as ultimas categorias cadastradas.
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
