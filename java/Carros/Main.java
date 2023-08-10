public class Main {
    public static void main(String[] args) {
        Passeio carro = new Passeio(5, "Hatch", 4);

        System.out.printf("Dados do carro: %s, %s, %s\n", carro.getAnoModelo(), carro.getModelo(),
                carro.getFabricante());
    }
}