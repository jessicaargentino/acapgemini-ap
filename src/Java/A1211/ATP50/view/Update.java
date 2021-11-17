package Java.A1211.ATP50.view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import Java.A1211.ATP50.utils.ConnectionFactory;

public class Update {
    public static void main(String[] args) {
        /**
         * Utilização do try-with-resources para realizar uma conexão com o banco,
         * chamando a conexão criada na classe ConnectionFactory e realização da
         * alteração/update na tabela categoria, alterando o nome das categorias de id 1
         * e 3 para móveis.
         */
        try (Connection connection = new ConnectionFactory().getConnection()) {
            String nome = "Móveis";
            int idOne = 1;
            int idTwo = 3;
            String query = "UPDATE categoria SET nome = ? WHERE id IN(?, ?)";

            try (PreparedStatement preparedStatement = connection.prepareStatement(query,
                    Statement.RETURN_GENERATED_KEYS)) {
                preparedStatement.setString(1, nome);
                preparedStatement.setInt(2, idOne);
                preparedStatement.setInt(3, idTwo);
                preparedStatement.execute();
                int linesAffecteds = preparedStatement.getUpdateCount();
                System.out.println(linesAffecteds);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
