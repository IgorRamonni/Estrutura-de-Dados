package ListaLigada;
    

public class ListaDuplamenteLigada<T>{
    NoDuplo<T> inicio;
    NoDuplo<T> fim;
    NoDuplo<T> sentinelaInicio;
    NoDuplo<T> sentinelaFim;
    int tamanho;
    

    public ListaDuplamenteLigada(T tipo){
        inicio = new NoDuplo<T>(null, null, null);
        fim = new NoDuplo<T>(null, null, null);
        inicio.noProximo = fim;
        tamanho = 0;
    }

    public void add(NoDuplo<T> noDuplo){
        if (tamanho == 0) {
            inicio.noProximo = noDuplo;
            fim.noAnterior = noDuplo;
            noDuplo.noAnterior = inicio;
            noDuplo.noProximo = fim;
        }else{
            NoDuplo<T> noAntigo = inicio.noProximo;
            inicio.noProximo = noDuplo;
            noDuplo.noAnterior = inicio;
            noDuplo.noProximo = noAntigo;
            noAntigo.noAnterior = noDuplo;
        }
        tamanho = tamanho + 1;
    }

}
