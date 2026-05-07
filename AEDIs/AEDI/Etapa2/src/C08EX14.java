import java.util.Scanner;
//Gabriel Vieira Reis
public class C08EX14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String caractere;
        long num;
        System.out.println("Digite um número: ");
        num = teclado.nextLong();
        teclado.nextLine();
        System.out.println("Escreva um caractere especcial: ");
        caractere = teclado.nextLine();

        for (int aux = 1; aux<= num;aux++){
            for (int i =1; i <=num; i++){
                System.out.print(caractere  + " ");
            }
            System.out.println();
        }

    }
}