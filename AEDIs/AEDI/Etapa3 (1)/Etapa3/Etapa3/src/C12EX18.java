//Gabriel Vieira Reis
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Arrays;
public class C12EX18
{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeros[] =  new int[10];
        double mult = 0;
        for (int aux = 0; aux < numeros.length; aux++){
            System.out.printf("Digite um número: ");
            numeros[aux] = teclado.nextInt();
        }
        System.out.println("Type a number: ");
        mult = teclado.nextDouble();
        for (int aux = 0; aux < numeros.length; aux++){
            System.out.println(numeros[aux]*mult);
        }
        teclado.close();
    }
}