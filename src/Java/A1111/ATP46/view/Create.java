package Java.A1111.ATP46.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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

public class Create {
    public static void main(String[] args) {
        /**
         * Criação de uma conexão com banco de dados Postgres e realiza a inserção de um
         * novo registro na tabela produto.
         */
        try {
            String driverType = "jdbc";
            String driverName = "postgresql";
            String host = "localhost";
            int port = 5432;
            String database = "postgres";
            String user = "postgres";
            String password = "admin";

            String connectionString = String.format("%s:%s://%s:%d/%s", driverType, driverName, host, port, database);
            Connection connection = DriverManager.getConnection(connectionString, user, password);

            Statement statement = connection.createStatement();
            String query = "INSERT INTO produto(nome, descricao, preco, id_categoria) VALUES('Protetor Solar Anasol 50FPS', 'Loção para proteção da radiação do sol', 36.90, 3)";
            statement.execute(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet id = statement.getGeneratedKeys();

            while (id.next()) {
                int ids = id.getInt(1);
                System.out.println(ids);
            }

            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
