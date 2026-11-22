package entidades;

import conexao.GenericDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/* Classe GrupoVeiculo vai implementar a sua respectiva interface */
public class GrupoVeiculo implements IGrupoVeiculo {

    private int id;
    private String tipo;
    private double precoDiaria;

    public GrupoVeiculo() {
        this.id = 0;
        this.tipo = "";
        this.precoDiaria = 0.0;
    }

    public GrupoVeiculo(int id, String tipo, double precoDiaria) {
        this.id = id;
        this.tipo = tipo;
        this.precoDiaria = precoDiaria;
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
        String sql = "INSERT INTO grupoVeiculo (tipo, preco_diaria) VALUES (?, ?)";
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
        String sql = "UPDATE grupoVeiculo SET tipo = ?, preco_diaria = ? WHERE id = ?";
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
        String sql = "DELETE FROM grupoVeiculo WHERE id = ?";
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
        String sql = "SELECT id, tipo, preco_diaria FROM grupoVeiculo WHERE id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, gv.getId());
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            gv.setId(rs.getInt("id"));
            gv.setTipo(rs.getString("tipo"));
            gv.setPrecoDiaria(rs.getDouble("preco_diaria"));
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
        String sql = "SELECT id, tipo, preco_diaria FROM grupoVeiculo";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            GrupoVeiculo gv = new GrupoVeiculo();
            gv.setId(rs.getInt("id"));
            gv.setTipo(rs.getString("tipo"));
            gv.setPrecoDiaria(rs.getDouble("preco_diaria"));
            lista.add(gv);
        }
        rs.close();
        ps.close();
        conn.close();
        return lista;
    }
}
