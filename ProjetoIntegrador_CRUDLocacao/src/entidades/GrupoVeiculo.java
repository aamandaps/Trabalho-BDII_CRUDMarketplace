package entidades;

import conexao.GenericDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GrupoVeiculo implements IGrupoVeiculo {

    private int id;
    private String tipo;
    private double precoDiaria;

    public GrupoVeiculo() {
        this.id = 0;
        this.tipo = "";
        this.precoDiaria = 0.0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecoDiaria() {
        return precoDiaria;
    }

    public void setPrecoDiaria(double precoDiaria) {
        this.precoDiaria = precoDiaria;
    }

    @Override
    public void insertGrupoVeiculo(GrupoVeiculo gv) throws ClassNotFoundException, SQLException {
        GenericDao gDao = new GenericDao();
        Connection conn = gDao.getConnection();
        String sql = "INSERT INTO Grupo_Veiculo (Tipo, Preco_Diaria) VALUES (?, ?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, gv.getTipo());
        ps.setDouble(2, gv.getPrecoDiaria());
        ps.execute();
        ps.close();
        conn.close();
    }

    @Override
    public void updateGrupoVeiculo(GrupoVeiculo gv) throws ClassNotFoundException, SQLException {
        GenericDao gDao = new GenericDao();
        Connection conn = gDao.getConnection();
        String sql = "UPDATE Grupo_Veiculo SET Tipo = ?, Preco_Diaria = ? WHERE ID = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, gv.getTipo());
        ps.setDouble(2, gv.getPrecoDiaria());
        ps.setInt(3, gv.getId());
        ps.execute();
        ps.close();
        conn.close();
    }

    @Override
    public void deleteGrupoVeiculo(GrupoVeiculo gv) throws ClassNotFoundException, SQLException {
        GenericDao gDao = new GenericDao();
        Connection conn = gDao.getConnection();
        String sql = "DELETE FROM Grupo_Veiculo WHERE ID = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, gv.getId());
        ps.execute();
        ps.close();
        conn.close();
    }

    @Override
    public GrupoVeiculo findOneGrupoVeiculo(GrupoVeiculo gv) throws ClassNotFoundException, SQLException {
        GenericDao gDao = new GenericDao();
        Connection conn = gDao.getConnection();
        String sql = "SELECT ID, Tipo, Preco_Diaria FROM Grupo_Veiculo WHERE ID = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, gv.getId());
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            gv.setId(rs.getInt("ID"));
            gv.setTipo(rs.getString("Tipo"));
            gv.setPrecoDiaria(rs.getDouble("Preco_Diaria"));
        }
        rs.close();
        ps.close();
        conn.close();
        return gv;
    }

    @Override
    public List<GrupoVeiculo> findAllGrupoVeiculo() throws ClassNotFoundException, SQLException {
        List<GrupoVeiculo> lista = new ArrayList<>();
        GenericDao gDao = new GenericDao();
        Connection conn = gDao.getConnection();
        String sql = "SELECT ID, Tipo, Preco_Diaria FROM Grupo_Veiculo";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            GrupoVeiculo gv = new GrupoVeiculo();
            gv.setId(rs.getInt("ID"));
            gv.setTipo(rs.getString("Tipo"));
            gv.setPrecoDiaria(rs.getDouble("Preco_Diaria"));
            lista.add(gv);
        }
        rs.close();
        ps.close();
        conn.close();
        return lista;
    }
}
