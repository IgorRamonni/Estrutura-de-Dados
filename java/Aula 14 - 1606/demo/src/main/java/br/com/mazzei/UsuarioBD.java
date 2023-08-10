package br.com.mazzei;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/***
 * Classe de demonstração de uma classe que tem também as funções de conexão ao BD. Esse é um outro padrão de desenvolvimento em que as classes tem funções além das de um pojo. 
 */


public class UsuarioBD {
    private String nome;
    private String email;
    private int codigo;

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void salva() {
        Connection conn = ConnectionFactory.obterConexao();
        String insertStr = "insert into tb_pessoa(nome,email) values (?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(insertStr,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, this.nome);
            ps.setString(2, this.email);
           int resultado = ps.executeUpdate();
           ResultSet rs = ps.getGeneratedKeys();
           if (rs.next()) {
                this.setCodigo(rs.getInt(3));
           }
            System.out.println(this.getCodigo());
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

    }

}