//Gabriel Vieira Reis
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Arrays;
public class C12EX25
{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String frase = "";
        System.out.println("Digite uma frase: ");
        frase = teclado.nextLine();
        String palavras[] = frase.split(" ");
        for (int aux = 0; aux< palavras.length;aux++){
            System.out.println(palavras[aux]);
        }

    }
}