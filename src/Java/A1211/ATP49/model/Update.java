package Java.A1211.ATP49.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import Java.A1211.ATP49.utils.ConnectionFactory;

public class Update {
    /**
     * Método que utiliza o try-with-resources para chamar realizar uma conexão com
     * o banco chamando a conexão criada na classe ConnectionFactory e realiza a
     * alteração/update na tabela categoria, alterando o nome das categorias de id 1
     * e 3 para móveis.
     */
    public void update() {
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
