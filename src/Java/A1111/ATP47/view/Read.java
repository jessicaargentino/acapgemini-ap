package Java.A1111.ATP47.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Read {
    public static void main(String[] args) {
        /**
         * Criação de uma conexão com banco de dados Postgres e realiza a seleção do id
         * e nome de todos os registros da tabela categoria.
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
            String query = "SELECT id, nome FROM categoria";
            Statement statement = connection.createStatement();
            statement.execute(query);
            ResultSet result = statement.getResultSet();

            while (result.next()) {
                int id = result.getInt("id");
                String nome = result.getString("nome");

                System.out.printf("ID: %d\nNome: %s\n\n", id, nome);
            }

            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
