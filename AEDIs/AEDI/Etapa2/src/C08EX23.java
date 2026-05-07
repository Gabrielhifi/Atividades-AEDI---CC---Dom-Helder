//Gabriel Vieira Reis

import java.util.Scanner;
public class C08EX23 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        long palindromo=0, num1,num2,num3,num4,cont=0;
        for (int aux = 1000; aux <= 9999; aux++) {
            num1 = aux % 10;
            num2 = aux %100 / 10;
            num3 = aux / 100 % 10;
            num4 = aux / 1000;
            if (num1 == num4 && num2 == num3){
                palindromo += aux;
                cont++;
            }
        }
        System.out.println(palindromo/cont);
        teclado.close();
    }
}