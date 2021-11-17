package Java.A1211.ATP49.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private String driverType;
    private String driverName;
    private String host;
    private int port;
    private String database;
    private String user;
    private String password;

    /** Construtor que inicia os atributos da classe */
    public ConnectionFactory() {
        driverType = "jdbc";
        driverName = "postgresql";
        host = "localhost";
        port = 5432;
        database = "postgres";
        user = "postgres";
        password = "admin";
    }

    /**
     * Método que através de uma String formatada com o pattern da conexão, retorna
     * a conexão.
     * 
     * @return conexão com o banco de dados
     * @throws SQLException
     */
    public Connection getConnection() throws SQLException {
        String stringConnection = String.format("%s:%s://%s:%d/%s", this.driverType, this.driverName, this.host,
                this.port, this.database);
        return DriverManager.getConnection(stringConnection, user, password);
    }
}
