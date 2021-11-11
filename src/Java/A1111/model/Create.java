package Java.A1111.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Create {
    /**
     * Método que cria uma conexão com banco de dados Postgres e realiza a inserção
     * de um novo registro na tabela produto.
     */
    public void create() {
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
            statement.execute(query, statement.RETURN_GENERATED_KEYS);
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
