package com.example.model.dao;

import com.example.model.Pessoa;
import java.util.ArrayList;
import java.sql.*;
import java.sql.ResultSet;


public class PessoaDAO {
    private Connection con;

    public PessoaDAO(Connection con) {
        this.con = con;
    }

    // INSERT

    public void inserir(Pessoa p){
        String sql = "INSERT INTO pessoa(nome, email) VALUES (?, ?)";
        try{
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getEmail());
            stmt.execute();
            System.out.println("Pessoa" + p.getNome() + "Adicionada ao banco de dados");
        }catch(SQLException e){
            //TODO: handle[
            System.out.println(e.getMessage());

        }
    }

    //lista
    public ArrayList <Pessoa> lista(){
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        String sql = "SELECT * FROM pessoa";
     
        try{
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet resultSet = stmt.executeQuery();
            while(resultSet.next()){
                Pessoa p = new Pessoa();
                p.setId(resultSet.getInt("id"));
                p.setNome(resultSet.getString("Nome"));
                p.setEmail(resultSet.getString("Email"));
                pessoas.add(p);

            }
            resultSet.close();
            stmt.close();
               
        }catch(SQLException e){
            System.out.println("Erro ao listar pessoas" + e.getMessage());
        }
        return pessoas;
    }
}