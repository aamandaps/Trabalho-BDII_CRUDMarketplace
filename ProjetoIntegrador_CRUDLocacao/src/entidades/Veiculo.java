package entidades;

import conexao.GenericDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/* Classe Veículo vai implementar a sua respectiva interface */
public class Veiculo implements IVeiculo {

    private String chassi;
    private String placa;
    private String modelo;
    private String cor;
    private int ano;
    private double precoFIPE;
    private String statusVeiculo;
    private int idGrupo;

    public Veiculo() {
        this.chassi = "";
        this.placa = "";
        this.modelo = "";
        this.cor = "";
        this.ano = 0;
        this.precoFIPE = 0.0;
        this.statusVeiculo = "Disponível";
        this.idGrupo = 0;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPrecoFIPE() {
        return precoFIPE;
    }

    public void setPrecoFIPE(double precoFIPE) {
        this.precoFIPE = precoFIPE;
    }

    public String getStatusVeiculo() {
        return statusVeiculo;
    }

    public void setStatusVeiculo(String statusVeiculo) {
        this.statusVeiculo = statusVeiculo;
    }

    public int getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(int idGrupo) {
        this.idGrupo = idGrupo;
    }

    @Override
    public void insertVeiculo(Veiculo v) throws ClassNotFoundException, SQLException {
        GenericDao gDao = new GenericDao();
        Connection conn = gDao.getConnection();
        String sql = "INSERT INTO veiculo (chassi, placa, modelo, cor, ano, precoFIPE, statusVeiculo, id_grupo) "
                   + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, v.getChassi());
        ps.setString(2, v.getPlaca());
        ps.setString(3, v.getModelo());
        ps.setString(4, v.getCor());
        ps.setInt(5, v.getAno());
        ps.setDouble(6, v.getPrecoFIPE());
        ps.setString(7, v.getStatusVeiculo());
        ps.setInt(8, v.getIdGrupo());
        ps.execute();
        ps.close();
        conn.close();
    }

    @Override
    public void updateVeiculo(Veiculo v) throws ClassNotFoundException, SQLException {
        GenericDao gDao = new GenericDao();
        Connection conn = gDao.getConnection();
        String sql = "UPDATE veiculo SET placa = ?, modelo = ?, cor = ?, ano = ?, "
                   + "precoFIPE = ?, statusVeiculo = ?, id_grupo = ? WHERE chassi = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, v.getPlaca());
        ps.setString(2, v.getModelo());
        ps.setString(3, v.getCor());
        ps.setInt(4, v.getAno());
        ps.setDouble(5, v.getPrecoFIPE());
        ps.setString(6, v.getStatusVeiculo());
        ps.setInt(7, v.getIdGrupo());
        ps.setString(8, v.getChassi());
        ps.execute();
        ps.close();
        conn.close();
    }

    @Override
    public void deleteVeiculo(Veiculo v) throws ClassNotFoundException, SQLException {
        GenericDao gDao = new GenericDao();
        Connection conn = gDao.getConnection();
        String sql = "DELETE FROM veiculo WHERE chassi = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, v.getChassi());
        ps.execute();
        ps.close();
        conn.close();
    }

    @Override
    public Veiculo findOneVeiculo(Veiculo v) throws ClassNotFoundException, SQLException {
        GenericDao gDao = new GenericDao();
        Connection conn = gDao.getConnection();
        String sql = "SELECT chassi, placa, modelo, cor, ano, precoFIPE, statusVeiculo, id_grupo "
                   + "FROM veiculo WHERE chassi = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, v.getChassi());
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            v.setChassi(rs.getString("chassi"));
            v.setPlaca(rs.getString("placa"));
            v.setModelo(rs.getString("modelo"));
            v.setCor(rs.getString("cor"));
            v.setAno(rs.getInt("ano"));
            v.setPrecoFIPE(rs.getDouble("precoFIPE"));
            v.setStatusVeiculo(rs.getString("statusVeiculo"));
            v.setIdGrupo(rs.getInt("id_grupo"));
        }
        rs.close();
        ps.close();
        conn.close();
        return v;
    }

    @Override
    public List<Veiculo> findAllVeiculo() throws ClassNotFoundException, SQLException {
        List<Veiculo> lista = new ArrayList<>();
        GenericDao gDao = new GenericDao();
        Connection conn = gDao.getConnection();
        String sql = "SELECT chassi, placa, modelo, cor, ano, precoFIPE, statusVeiculo, id_grupo FROM veiculo";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Veiculo v = new Veiculo();
            v.setChassi(rs.getString("chassi"));
            v.setPlaca(rs.getString("placa"));
            v.setModelo(rs.getString("modelo"));
            v.setCor(rs.getString("cor"));
            v.setAno(rs.getInt("ano"));
            v.setPrecoFIPE(rs.getDouble("precoFIPE"));
            v.setStatusVeiculo(rs.getString("statusVeiculo"));
            v.setIdGrupo(rs.getInt("id_grupo"));
            lista.add(v);
        }
        rs.close();
        ps.close();
        conn.close();
        return lista;
    }
}