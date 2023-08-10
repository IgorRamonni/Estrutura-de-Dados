

public class Time {
    private String nome;
    private String tecnico;
    private int nrIntegrantes;
    private Jogador[] jogadores;
    private String categoria;

    Time(String nome, String tecnico, int nrIntegrantes, Jogador[] jogadores, String categoria){
        this.nome = nome;
        this. tecnico = tecnico;
        this.nrIntegrantes = nrIntegrantes;
        this.jogadores = jogadores;
        this.categoria = categoria;
    }

    public String toString(){
        String integrantes = "";
        for(Jogador jog : this.jogadores){
            integrantes = integrantes + "" + jog.toString() + "\n";
        }
        return "Time: " + this.nome + " de " + this.categoria + "\n" + "Integrantes: \n" + integrantes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public int getNrIntegrantes() {
        return nrIntegrantes;
    }

    public void setNrIntegrantes(int nrIntegrantes) {
        this.nrIntegrantes = nrIntegrantes;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
}
