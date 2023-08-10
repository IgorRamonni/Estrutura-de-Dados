public class ListaLigada<E>{
    protected NoSimples<E> comeco;
    protected long tamanho;

    public ListaLigada(){
        comeco = null;
        tamanho = 0;
    }

    public void adicionaComeco(NoSimples<E> novoComeco){
        novoComeco.setProximo(comeco);
        comeco = novoComeco;
        tamanho++;
    }

    public NoSimples<E> removeComeco(){
        if(comeco == null){
            System.out.println("A lista está vazia");
        }
        NoSimples<E> removido = comeco;
        removido.setProximo(null);
        tamanho = tamanho-1;
        return removido;
    }

    public String toString(){
        if(tamanho == 0){return "[]";}
        String s = "[";
        NoSimples<E> noAtual = comeco;
        for(int i = 0; i<tamanho; i++){
            s = s + noAtual.getObjeto();
            noAtual = noAtual.getProximo();
            if (noAtual != null){
                s = s+ ",";
            }

        }
        return s + "]";
    }
}   


class NoSimples<E>{
    E objeto;
    NoSimples<E> proximo;

    public NoSimples(E e, NoSimples<E> n){
        objeto = e;
        proximo = n;
    }

    public E getObjeto() {
        return objeto;
    }

    public void setObjeto(E objeto) {
        this.objeto = objeto;
    }

    public NoSimples<E> getProximo() {
        return proximo;
    }

    public void setProximo(NoSimples<E> proximo) {
        this.proximo = proximo;
    }


    
}

