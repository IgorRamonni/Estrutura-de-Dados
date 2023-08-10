package br.com.mazzei;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UsuarioDAO implements DAO<Usuario>{

    @Override
    public Optional<Usuario> get(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public List<Usuario> getAll()  {
        Connection conn = ConnectionFactory.obterConexao();
        List<Usuario> usuarios =  new ArrayList<Usuario>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("Select codigo, nome, email from tb_pessoa");
            while(rs.next()){
                Usuario usuarioAgora = new Usuario();
                usuarioAgora.setCodigo(rs.getInt("codigo"));
                System.out.println("Código" + rs.getInt("Codigo"));
                usuarioAgora.setNome(rs.getString("nome"));
                System.out.println("Nome" + rs.getString("Nome"));
                usuarioAgora.setEmail(rs.getString("email"));
                System.out.println(rs.getString("Email"));
            };
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return usuarios;
    }

    @Override
    public void save(Usuario t) {
        // TODO Auto-generated method stub
        Connection conn = ConnectionFactory.obterConexao();
        String insertStr = "insert into tb_pessoa(nome,email) values (?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(insertStr,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, t.getNome());
            ps.setString(2, t.getEmail());
           int resultado = ps.executeUpdate();
           ResultSet rs = ps.getGeneratedKeys();
           if (rs.next()) {
                t.setCodigo(rs.getInt(3));
           }
            System.out.println(t.getCodigo());
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    @Override
    public void update(Usuario t, String[] params) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(Usuario t) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
    
}
