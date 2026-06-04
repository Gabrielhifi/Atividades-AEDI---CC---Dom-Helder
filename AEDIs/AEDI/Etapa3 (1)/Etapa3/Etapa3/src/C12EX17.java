//Gabriel Vieira Reis
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Arrays;
public class C12EX17
{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeros[] =  new int[10];
        double media = 0, cont=0;
        for (int aux = 0; aux < numeros.length; aux++){
            System.out.printf("Digite um número: ");
            numeros[aux] = teclado.nextInt();
        }
        for (int aux = 0; aux < numeros.length; aux++){
            if (numeros[aux] %2==0){
                System.out.println(numeros[aux]);
                media += numeros[aux];
                cont++;
            }
        }
        media = media/cont;
        System.out.println("Media: "+media);
        teclado.close();
    }
}