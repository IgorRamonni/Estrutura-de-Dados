public class Main {
    public static void main(String[] args) {
        Cao superCao = new Cao("Supercao");
        Pets cao = new Cao("Filho do Cao");
        

        System.out.printf("Me chamo %s,%s,%s,%s\n", superCao.getNome(), superCao.getAcao(), superCao.getAlimento(), superCao.getSom());
        System.out.printf("Me chamo %s,%s,%s,%s\n", cao.getNome(), cao.getAcao(), cao.getAlimento(), cao.getSom());
        

        Gato fofo = new Gato("Fofo");
        System.out.printf("Me chamo %s,%s,%s,%s\n", fofo.getNome(), fofo.getAcao(), fofo.getAlimento(), fofo.getSom());
    }
}
