//Gabriel Vieira Reis
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Arrays;
public class C12EX19
{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int crescente[] = new int[10];
        int descresente[] = new int[crescente.length];
        int cont = 0;
        for (int aux = 0; aux < crescente.length;aux++){
            System.out.println("Digite o valor: ");
            crescente[aux] = teclado.nextInt();
        }
        for (int aux = crescente.length-1; aux >=0; aux--){
            descresente[aux] = crescente[cont];
            cont++;
        }
        for (int aux = 0; aux < crescente.length;aux++){
        System.out.println(descresente[aux]);}
        teclado.close();
    }
}