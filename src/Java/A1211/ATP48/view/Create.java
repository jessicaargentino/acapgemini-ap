package Java.A1211.ATP48.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Crie uma cópia das classes criadas durante a atividade ATP47. Altere a
 * classe1 para utilizar preparedStatement. Altere a classe2 para receber os
 * parâmetros nome e descrição através de variáveis e troque o Statement para
 * PreparedStatement. Altere a classe3 para receber os nomes das categorias que
 * serão alteradas, através de variáveis e troque o Statement para
 * PreparedStatement. Altere a classe4 para receber o Id da categorias a ser
 * deletada através de variável e troque o Statement para PreparedStatement.
 */

public class Create {
    public static void main(String[] args) {
        /**
         * Criação de uma conexão com banco de dados Postgres e realização da inserção
         * de um novo registro na tabela categoria, desta vez utilizando
         * PreparedStatement para prevenir SQL Injection.
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

            String nome = "Eletrônicos";
            String descricao = "Dispositivos que utiliza energia elétrica";
            String query = "INSERT INTO categoria(nome, descricao) VALUES(?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, nome);
            preparedStatement.setString(2, descricao);
            preparedStatement.execute();
            ResultSet id = preparedStatement.getGeneratedKeys();

            while (id.next()) {
                int ids = id.getInt(1);
                System.out.println(ids);
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
