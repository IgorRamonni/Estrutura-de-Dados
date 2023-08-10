import javax.swing.JRootPane;

public class OrdemAltura {
    public static int MAXENTRADAS = 10;
    protected int nrEntradas;
    protected Jogador[] jogadores;

    public OrdemAltura() {
        jogadores = new Jogador[MAXENTRADAS];
        nrEntradas = 0;
    }

    public String toString() {
        String retorno = "[";
        for (int i = 0; i < nrEntradas; i++){
            retorno = i>0 ? retorno + ", " : "";
/*             if (i>0) {
                retorno = retorno + ", ";
            }
*/
            retorno = retorno + jogadores[i].toString();
        }
        return retorno + "]";
    }

    public void add(Jogador j) {
        double alturaJogador = j.getAltura();
        if (nrEntradas == MAXENTRADAS) {
            if (alturaJogador < jogadores[nrEntradas-1].getAltura()){
                return;
            }
        }
        else {
            nrEntradas++;
            int i = nrEntradas - 1;
            for (;(i>=1) && (alturaJogador > jogadores[i-1].getAltura());i--) {
                    jogadores[i] = jogadores[i-1];
            }
            jogadores[i] = j;
        }
    }

    public Jogador remove(int i){
        if (i< 0 || i>=nrEntradas) {
            throw  new IndexOutOfBoundsException("Índice inválido: " + i);
                            
        }        
        Jogador temp = jogadores[i];
        
        for(int j = i; j<nrEntradas-1;j++){
            jogadores[j] = jogadores[j+1];
                                     
        }
        jogadores[nrEntradas-1] = null;
        nrEntradas--;
        return temp;        

    }    
}
