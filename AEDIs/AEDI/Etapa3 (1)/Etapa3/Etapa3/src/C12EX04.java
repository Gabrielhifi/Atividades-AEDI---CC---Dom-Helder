//Gabriel Vieira Reis
import java.util.Scanner;
public class C12EX04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] VET = new int[20];
        for(int aux = 0; aux < VET.length; ++aux) {
            System.out.println("Digite o corredor que chegou na " + (aux + 1) + "° posição: ");
            VET[aux] = teclado.nextInt();
        }
        System.out.println("A ordem de largada será:");
        for(int aux = 0; aux < VET.length; ++aux) {
            System.out.println(aux + 1 + "°: " + VET[aux] + "/" + VET[aux + 10]);
            if (aux == 9) {
                break;
            }
        }
        teclado.close();
    }
}