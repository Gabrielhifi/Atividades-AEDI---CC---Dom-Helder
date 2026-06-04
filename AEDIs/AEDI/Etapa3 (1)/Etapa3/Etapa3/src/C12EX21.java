//Gabriel Vieira Reis
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Arrays;
public class C12EX21
{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeros[] =  new int[20];
        double mult = 0, cont = 0;
        for (int aux = 0; aux < numeros.length; aux++){
            System.out.printf("Digite um número: ");
            numeros[aux] = teclado.nextInt();
        }
        for (int aux = 0; aux < numeros.length;aux++){
            if (aux %2 ==0){
                System.out.println(numeros[aux]+" ");
            }
        }
        for (int aux = 0; aux < numeros.length;aux++){
            if (aux %2 !=0){
                System.out.println(numeros[aux]+" ");
            }
        }
        teclado.close();
    }
}