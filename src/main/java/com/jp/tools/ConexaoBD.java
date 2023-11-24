/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jp.tools;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
    private static Connection conexao = null;

    private static boolean nuvem = true;
    
    private ConexaoBD(){}
    
    public static Connection getConexao() throws Exception{
        try{
            if(conexao == null){
                String driver = "org.postgresql.Driver";

                String url = "";
                String user = "";
                String password = "";


                if (nuvem) {
                    String linkUrl = "postgresql://postgres:b36aD346FDd1b-gbG3c*GGCcbcAE6c1e@roundhouse.proxy.rlwy.net:21094/railway";
                    String DatabaseConnection = linkUrl.replace("postgresql://", "");
                    user = DatabaseConnection.substring(0, DatabaseConnection.indexOf(":"));
                    DatabaseConnection = DatabaseConnection.replace(user + ":", "");
                    password = DatabaseConnection.substring(0, DatabaseConnection.indexOf("@"));
                    DatabaseConnection = DatabaseConnection.replace(password + "@", "");
                    url = "jdbc:postgresql://" + DatabaseConnection; // URL Banco em nuvem
                } else {
                    url = "jdbc:postgresql://localhost:5432/DatabaseVEC";
                    user = "postgres";
                    password = "aluno";
                }

                Class.forName(driver);
                DriverManager.setLoginTimeout(10);
                conexao = DriverManager.getConnection(url, user, password);
            }               
        }
        catch(ClassNotFoundException erro){
            //Erro de não encontrar o drive do banco no projeto
            throw new Exception("Drive: "+erro.getMessage());
        }
        catch(SQLException erro){
            //Erro no banco de dados: usuario, senha ou banco de dados 
            throw new Exception("Banco: " + erro.getMessage());
        }
        return conexao;
    }   
}
