//Gabriel Vieira Reis
import java.util.Scanner;

public class C12EX02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] VET = new int[10];

        for(int aux = 0; aux < VET.length; ++aux) {
            System.out.println("Digite um valor: ");
            VET[aux] = input.nextInt();
        }

        for(int aux = 0; aux < VET.length; ++aux) {
            if (VET[aux] > 5 && VET[aux] < 10) {
                System.out.println(VET[aux]);
            }
        }

        input.close();
    }
}