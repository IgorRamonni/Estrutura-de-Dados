public class Calculadora {

    public double somar(int a, int b) {
        imprime(a+b, "int + int ");
        return a + b;
    }

    public double somar(double a, double b) {
        imprime(a+b, "double + double ");
            return a + b;
    }

    public double somar(String a, String b){
        imprime(Double.parseDouble(a) + Double.parseDouble(b), "string + string ");
        return Double.parseDouble(a) + Double.parseDouble(b);
        
    }


    public double somar(int a, double b) {
        imprime(a+b, "int + double ");
        return a+b;
    }

    public double somar(double a, int b) {
        imprime(a+b, "double + int ");
        return a+b;
    }

    public double somar (String a, double b) {
        imprime(Double.parseDouble(a) + b, "String + int ");
        return Double.parseDouble(a) + b;
    }

    public double somar (double a, String b) {
        imprime(a + Double.parseDouble(b), "int + String ");
        return a + Double.parseDouble(b);
    }

   

    private void imprime(double a, String tipoPar) {
        System.out.println("A soma do par: " + tipoPar + "é " + a);
    }

} 