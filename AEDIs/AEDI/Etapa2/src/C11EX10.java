//Gabriel Vieira Reis
import java.util.Scanner;

public class C11EX10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Número = ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("DH ");
            }
            System.out.println(); // Pula linha
        }
    }
}