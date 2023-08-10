public class MainListaLigada {
    public static void main(String[] args) {
        String[] lista = {"A","B","C","D","E"};

        ListaLigada<String> listaLigada =  new ListaLigada<String>();

        for(int i = 0; i<lista.length; i++){
            listaLigada.adicionaComeco(new NoSimples(lista[i],null));
        }
        System.out.println(listaLigada);
    }
}
