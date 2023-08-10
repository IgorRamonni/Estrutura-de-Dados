package br.com.martins;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    private String usuario = "postgres";
    private String senha = "123456";
    private String host = "localhost";
    private String porta = "5432";
    private String bd = "db_pessoas"; 
    
    private String url = "jdbc:postgresql://" + host + "/" + bd + "?user=" + usuario + "&password=" + senha + "&ssl=true" + porta;

    Connection obterConexao() {
        try {
            Connection conn = DriverManager.getConnection(url);
            return conn;
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            return null;
        }
    
    }

    
}
