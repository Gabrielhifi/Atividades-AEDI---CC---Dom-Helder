//Gabriel Vieira Reis
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Arrays;
public class C12EX20
{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeros[] =  new int[10];
        double mult = 0, cont = 0;
        for (int aux = 0; aux < numeros.length; aux++){
            System.out.printf("Digite um número: ");
            numeros[aux] = teclado.nextInt();
        }
        for (int aux = 0; aux < numeros.length; aux++){
            if (numeros[aux]>numeros[9]){
                System.out.println(numeros[aux]);
                mult += numeros[aux];
                cont++;
            }
        }
        mult = mult/cont;
        System.out.println("Média: "+mult);
        teclado.close();
    }
}