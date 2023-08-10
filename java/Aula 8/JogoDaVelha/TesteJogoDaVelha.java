public class TesteJogoDaVelha {
    public static void main(String[] args) {
        JogoDaVelha jogo = new JogoDaVelha(3);
        jogo.poePeca(0, 0);
        System.out.println(jogo.temVencedor());
        jogo.poePeca(1, 1);
        System.out.println(jogo);

    }
}
