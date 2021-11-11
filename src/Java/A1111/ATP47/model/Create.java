package Java.A1111.ATP47.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Create {
    /**
     * Método que cria uma conexão com banco de dados Postgres e realiza a inserção
     * de um novo registro na tabela categoria.
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

            String stringConnection = String.format("%s:%s://%s:%d/%s", driverType, driverName, host, port, database);
            Connection connection = DriverManager.getConnection(stringConnection, user, password);
            String query = "INSERT INTO categoria(nome, descricao) VALUES('Eletrônicos', 'Dispositivos que utiliza energia elétrica')";
            Statement statement = connection.createStatement();
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
