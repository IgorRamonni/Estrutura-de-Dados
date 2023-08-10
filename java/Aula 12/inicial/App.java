package br.com.mazzei;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ConnectionFactory conF = new ConnectionFactory();
        Connection con = conF.obterConexao();
        if (con!= null) {
            System.out.println("Conectado");
        } else {
            System.out.println("Deu mal");
        }
        System.out.println( "Hello World!" );
    }
}
