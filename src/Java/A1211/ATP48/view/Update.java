package Java.A1211.ATP48.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
    public static void main(String[] args) {
        /**
         * Criação de uma conexão com banco de dados Postgres e realiza a
         * alteração/update na tabela categoria, alterando o nome das categorias de id 1
         * e 3 para móveis, desta vez utilizando PreparedStatement para prevenir SQL
         * Injection.
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

            String nome = "Móveis";
            int idOne = 1;
            int idTwo = 3;
            String query = "UPDATE categoria SET nome = ? WHERE id IN(?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, nome);
            preparedStatement.setInt(2, idOne);
            preparedStatement.setInt(3, idTwo);
            preparedStatement.execute();

            int linesAffecteds = preparedStatement.getUpdateCount();
            System.out.println(linesAffecteds);
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
