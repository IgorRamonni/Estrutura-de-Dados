import java.util.concurrent.ThreadLocalRandom;

public class TestaOrdemAltura {
    public static void main(String[] args) {
        String categoria = "futebol";
        int nrIntegrantes = 22;
        String tecnico = "Técnico";
        String nome = "Nome time";
        Jogador[] jogadores = new Jogador[nrIntegrantes];
        OrdemAltura ordenados = new OrdemAltura();

        for (int i = 0; i<nrIntegrantes;i++) {
            Jogador jogador = new Jogador(
                "Jogador " + i,
                "Posição " + i,
                ThreadLocalRandom.current().nextDouble(65.,100.),
                ThreadLocalRandom.current().nextDouble(1.60,1.98),
                ThreadLocalRandom.current().nextDouble(20.,35.)
            );
            jogadores[i]=jogador;
            ordenados.add(jogador);
        }
        System.out.println(ordenados);
       // System.out.println(jogadores);

        /*Uma forma de percorrer uma lista de itens */      
        for(int i = 0;i <jogadores.length; i++){
        System.out.println(jogadores[i]);
        }

        System.out.println("Agora utilizando variavel para percorrer os jogadores");

        for(Jogador jogador : jogadores ){
            System.out.println(jogador.toString());
        }
        
        System.out.println(ordenados);
        Jogador removido = ordenados.remove(4);
        System.out.println(ordenados);
        System.out.println("Removido=" + removido);        

        
}
}
