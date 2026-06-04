//Gabriel Vieira Reis
import java.util.Scanner;
import javax.swing.JOptionPane;
public class C12EX14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String bilhete[] = new String[10];
        String pesquisa="";
        for (int i = 0; i < bilhete.length; i++) {
            bilhete[i] = JOptionPane.showInputDialog(null,"Digite o número do bilhete: ");
        }
        pesquisa = JOptionPane.showInputDialog(null,"Digite o bilhete premiado: ");
        int pos = -1;
        for (int i = 0; i < bilhete.length; i++) {
            if (bilhete[i].equalsIgnoreCase(pesquisa)) {
                pos = i;
            }
        }
        if (pos == -1) {
            System.out.println("Não foi desta vez");
        }else System.out.println("Parabéns, você acertou todos os números!!");

    }
}