package Java.A1111.ATP47.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
    public static void main(String[] args) {
        /**
         * Criação de uma conexão com banco de dados Postgres e realiza a
         * alteração/update na tabela categoria, alterando o nome das categorias de id 1
         * e 3 para móveis.
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
            String query = "UPDATE categoria SET nome = 'Móveis' WHERE id IN(1,3)";
            Statement statement = connection.createStatement();
            statement.execute(query);
            int linesAffecteds = statement.getUpdateCount();
            System.out.println(linesAffecteds);
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
