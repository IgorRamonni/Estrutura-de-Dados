public class NoDuplo<T>{
    private NoDuplo<T> noAnterior;
    private NoDuplo<T> noProximo;
    private T elemento;

    public NoDuplo(T elemento, NoDuplo<T>anterior, NoDuplo<T> proximo){
        this.elemento = elemento;
        this.noAnterior = anterior;
        this.noProximo = proximo;
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
        return elemento;
    }
    public void setObjeto(T objeto) {
        this.elemento = objeto;
    }
    public T getElemento() {
        return elemento;
    }
    public void setElemento(T elemento) {
        this.elemento = elemento;
    }
    

    public NoDuplo(NoDuplo<T> noAnterior, NoDuplo<T> noProximo) {
        this.noAnterior = noAnterior;
        this.noProximo = noProximo;
    }
    public String toString(){
        return elemento.toString();
    }
}
