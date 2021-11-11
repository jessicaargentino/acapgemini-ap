package Java.A1111.view;

import Java.A1111.model.Create;
import Java.A1111.model.Delete;
import Java.A1111.model.Read;
import Java.A1111.model.Update;

/**
 * Utilize as tabelas e os registros criados durante as atividades ATP41 e
 * ATP42. Faça o download do driver JDBC para o postgres e configure no seu
 * projeto. Crie uma conexão com o banco de dados postgresql utilizando
 * JDBC(java.sql.*). Crie 4 classes para realizar as 4 operações de CRUD. Na
 * classe1, liste todos os dados de todas as colunas da tabela produto. Na
 * classe2, insira um novo produto na tabela e imprima o id gerado. Na classe3,
 * altere todos os produtos para a mesma categoria e exiba a quantidade de
 * linhas afetadas. Na classe4, delete um produto pelo id.
 */
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
