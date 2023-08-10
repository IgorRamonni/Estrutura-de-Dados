public class Main {
    public static void main(String[] args) {
        Pets estimacao = new Pets("Bicho de estimação");
        System.out.println(estimacao.getNome() + "" + estimacao.getSom());
        
        Cao  superCao = new Cao("Super cão");
        System.out.println(superCao.getAcao());

        Cao SuperCao  = new Cao("Super cão");
        System.out.println(superCao.getNome()+ "" + SuperCao.getSom());
        Cao preguicoso = new Cao("Preguiçoso","Brincar","Latir", "Açao");
        System.out.println(preguicoso.getNome());
        System.out.println(preguicoso.getAcao());
        Peixe doroty = new Peixe("Doroty");
        System.out.println(doroty.getNome());

    }
}
