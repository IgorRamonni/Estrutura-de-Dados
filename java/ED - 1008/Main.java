public class Main{
    public static void main(String[] args) {
        ListaDuplamenteLigada<String> lista = new ListaDuplamenteLigada<String>();
        lista.adicionaInicio(new NoDuplo<String>("A",null,null));
        lista.adicionaInicio(new NoDuplo<String>("B",null,null));
        lista.adicionaInicio(new NoDuplo<String>("C",null,null));
        lista.adicionaFim(new NoDuplo<String>("D", null, null));
        System.out.println(lista);
        lista.adicionaInicio(new NoDuplo<String>("Ã",null,null));
        System.out.println(lista);
    }
}