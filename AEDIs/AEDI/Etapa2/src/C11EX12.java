//Gabriel Vieira Reis
import java.util.Scanner;

public class C11EX12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Número = ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            // Parte que sobe: 1, 2, 3...
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Parte que desce: ...2, 1
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}