package entidades;

import java.sql.SQLException;
import java.util.List;

/* Interface que contém todas as operações que serão realizadas por GrupoVeiculo */

public interface IGrupoVeiculo {

    // Operações CRUD
    public void insertGrupoVeiculo (GrupoVeiculo gv) throws ClassNotFoundException, SQLException; 
    public void updateGrupoVeiculo (GrupoVeiculo gv) throws ClassNotFoundException, SQLException;
    public void deleteGrupoVeiculo (GrupoVeiculo gv) throws ClassNotFoundException, SQLException;
    public GrupoVeiculo findOneGrupoVeiculo(GrupoVeiculo gv) throws ClassNotFoundException, SQLException;
    public List<GrupoVeiculo> findAllGrupoVeiculo () throws ClassNotFoundException, SQLException;

}
