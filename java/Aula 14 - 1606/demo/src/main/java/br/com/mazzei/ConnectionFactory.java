package br.com.mazzei;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    private static String usuario = "postgres";
    private static String senha = "123456";
    private static String host = "localhost";
    private static String porta = "5432";
    private static String bd = "db_pessoas"; 
    
    private static String url = "jdbc:postgresql://" + host + "/" + bd + "?user=" + usuario + "&password=" + senha + "&ssl=true" + porta;

    static Connection obterConexao() {
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
