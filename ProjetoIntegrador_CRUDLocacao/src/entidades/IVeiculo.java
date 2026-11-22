package entidades;

import java.sql.SQLException;
import java.util.List;

/* Interface que contém todas as operações que serão realizadas por Veiculo */

public interface IVeiculo {
    
    // Operações CRUD
    public void insertVeiculo (Veiculo v) throws ClassNotFoundException, SQLException; 
    public void updateVeiculo (Veiculo v) throws ClassNotFoundException, SQLException;
    public void deleteVeiculo (Veiculo v) throws ClassNotFoundException, SQLException;
    public Veiculo findOneVeiculo(Veiculo v) throws ClassNotFoundException, SQLException;
    public List<Veiculo> findAllVeiculo () throws ClassNotFoundException, SQLException;

}
