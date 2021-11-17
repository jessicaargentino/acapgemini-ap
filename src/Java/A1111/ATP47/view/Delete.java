package Java.A1111.ATP47.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
    public static void main(String[] args) {
        /**
         * Criaçãod de uma conexão com banco de dados Postgres e realiza a exclusão dos
         * últimos registros (id > 3) inseridos na tabela categoria.
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
            String query = "DELETE FROM categoria WHERE id > 3";
            Statement statement = connection.createStatement();
            statement.execute(query);
            int linesAfeccted = statement.getUpdateCount();
            System.out.println(linesAfeccted);
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
