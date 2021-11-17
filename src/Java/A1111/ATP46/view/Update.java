package Java.A1111.ATP46.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
    public static void main(String[] args) {
        /**
         * Criação de uma conexão com banco de dados Postgres e realização da
         * alteração/update na tabela produto, alterando o ID de todos os produtos para
         * 3
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

            String query = "UPDATE produto SET id_categoria = 3";
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
