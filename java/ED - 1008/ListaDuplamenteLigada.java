public class ListaDuplamenteLigada<T>{
    private int tamanho;
    private NoDuplo<T> inicio,fim;

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

     public void adicionaAntes(NoDuplo<T> noExistente, NoDuplo<T> noNovo) throws IllegalArgumentExceptio{
        NoDuplo<T> noInserido = getAnterior(noExistente);
        noNovo.setNoAnterior(noInserido);
        noNovo.setNoProximo(noExistente);
        noExistente.setNoAnterior(noNovo);
        noInserido.setNoProximo(noNovo);
        this.tamanho++;
     }

     public void adicionaDepois(NoDuplo<T> noExistente, NoDuplo<T> noNovo) throws IllegalArgumentException{
        NoDuplo<T> noInserido = getProximo (noExistente);
        noNovo.setNoAnterior(noExistente);
        noNovo.setNoProximo(noInserido);
        noInserido.setNoAnterior(noNovo);
        noExistente.setNoProximo(noNovo);
        this.tamanho ++;
     }

     public void adicionaInicio(NoDuplo<T> no){
        adicionaDepois(inicio, no);
     }

     public void adicionaFim(NoDuplo<T> no){
        adicionaAntes(fim, no);
     }

     public vod remove(NoDuplo<T> noExistente) throws
     IllegalArgumentException{
        NoDuplo<T> NoAnterior = getAnterior(noExistente);
        NoDuplo<T> NoPosterior=  getProximo(noExistent);
        noAnterior.setNoProximo(noProximo);
        noProximo.setNoAnterior(noAnterior);
        noExistente.setNoAnterior(null);
        noExistente.setNoProximo(null);
        tamanho--;
     }
    public String toString(){
        String retorno = "[";
        NoDuplo<T> no = inicio.getNoProximo();
        while(no != fim){
            retorno += no.toString();
            no = no.getNoProximo();
            if(!no == fim ){    
                retorno += ",";
        }
    }
        retorno += "]";
        return retorno;
    }
}