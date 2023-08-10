import java.util.Random;

public class Arranjo {

    public static void main(String[] args) {
        int limite = 10;
        int listaInteiros[];
        listaInteiros =  new int[limite];
        String listaStrings[]= new String[limite];
        double listaDoubles[] = new double[limite];
        for (int i = 0; i < limite; i++){
            System.out.println(listaStrings[i]);

            listaInteiros[i] = 1000 + i;
            listaStrings[i] = "String n°" + i;
            listaDoubles[i] = i * 1.5;
        }

        Random rand = new Random();
        for(int i = 0; i < limite; i++){
            int posicao = rand.nextInt(limite);
            //int aux = listaInteiros[i];
            //listaInteiros[i] = listaInteiros[posicao];
            //listaInteiros[posicao] = aux;
            System.out.println(String.format("Item %d \nInteiro: %d \nString: %s\nDouble: %f \n\n ", posicao, listaInteiros[posicao],listaStrings[posicao], listaDoubles[posicao]));
        }

        final long tempoFinal = System.currentTimeMillis();
        System.out.println(String.format("tempo decorrido", tempoFinal));
    }
}