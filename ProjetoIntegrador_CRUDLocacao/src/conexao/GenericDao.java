package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GenericDao {
    
    private Connection c; // Atributo do tipo connection que armazena a referência da conexão
    
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        String hostName = "localhost";
        String dbName = "Marketplace";

        String user = "amanda";
        String senha = "12345";

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); // Carrega o driver do sql

        String urlFormato = "jdbc:sqlserver://%s\\ESTUDOSSQL2;databaseName=%s;encrypt=true;trustServerCertificate=true;";
        String urlConexao = String.format(urlFormato, hostName, dbName);

        c = DriverManager.getConnection(urlConexao, user, senha);

        return c; // Retorna a conexão para o método que a solicitou

    }
}
