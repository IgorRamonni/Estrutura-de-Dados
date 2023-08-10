//import java.util.Scanner;

public class Executavel {
    public static void main(String[] args) {
        Contador c = new Contador();
        Contador c1 = new Contador();
        //c.incrementaContador();

        boolean iguais = c.equals(c1);
        System.out.println("O valor de c é:"+ c.obtemContador());
        System.out.println("O valor de c1 é:"+ c1.obtemContador());
        System.out.println("Iguais:" +iguais);

        Contador c3 = new Contador(10);
        System.out.println("O valor de c3 é:" + c3.obtemContador());
        
        //Scanner sc = new Scanner(System.in);



    }
}
