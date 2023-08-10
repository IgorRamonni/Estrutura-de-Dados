package br.com.mazzei;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Usuario usuario = new Usuario();
        usuario.setNome("Igor Ramonni");
        usuario.setEmail("lima.igormartins@gmail.com");

        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioDAO.save(usuario);

        usuarioDAO.save(usuario);
        usuarioDAO.getAll();
    }
}
