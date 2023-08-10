public class Partida {
    public static void main(String[] args) {
        JogoDaVelhaAuto jogoAuto = new JogoDaVelhaAuto(3);
        Jogada jogadaInicial = new Jogada(JogoDaVelhaAuto.X, 0, 0);
        NoSimples noInicial = new NoSimples();
        noInicial.jogada = jogadaInicial;
        ListaLigada listaJogadas = new ListaLigada(noInicial);
    }
}