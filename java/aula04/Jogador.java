public class Jogador {
    
    private String nome;
    private String posicao;
    private double peso;
    private double altura;
    private double velocidade;

    Jogador(String nome, String posicao, double peso, double altura, double velocidade){
        this.nome = nome;
        this.posicao = posicao;
        this.peso = peso;
        this.altura = altura;
        this.velocidade = velocidade;
    }

    public String toString(){
        return "Jogador: " + this.nome + " jogando na posição:" + this.posicao;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
}
