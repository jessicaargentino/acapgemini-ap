package Java.A1211.ATP50.view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import Java.A1211.ATP50.utils.ConnectionFactory;

public class Delete {
    public static void main(String[] args) {
        /**
         * Utilização do try-with-resources para realizar conexão com o banco, chamando
         * a conexão criada na classe ConnectionFactory e realização da exclusão dos
         * últimos registros (id > 3) inseridos na tabela categoria.
         */
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