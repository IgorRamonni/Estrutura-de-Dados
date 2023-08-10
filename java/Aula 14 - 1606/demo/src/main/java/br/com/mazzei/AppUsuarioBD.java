package br.com.mazzei;

public class AppUsuarioBD{
public static void main(String[] args) {
    UsuarioBD usuariobd = new UsuarioBD();
    usuariobd.setEmail("lima.igormartisn@gmail.com");
    usuariobd.setNome("Igor");
    usuariobd.salva();

}
}