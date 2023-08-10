import javax.swing.JOptionPane;

public class EntradaPainel {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Vamos começar");
        int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número de 0 a 10"));
        String mensagem = String.format( "O valor digitado foi: %d",valor);
        JOptionPane.showMessageDialog(null, mensagem);

        
}
}