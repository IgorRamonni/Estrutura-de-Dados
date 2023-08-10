public class Pets {
    private String nome;
    private String acao = "Eu durmo";
    private String alimento = "Sou Onivoro";
    private String som = "Eu faço barulho, mas também posso viver em silêncio";
    
    public Pets(String nome){
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getAcao() {
        return acao;
    }
    public String getAlimento() {
        return alimento;
    }
    public String getSom() {
        return som;
    }

   


    
}