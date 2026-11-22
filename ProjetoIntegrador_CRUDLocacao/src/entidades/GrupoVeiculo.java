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
    
}