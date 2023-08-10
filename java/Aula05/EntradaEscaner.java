import java.util.Scanner;

public class EntradaEscaner{
    public static void main(String[] args) {
        Scanner minhaEntrada = new Scanner(System.in);
        System.out.println("Informe um valor inteiro:");
        int valor1 = Integer.parseInt(minhaEntrada.nextLine());
 //       int valor1 = minhaEntrada.nextInt();

        System.out.println("Informe um valor decimal:");
        double valor2 = Double.parseDouble(minhaEntrada.nextLine());
 //       double valor2 = minhaEntrada.nextDouble();

        System.out.println("Digite uma frase");
        String frase = minhaEntrada.nextLine();
 //       String frase = minhaEntrada.nextLine();

        System.out.println("O valor inteiro é:" + valor1);
        System.out.println("O valor decimal é:" + valor2);
        System.out.println("A frase é:" + frase);

        minhaEntrada.close();

    }
} 