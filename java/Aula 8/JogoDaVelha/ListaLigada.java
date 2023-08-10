public class ListaLigada {
    NoSimples comeco;
    int tamanho;
    NoSimples fim;

    ListaLigada(NoSimples comeco){
        this.comeco = comeco;
        this.tamanho = 1;
    }

    public void adicionaNoComeco(NoSimples novoComeco){
        if(tamanho==1){
            this.comeco = novoComeco;
        }
        comeco = novoComeco;
        tamanho = tamanho + 1;
    }
    

    public void AdicionaNoFinal(NoSimples novoFim){
        fim.proximo = novoFim;
        fim = novoFim;
        tamanho = tamanho + 1;
    }
}
