package Java.A1111.ATP46.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Read {
    public static void main(String[] args) {
        /**
         * Criação de uma conexão com banco de dados Postgres e realização da seleção de
         * todos os registros da tabela produto.
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
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM produto";
            statement.execute(query);
            ResultSet result = statement.getResultSet();

            while (result.next()) {
                int id = result.getInt("id");
                String nome = result.getString("nome");
                String descricao = result.getString("descricao");
                String id_categoria = result.getString("id_categoria");

                System.out.printf("ID: %d\nNome: %s\nDescrição: %s\nID Categoria: %s\n\n", id, nome, descricao,
                        id_categoria);
            }

            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
