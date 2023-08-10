public class Cao extends Pets{
    
    private String acao = "Eu pego bolinha";
    private String alimento = "Eu como osso e ração";
    private String som = "Eu sou de latir ou uivar";
    
    public Cao(String nome) {
        super(nome);
    }
    public String getAcao() {
        return acao;
    }
    public void setAcao(String acao) {
        this.acao = acao;
    }
    public String getAlimento() {
        return alimento;
    }
    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
    public String getSom() {
        return som;
    }
    public void setSom(String som) {
        this.som = som;
    }

    
}
