public class Contador {
    protected int contador;
    Contador(){
        contador = 0;
    }
    Contador(int valorInicial){
        this.contador = valorInicial;
    }
    public int obtemContador(){
        return this.contador;
    } 

    public void incrementaContador(){
        this.contador++;
    }

    public void decrementaContador(){
        this.contador--;
    }

}
