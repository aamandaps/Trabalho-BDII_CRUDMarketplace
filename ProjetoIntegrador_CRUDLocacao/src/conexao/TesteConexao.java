// classe temporária para testar a conexão com o banco de dados

package conexao;

import java.sql.Connection;
import java.sql.SQLException;

public class TesteConexao {
    
    public static void main (String[] args) {
    
        GenericDao testesql = new GenericDao(); // Instância do método 
        
        try
        {
            Connection c = testesql.getConnection();
            
            String sgbd = c.getMetaData().getDatabaseProductName();
            System.out.println("Conexao realizada com sucesso, Nome do SGBD -> "+ sgbd);
            System.out.println("Nome do banco de dados ->" + c.getCatalog());
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println("Erro ao conectar");
            e.printStackTrace();
        }
    }
}
