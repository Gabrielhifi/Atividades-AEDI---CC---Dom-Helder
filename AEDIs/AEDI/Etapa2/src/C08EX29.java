import java.util.Scanner;
//Gabriel vieira reis
public class C08EX29 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        long variavelX, variavelY, exponencia = 1;
        System.out.println("Digite o valor de X: ");
        variavelX = teclado.nextLong();
        System.out.println("Digite o valor de Y: ");
        variavelY = teclado.nextLong();
        for (int aux = 1; aux <= variavelY; aux++) {
            exponencia *=variavelX;
        }

        System.out.println(exponencia);
        teclado.close();
    }
}