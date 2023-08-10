public class TesteJogoDaVelhaAuto {

    public static void main(String[] args) {
        JogoDaVelhaAuto auto = new JogoDaVelhaAuto(3);
        for(int i=0; i<auto.dimensao*auto.dimensao;i++){
            auto.poePeca();
        }
        System.out.println(auto);
        System.out.println(auto.temVencedor());
    }

}