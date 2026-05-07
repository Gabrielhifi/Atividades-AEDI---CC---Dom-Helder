//Gabriel Vieira  Reis

import java.util.Scanner;

public class C10EX06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double A,B,C, x,y,R, distancia ;
        System.out.println("Digite o valor de A: ");
        A = teclado.nextDouble();
        System.out.println("Digite o valor de B: ");
        B = teclado.nextDouble();
        System.out.println("Digite o valor de C: ");
        C = teclado.nextDouble();
        do {
            System.out.println("Digite o valor de X°: ");
            x = teclado.nextDouble();
            System.out.println("Digite o valor de Y°: ");
            y = teclado.nextDouble();
            R = A*x+B*y+C;
            distancia = R/Math.sqrt((A*A)+(B*B));
            System.out.println("X= "+x+" Y= "+y+"--> D="+distancia);
        }while (distancia !=0);

    }
}
