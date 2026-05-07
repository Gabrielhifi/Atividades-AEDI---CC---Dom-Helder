//Gabriel Vieira Reis

import java.util.Scanner;

public class C08EX24 {
    public static void main(String[] args) {
        Scanner teclado =  new Scanner(System.in);
        double serie  = 0;
        for (int aux = 1; aux <= 99; aux+=2){
            serie += (1.0/3.0)*Math.pow(2.0, aux);
        }
        System.out.println(serie);
        teclado.close();
    }
}
