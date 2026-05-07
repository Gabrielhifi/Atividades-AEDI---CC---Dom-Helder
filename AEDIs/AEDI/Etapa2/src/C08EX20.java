//Gabriel Vieira Reis

import java.util.Scanner;
public class C08EX20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n, soma=0, num=0.5;
        System.out.println("Quantos termos você quer somar: ");
        n = input.nextLong();
        for (long i = 1; i <= n; i++) {
            num *=2 ;
            soma += num;

        }
        System.out.println(soma);
        input.close();
    }
}