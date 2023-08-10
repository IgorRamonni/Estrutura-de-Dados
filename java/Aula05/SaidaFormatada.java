import java.util.Locale;
import java.text.NumberFormat;

public class SaidaFormatada {
    public static void main(String[] args) {
        Locale LocalBR = new Locale("pt","Br");
        int valorInteiro = 8299812;
        double valorReal = 291923.2929;
        float valorPercentual = 0.11f;
        NumberFormat dinheiro = NumberFormat.getCurrencyInstance(LocalBR);
        NumberFormat inteiro = NumberFormat.getInstance(LocalBR);
        NumberFormat percentual = NumberFormat.getPercentInstance(LocalBR);
        NumberFormat numberFormat = NumberFormat.getNumberInstance(LocalBR);

        System.out.println("Valor Atual:" +valorReal);
        System.out.println("Valor formatado em moeda:" +dinheiro );
    }
}
