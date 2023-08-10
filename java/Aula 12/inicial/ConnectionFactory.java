package br.com.mazzei;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    private String usuario = "postgres";
    private String senha = "123456";
    private String host = "localhost";
    private String porta = "5432";
    private String bd = "db_pessoas"; 
    
    private String url = "jdbc:postgresql://" + host + "/" + bd + "user=" + usuario + "&password=" + senha + "&ssl=true";
     try {
        Connection conn = DriverManager.getConnection(url);
        
    } catch (Exception e) {
        
        e.printStackTrace();
    }

    
}
