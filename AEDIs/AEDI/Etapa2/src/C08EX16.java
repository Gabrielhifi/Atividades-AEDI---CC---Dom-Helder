//Gabriel Vieira Reis

import java.util.Scanner;
public class C08EX16 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        long cont = 0, total=0;
        double media;
        for (int aux = 1000; aux <=2000; aux++){
            if (aux % 2 == 1){
                cont ++;
                total += aux;
            }
        }
        media =  total/cont;
        System.out.println("A média é: " + media);
    }
}
