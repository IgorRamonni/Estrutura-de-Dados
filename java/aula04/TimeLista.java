import java.util.concurrent.ThreadLocalRandom;


public class TimeLista {
    public static void main(String[] args) {
        int tamanhoTime = 11;
        int nrTimes = 9;
        String[] nomes = new String[nrTimes*tamanhoTime];
        String[] posicoes = new String[nrTimes*tamanhoTime];
        double[] pesos = new double[nrTimes*tamanhoTime];
        double[] alturas = new double[nrTimes*tamanhoTime];
        double[] velocidades = new double[nrTimes*tamanhoTime];
        String nome = " ";
        String posicao = " ";
        int time = 0;
        int pos = 0;
        

        for(int i = 0; i<nrTimes*tamanhoTime; i++){
            time = i/11;
            pos = i%11;
            nome = "Jogador " + pos + " do time " + time;
            nomes[i] = nome;
            posicao = " Posição do jogador " +pos + " do time " + time;
            posicoes[i] = posicao;
            pesos[i] = ThreadLocalRandom.current().nextDouble(65,100);
            alturas[i] = ThreadLocalRandom.current().nextDouble(1.60,1.98);
            pesos[i] = ThreadLocalRandom.current().nextDouble(60,70);
            velocidades[i] = ThreadLocalRandom.current().nextDouble(23,40);
        }

        for (int i = 0; i<nrTimes*tamanhoTime; i++){
            System.out.println("Dados do jogador "+ 
            nomes[i] + " posição " +
            posicoes[i] +" pesos " +
            pesos[i] + " alturas " +
            alturas[i]+ " velocidades " +
            velocidades[i]);
            
        }
    }
}
