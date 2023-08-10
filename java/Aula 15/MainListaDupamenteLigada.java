public class MainListaDupamenteLigada {
    public static void main(String[] args) {
        String[] lista = {"A","B","C","D","E"};

        ListaDuplamenteLigada<String> listaDupla =  new ListaDuplamenteLigada<>();

        for(int i = 0; i<lista.length; i++){
            listaDupla.adicionaNoComeco(new NoDuplo<String>(lista[i],null,null));
        }
        System.out.println(listaDupla);
    }
}
