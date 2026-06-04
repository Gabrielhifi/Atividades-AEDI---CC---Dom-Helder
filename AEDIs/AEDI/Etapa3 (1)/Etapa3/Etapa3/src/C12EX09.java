//Gabriel Vieira Reis
import java.util.Scanner;

public class C12EX09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] num = new int[10];
        int soma = 0;

        for (int i = 0; i < num.length; i++) {
            System.out.print("Digite um numero: ");
            num[i] = teclado.nextInt();
            soma += num[i];
        }

        System.out.println("Soma: " + soma);
        System.out.println("Números divisíveis pela soma:");

        for (int i = 0; i < num.length; i++) {
            // O operador % pega o resto da divisão.
            // Se o resto for 0, é divisível.
            if (soma != 0 && soma % num[i] == 0) {
                System.out.println(num[i]);
            }
        }
        teclado.close();
    }
}