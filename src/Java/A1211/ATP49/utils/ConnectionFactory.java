package Java.A1211.ATP49.utils;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {
    private DataSource dataSource;

    /**
     * Construtor que através do mchange/ComboPooledDataSource cria um pool com 10
     * conexões no nosso banco
     */
    public ConnectionFactory() {
        ComboPooledDataSource pool = new ComboPooledDataSource();
        pool.setJdbcUrl("jdbc:postgresql://192.168.0.18:5432/postgres");
        pool.setUser("postgres");
        pool.setPassword("admin");
        pool.setMaxPoolSize(10);
        this.dataSource = pool;
    }

    /**
     * Método do tipo Connection que retorna o datasource (interface do java que
     * abstrai a conexão)
     * 
     * @return o pool de conexões (retorna uma das conexões do mesmo)
     * @throws SQLException
     */
    public Connection getConnection() throws SQLException {
        return this.dataSource.getConnection();
    }
}
