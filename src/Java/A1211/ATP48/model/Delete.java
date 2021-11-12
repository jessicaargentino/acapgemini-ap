package Java.A1211.ATP48.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
    /**
     * Método que cria uma conexão com banco de dados Postgres e realiza a exclusão
     * dos últimos registros (id > 3) inseridos na tabela categoria.
     */
    public void delete() {
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

            int id = 3;
            String query = "DELETE FROM categoria WHERE id > ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();

            int linesAfeccted = preparedStatement.getUpdateCount();
            System.out.println(linesAfeccted);

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
