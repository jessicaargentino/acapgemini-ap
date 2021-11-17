package Java.A1211.ATP50.view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Java.A1211.ATP50.utils.ConnectionFactory;

/**
 * Crie uma cópia das classes criadas durante a atividade ATP48. Crie uma classe
 * ConnectionFactory para abrigar sua fábrica de conexões. Esta classe deve ter
 * um método que retorne uma Conexão com o Postgres. Altere as 4 classes para
 * utilizarem a fábrica de conexões e tambem o try with resource para que a
 * conexão seja fechada automaticamente.
 */

public class Create {
    public static void main(String[] args) {
        /**
         * Utilização do try-with-resources para realizar conexão com o banco, chamando
         * a conexão criada na classe ConnectionFactory e realização da inserção de um
         * novo registro na tabela categoria.
         */
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
