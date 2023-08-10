public class Pets {
    private String nome;
    private String acao = "Eu durmo";
    private String alimento = "Sou Onivoro";
    private String som = "EuFaço Barulho";

   

    public Pets() {};

    public Pets(String nome){
        this.nome = nome;
    }
    public Pets(String nome, String acao){
        this(nome);
        this.acao = acao;
    }

    public Pets(String nome, String acao, String som){
        this (nome,acao);
        this.som = som;
    }

    public Pets(String nome, String acao, String som, String alimento){
        this (nome,acao,som);
        this.alimento = alimento;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public String getAcao() {
        return "Eu só sei " + acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }
}