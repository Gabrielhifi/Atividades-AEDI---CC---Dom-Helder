//Gabriel Vieira Reis
import java.util.Scanner;

public class C12EX08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num[] = new int[20];
        int soma = 0;
        for (int i = 0; i < num.length; i++) {
            System.out.println("Ingrese un numero: ");
            num[i] = teclado.nextInt();
        }
        for (int i = 0; i < num.length; i++) {
            soma = num[i] + num[i+10];
            System.out.println(soma);
            if (i == 9){
                break;
            }
        }
        teclado.close();
    }
}
