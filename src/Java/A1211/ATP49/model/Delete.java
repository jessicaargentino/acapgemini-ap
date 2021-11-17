package Java.A1211.ATP49.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import Java.A1211.ATP49.utils.ConnectionFactory;

public class Delete {
    /**
     * Método que utiliza o try-with-resources para chamar realizar uma conexão com
     * o banco chamando a conexão criada na classe ConnectionFactory e realiza a
     * exclusão dos últimos registros (id > 3) inseridos na tabela categoria.
     */
    public void delete() {
        try (Connection connection = new ConnectionFactory().getConnection()) {
            int id = 3;
            String query = "DELETE FROM categoria WHERE id > ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query,
                    Statement.RETURN_GENERATED_KEYS)) {
                preparedStatement.setInt(1, id);
                preparedStatement.execute();

                int linesAfeccted = preparedStatement.getUpdateCount();
                System.out.println(linesAfeccted);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}