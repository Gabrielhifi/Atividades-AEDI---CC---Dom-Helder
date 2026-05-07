//Gabriel Vieira Reis
import java.util.Scanner;
public class C08EX19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double soma=0, num=0;
        for (int aux = 1; aux <= 100; aux++) {
           num = Math.pow(aux,2) ;
           soma += num;
        }
        System.out.printf("Soma: %.2f",soma);
    }
}