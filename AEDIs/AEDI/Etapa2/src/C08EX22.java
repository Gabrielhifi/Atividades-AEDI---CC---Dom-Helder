//Gabriel Vieira Reis

import java.util.Scanner;
public class C08EX22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long primo, cont=0;
        System.out.printf("Digite um número para ver se ele é primo diferente de 0: ");
        primo = input.nextLong();
        if (primo <= 0){
            System.out.println("Valor incorreto!");
            input.close();
        }
        else {
        for (long i = 1; i <= primo; i++){
           if (primo % i == 0){
               cont++;
           }
        }}
        if (cont == 2) System.out.println("Número primo");
        else System.out.println("Número não é primo");
    }
}