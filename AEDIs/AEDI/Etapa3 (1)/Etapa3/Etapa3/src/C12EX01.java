// Gabriel Vieira Reis
import java.util.Scanner;

public class C12EX01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valroesDiv = 0;

        for(int aux = 1; aux <= 10; ++aux) {
            System.out.println("Digite um valor: ");
            int num = input.nextInt();
            if (num % 5 == 0 && num % 7 == 0) {
                ++valroesDiv;
            }
        }

        System.out.println("Divisores por 5 e 7 ao mesmo tempo: " + valroesDiv);
    }
}
