package Java.A1111.ATP47.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Utilize as tabelas e os registros criados durante as atividades ATP41 e
 * ATP42. Crie uma conexão com o banco de dados postgresql utilizando
 * JDBC(java.sql.*). Crie 4 classes para realizar as 4 operações de CRUD. Na
 * classe1, liste id e nome de todas as linhas da tabela Categoria. Na classe2,
 * insira uma nova Categoria e imprima o id gerado. Na classe3, altere o nome da
 * primeira e segunda categoria da tabela e exiba a quantidade de linhas
 * afetadas. Na classe4, delete as ultimas categorias cadastradas.
 */

public class Create {
    public static void main(String[] args) {
        /**
         * Criação de uma conexão com banco de dados Postgres e realização da inserção
         * de um novo registro na tabela categoria.
         */
        try {
            String driverType = "jdbc";
            String driverName = "postgresql";
            String host = "localhost";
            int port = 5432;
            String database = "postgres";
            String user = "postgres";
            String password = "admin";

            String stringConnection = String.format("%s:%s://%s:%d/%s", driverType, driverName, host, port, database);
            Connection connection = DriverManager.getConnection(stringConnection, user, password);
            String query = "INSERT INTO categoria(nome, descricao) VALUES('Eletrônicos', 'Dispositivos que utiliza energia elétrica')";
            Statement statement = connection.createStatement();
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