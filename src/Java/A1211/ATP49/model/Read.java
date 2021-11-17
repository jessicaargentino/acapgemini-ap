package Java.A1211.ATP49.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Java.A1211.ATP49.utils.ConnectionFactory;

public class Read {
    /**
     * Método que utiliza o try-with-resources para chamar realizar uma conexão com
     * o banco chamando a conexão criada na classe ConnectionFactory e realiza a
     * seleção do id e nome de todos os registros da tabela categoria.
     */
    public void read() {
        try (Connection connection = new ConnectionFactory().getConnection()) {
            String query = "SELECT id, nome FROM categoria";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query,
                    Statement.RETURN_GENERATED_KEYS)) {
                preparedStatement.execute();
                ResultSet result = preparedStatement.getResultSet();

                while (result.next()) {
                    int id = result.getInt("id");
                    String nome = result.getString("nome");

                    System.out.printf("ID: %d\nNome: %s\n\n", id, nome);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
