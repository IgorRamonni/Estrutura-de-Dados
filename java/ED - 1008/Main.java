public class main{
    public static void main(String[] args) {
        System.out.println("Oi mundo");
        ListaDuplamenteLigada<String> lista = new ListaDuplamenteLigada<String>();
        lista.adicionaInicio(new NoDuplo<String>("A",null,null));
        lista.adicionaInicio(new NoDuplo<String>("B",null,null));
        lista.adicionaInicio(new NoDuplo<String>("C",null,null));
        System.out.println(lista);
        lista.adicionaInicio(new NoDuplo<String>("Ã",null,null));
    }
}