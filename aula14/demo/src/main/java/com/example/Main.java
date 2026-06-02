package com.example;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import com.example.model.Pessoa;
import com.example.model.dao.ConnectionFactory;
import com.example.model.dao.PessoaDAO;

public class Main {
    public static void main(String[] args) {
        try {
            Connection con = ConnectionFactory.getConnection();
            Scanner sc = new Scanner(System.in);
            System.out.println("Informe o nome do Usuário\n");
            String nome = sc.next();
            System.out.println("Informe o email do usuário\n");
            String email = sc.next();
            Pessoa pessoa = new Pessoa(nome, email);

            PessoaDAO pessoaDao = new PessoaDAO(con);
            pessoaDao.inserir(pessoa);
            sc.close();
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}