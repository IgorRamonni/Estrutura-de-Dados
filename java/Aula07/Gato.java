public class Gato extends Pets{
    
    private String acao = "Eu desfio lã";
    private String alimento = "Leite";
    private String som = "Eu mio, ronrono e bufo";

    public Gato(String nome) {
        super(nome);
        //Sempre usado nas classes filhos
    }

    public String getAlimento() {
        return String.format("Dizem que eu gosto de %s, mas eu gosto é de sache e também como ração",this.alimento);
    }

    public String getAcao() {
        return acao;
    }

    public String getSom() {
        return som;
    }
    
    
    
}
