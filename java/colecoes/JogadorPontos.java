public class JogadorPontos {

    protected String nome;
    protected int pontos;

    JogadorPontos(String n, int p) {
        this.nome = n;
        this.pontos = p;
    }
    
    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getPontos(){
        return this.pontos;
    }

    public void setPontos(int pontos){
        this.pontos = pontos;
    }

    public String toString(){
        return "O jogador: " + this.nome + " tem " + this.pontos;
    }
    
    public String getPontosStr(){
        return String.valueOf(this.pontos);
        
    }
}