import java.util.concurrent.ThreadLocalRandom;

public class JogoDaVelhaAuto extends JogoDaVelha {

    public JogoDaVelhaAuto(int dimensao) {
        super(dimensao);
    }

    public void poePeca(){

        boolean colocou = false;

        while(colocou == false){
            try {
                int linha = ThreadLocalRandom.current(). nextInt(0, dimensao);
                int coluna = ThreadLocalRandom.current(). nextInt(0, dimensao);
                poePeca(linha, coluna);
                colocou = true;
            } catch (Exception e) {
                System.out.println("Falhou");
                colocou = false;
            }
        }
        

    }
    public ListaLigada poePeca(ListaLigada listaJogadas){
       return null;
    }

}
