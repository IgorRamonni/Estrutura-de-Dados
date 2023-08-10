public class NoDuplo {
    protected NoDuplo<T> noAnterior;
    protected NoDuplo<T> noProximo;
    protected T objeto;

    public NoDuplo<T>(T elemento, NoDuplo<T>anterior, NoDuplo<T> proximo){
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
        return objeto;
    }
    public void setObjeto(T objeto) {
        this.objeto = objeto;
    }
    public T getElemento() {
        return elemento;
    }
    public void setElemento(T elemento) {
        this.elemento = elemento;
    }
    public T getNoDuplo() {
        return NoDuplo;
    }
    public void setNoDuplo(T noDuplo) {
        NoDuplo = noDuplo;
    }
    public NoDuplo<T> getProximo() {
        return proximo;
    }
    public void setProximo(NoDuplo<T> proximo) {
        this.proximo = proximo;
    }
}
