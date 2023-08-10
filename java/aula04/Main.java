import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        String categoria = "futebol";
        int nrIntegrantes = 22;
        String tecnico = "Técnico";
        String nome = "Nome do time";
        Jogador[] jogadores = new Jogador[nrIntegrantes];

        Time time;

        for(int i = 0; i<nrIntegrantes; i++){
            Jogador jogador = new Jogador("Jogador " + i,
            "Posição " + i, 
            ThreadLocalRandom.current().nextDouble(65,100),
            ThreadLocalRandom.current().nextDouble(1.60,1.98),
            ThreadLocalRandom.current().nextDouble(23,40)
            );
            jogadores[i] = jogador;
        }
        time =  new Time(nome, tecnico, nrIntegrantes, jogadores, categoria);
        System.out.println(time.toString());
        
        //System.out.println(time.getNome());
        //System.out.println(time.getTecnico());
        //System.out.println(time.getCategoria());
        //System.out.println(time.getNrIntegrantes());
        //System.out.println(time.getJogadores());

        //for(int j = 0; j<time.getJogadores().length; j++){
            //System.out.println(
            //time.getJogadores()[j]
            //);
        //}
    }
}
