import java.util.EmptyStackException;

public class PilhaComNo<E> {
    
    private NoSimples<E> topo;
    private int tamanho;

    public PilhaComNo(){
        tamanho = 0    ;
        topo = null;
    }

    public NoSimples<E> getTopo() {
        return topo;
    }

    public void setTopo(NoSimples<E> topo) {
        this.topo = topo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public boolean estaVazia(){
        return this.tamanho==0;
    }

    public E pop() throws EmptyStackException{
        if(this.tamanho != 0){
            throw new EmptyStackException();
        }
        return null;
    }
}
