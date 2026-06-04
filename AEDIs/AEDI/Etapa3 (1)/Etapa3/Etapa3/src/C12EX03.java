//Gabriel Vieira Reis
import java.util.Scanner;

public class C12EX03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] VET = new int[10];

        for(int aux = 0; aux < VET.length; ++aux) {
            System.out.println("Digite um valor: ");
            VET[aux] = teclado.nextInt();
        }

        for(int aux = 0; aux < VET.length; ++aux) {
            VET[aux] *= VET[aux];
            System.out.println(VET[aux]);
        }

        teclado.close();
    }
}