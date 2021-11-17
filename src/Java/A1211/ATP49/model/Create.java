package Java.A1211.ATP49.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Java.A1211.ATP49.utils.ConnectionFactory;

public class Create {
    /**
     * Método que utiliza o try-with-resources para chamar realizar uma conexão com
     * o banco chamando a conexão criada na classe ConnectionFactory e realiza a
     * inserção de um novo registro na tabela categoria.
     */
    public void create() {
        try (Connection connection = new ConnectionFactory().getConnection()) {
            String nome = "Eletrônicos";
            String descricao = "Dispositivos que utiliza energia elétrica";
            String query = "INSERT INTO categoria(nome, descricao) VALUES(?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query,
                    Statement.RETURN_GENERATED_KEYS)) {
                preparedStatement.setString(1, nome);
                preparedStatement.setString(2, descricao);
                preparedStatement.execute();
                ResultSet id = preparedStatement.getGeneratedKeys();

                while (id.next()) {
                    int ids = id.getInt(1);
                    System.out.println(ids);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
