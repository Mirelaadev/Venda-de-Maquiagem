package Teste;

import database.Conexao;

import java.sql.Connection;

public class TesteConexao {

    public static void main(String[] args) {

        Connection conexao = Conexao.getConnection();

        System.out.println("Conexão realizada com sucesso!");

    }
}