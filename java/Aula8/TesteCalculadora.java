public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        double retorno1 = calc.somar(1, 2);
        double retorno2 = calc.somar(1.0, 1.0);
        double retorno3 = calc.somar("8", "8");
        double retorno4 = calc.somar(5, 6.0);
        double retorno5 = calc.somar(6.0, 4);
        double retorno6= calc.somar("11", 9);
        double retorno7= calc.somar(11, "10");

        double valorD = 1.6;
        int valorI = (int) valorD;
        System.out.println(valorI);

        int valorInt = 1;
        double valorDouble = valorInt;
        System.out.println(valorDouble);
    }
}
