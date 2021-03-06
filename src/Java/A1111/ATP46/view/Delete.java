package Java.A1111.ATP46.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
    public static void main(String[] args) {
        /**
         * Criação de uma conexão com banco de dados Postgres e realização de exclusão
         * do registro de id 2 na tabela produto.
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
            String query = "DELETE FROM produto WHERE id = 2";
            Statement statement = connection.createStatement();
            statement.execute(query);
            int linesAffected = statement.getUpdateCount();
            System.out.println(linesAffected);

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
