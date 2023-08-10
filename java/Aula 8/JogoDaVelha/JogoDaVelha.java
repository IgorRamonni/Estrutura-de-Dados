public class JogoDaVelha {
    protected static final int X = 1, O = -1;
    protected static final int VAZIO = 0;
    protected int tabuleiro[][];
    protected int jogador;
    protected int dimensao;

    public int getDimensao() {
        return dimensao;
    }

    public JogoDaVelha(int dimensao) {
        this.dimensao = dimensao;
        tabuleiro = new int[dimensao][dimensao];
        limpaTabuleiro();
    };

    public void limpaTabuleiro() {
        for (int i = 0; i < this.dimensao; i++) {
            for (int j = 0; j < this.dimensao; j++) {
                tabuleiro[i][j] = VAZIO;
            }
        }
        jogador = X;
    }

    public void poePeca(int i, int j) {
        if (i < 0 || i > this.dimensao - 1 || j < 0 || j > this.dimensao - 1) {
            throw new IllegalArgumentException("Posição inválida");
        }
        if (tabuleiro[i][j] != VAZIO) {
            throw new IllegalArgumentException("Posição já utilizada");
        }
        tabuleiro[i][j] = jogador;
        jogador = -jogador;
    }


    public int temVencedor(){
        int somaDiagonalD = 0;
        for(int linha = 0; linha < dimensao; linha++){
            int soma_linha = 0;
            for(int coluna = 0; coluna < dimensao; coluna++){
                soma_linha = soma_linha + tabuleiro[linha][coluna];
                int marca = soma_linha == X*dimensao?X:soma_linha == O*dimensao?O:0;
                if(linha == coluna){
                    somaDiagonalD = somaDiagonalD + tabuleiro [linha][coluna];
                }
                if(marca!=0){
                    return marca;
                }
            }
        }

        if(somaDiagonalD == X*dimensao){
            return X;
        }else if (somaDiagonalD == O*dimensao){
            return O;
        }

        int somaDiagonalE = 0;

        for(int coluna = 0; coluna < dimensao; coluna++){
            int soma_coluna = 0;
            for(int linha = 0; linha < dimensao; linha++){
                soma_coluna = soma_coluna + tabuleiro[linha][coluna];
                int marca = soma_coluna == X*dimensao?X:soma_coluna == O*dimensao?O:0;
                if((coluna + linha) == dimensao-1){
                    somaDiagonalE = somaDiagonalE + tabuleiro[linha][coluna];
                }
                if(marca!=0){
                    return marca;
                }
            }
            if(somaDiagonalE == X*dimensao){
                return X;
            }else if (somaDiagonalE == O*dimensao){
                return O;
            }   
        }
        return 0;
}

    


/* 
    public boolean eVencedor(int marca) {
        return ((tabuleiro[0][0] + tabuleiro[0][1] + tabuleiro[0][2] == marca * this.dimensao) // linha 0 
                || (tabuleiro[1][0] + tabuleiro[1][1] + tabuleiro[1][2] == marca * this.dimensao) // linha 1 
                || (tabuleiro[2][0] + tabuleiro[2][1] + tabuleiro[2][2] == marca * this.dimensao) // linha 2 
                || (tabuleiro[0][0] + tabuleiro[1][0] + tabuleiro[2][0] == marca * this.dimensao) // coluna 0 
                || (tabuleiro[0][1] + tabuleiro[1][1] + tabuleiro[2][1] == marca * this.dimensao) // coluna 1 
                || (tabuleiro[0][2] + tabuleiro[1][2] + tabuleiro[2][2] == marca * this.dimensao) // coluna 2 
                || (tabuleiro[0][0] + tabuleiro[1][1] + tabuleiro[2][2] == marca * this.dimensao) // diagonal 
                || (tabuleiro[2][0] + tabuleiro[1][1] + tabuleiro[0][2] == marca * this.dimensao)); // diagonal
    }
    */
 

    public String toString() {
        String s = "";
        for (int i = 0; i < this.dimensao; i++) {
            for (int j = 0; j < this.dimensao; j++) {
                switch (tabuleiro[i][j]) {
                    case X:
                        s = s + "X";
                        break;
                    case O:
                        s = s + "O";
                        break;
                    case VAZIO:
                        s = s + " ";
                        break;
                }
                if (j < (this.dimensao - 1)) {
                    s = s + " | ";
                }
            }
            if (i < (this.dimensao - 1)) {
                s = s + "\n";
                for(int conta=0;conta <=dimensao; conta++){
                    s = s + " - ";
                }
                s = s +" \n";
            }
        }
        return s;
    }
}


