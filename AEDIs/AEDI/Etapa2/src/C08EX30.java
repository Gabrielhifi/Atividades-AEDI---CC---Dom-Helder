import java.util.Scanner;
//Gabriel vieira reis
public class C08EX30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long  n;
        double x, serie=0;
        System.out.println("Digite a variavel X: ");
        x = input.nextDouble();
        System.out.println("Digite a variavel N: ");
        n = input.nextLong();
        for (int i = 2; i <= n; i++) {
            serie += Math.log(x) + x + (Math.pow(x, i)/i);

        }
        System.out.println(serie);

    }
}
