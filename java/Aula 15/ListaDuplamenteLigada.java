public class ListaDuplamenteLigada<T> {

    private NoDuplo<T> inicio;
    private NoDuplo<T> fim;
    private long tamanho;

    public ListaDuplamenteLigada() {
        inicio = new NoDuplo(null, null, null);
        fim = new NoDuplo(null, inicio,null);
        inicio.setNoProximo(fim);
        tamanho = 0;

    }

    public long tamanho() {
        return tamanho;
    }

    public boolean estavazia() {
        return tamanho == 0;
    }

    public NoDuplo<T> getinicio() throws 
    IllegalArgumentException {
        if (estavazia()) throw new IllegalArgumentException("A lista está vazia!");
        return inicio.getNoProximo();
    }

    public NoDuplo<T> getFim() throws 
    IllegalArgumentException {
        if (estavazia()) throw new IllegalArgumentException("A lista está vazia!");
        return inicio.getNoAnterior();
    }

    public NoDuplo<T> getAnterior(NoDuplo<T> no) throws 
    IllegalArgumentException{
        if (no == inicio) throw new IllegalArgumentException ("Não é retroceder para antes do início");
        return no.getNoAnterior();
    }

    public NoDuplo<T> getProximo(NoDuplo<T> no) throws 
    IllegalArgumentException{
        if (no == fim) throw new IllegalArgumentException ("Não é possível ir além do final");
        return no.getNoProximo();
    }

    public void adicionaAntes(NoDuplo<T> existente, NoDuplo<T> novoNo) {
        NoDuplo<T> anteriorExistente = getAnterior(existente);
        novoNo.setNoAnterior(existente);
        existente.setNoAnterior(novoNo);
        anteriorExistente.setNoProximo(novoNo);
        tamanho++;
    }

    public void adicionaApos(NoDuplo<T> existente, NoDuplo<T> novoNo) {
        NoDuplo<T> proximoExistente = getProximo(existente);
        novoNo.setNoAnterior(existente);
        novoNo.setNoProximo(proximoExistente);
        proximoExistente.setNoAnterior(novoNo);
        existente.setNoProximo(novoNo);
        tamanho++;
    }

    public void adicionaNoComeco(NoDuplo<T> novoNo){
        adicionaApos(inicio, novoNo);
    }

    public void adicionaNoFim(NoDuplo<T> novoNo) {
        adicionaAntes(fim, novoNo);
    }

    public void remove(NoDuplo<T> noParaExcluir) {
        NoDuplo<T> noAnterior = getAnterior(noParaExcluir);
        NoDuplo<T> noProximo = getProximo(noParaExcluir);
        noProximo.setNoAnterior(noAnterior);
        noAnterior.setNoAnterior(noProximo);
        noParaExcluir.setNoAnterior(null);
        noParaExcluir.setNoProximo(null);
        tamanho--;
    }

    public boolean temAnterior(NoDuplo<T> no) {
        return no != inicio;
    }

    public boolean temProximo(NoDuplo<T> no) {
        return no != fim; 
    }

    public String toString() {
        String s = "[";
        NoDuplo<T> noAtual = inicio.getNoProximo();
        while(noAtual != fim) {
            s += noAtual.getObjeto();
            noAtual = noAtual.getNoProximo();
            if(noAtual != fim) { s += ", ";}
        }
        s += "]";
        return s;
    }

    

}



class NoDuplo<T> {
    NoDuplo<T> noAnterior;
    NoDuplo<T> noProximo;
    T objeto;

    public NoDuplo(T t, NoDuplo<T> anterior, NoDuplo<T> proximo) {
        objeto = t;
        noAnterior = anterior;
        noProximo = proximo;

    }

    public NoDuplo<T> getNoAnterior() {
        return noAnterior;
    }

    public void setNoAnterior(NoDuplo<T> noAnterior) {
        this.noAnterior = noAnterior;
    }

    public NoDuplo<T> getNoProximo() {
        return noProximo;
    }

    public void setNoProximo(NoDuplo<T> noProximo) {
        this.noProximo = noProximo;
    }

    public T getObjeto() {
        return objeto;
    }

    public void setObjeto(T objeto) {
        this.objeto = objeto;

    }

}