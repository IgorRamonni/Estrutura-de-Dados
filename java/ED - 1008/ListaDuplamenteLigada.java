public class ListaDuplamenteLigada<T>{
    private int tamanho;
    protected NoDplo<T> inicio,fim;

    public ListaDuplamenteLigada(){
        tamanho = 0;
        inicio = new NoDuplo<T>(null,null,null);
        fim= new NoDuplo(null,inicio,null);
        inicio.setNoProximo(fim);
    }

    public int getTamanho(){
        return this.tamanho;
    }

    public boolean estaVazia(){
        return this.tamanho == 0;
    }

    public NoDuplo<T> getInicio() throws IllegalStateException{
        if (this.estaVazia()){
            throw new IllegalStateException("Lista vazia");
    }
        return this.inicio.getNoProximo;
    }   

    public NoDuplo<T> getFim() throws IllegalStateException{
        if (estaVazia()){
            throw new IllegalStateException("Lista vazia");
        }
        return this.fim.getNoAnterior();  
    }
     public NoDuplo<T> getAnterior(NoDuplo<T> no) throws IllegalArgumentExceptio{
        if (no == inicio) {
            throw new IllegalAccessException("Início não tem nó no começo");
        }
        return no.getAnterior();
     }
     public NoDuplo<T> getProximo(NoDuplo<T> no) throws
     IllegalArgumentException{
        if(no == fim){
            throw new IllegalArgumentException("Fim não tem nó proximo");
        }
        return no.getProximo();
     }
}