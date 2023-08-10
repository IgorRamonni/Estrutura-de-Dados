package ListaLigada;

public class NoDuplo<T>{
    NoDuplo<T> noAnterior;
    NoDuplo<T> noProximo;
    T objeto;

    public NoDuplo(NoDuplo<T> noAnterior, T Objeto, NoDuplo<T> noProximo){
        this.noAnterior = noAnterior;
        this.noProximo = noProximo;
    }
}