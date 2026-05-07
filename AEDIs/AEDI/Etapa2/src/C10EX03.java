//Gabriel Vieira Reis
import java.util.Scanner;
public class C10EX03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double sigla, raio, area;
        System.out.println("Digite o angulo do setoor: ");
        sigla = teclado.nextDouble();
        do {
            System.out.println("Digite o raio: ");
            raio = teclado.nextDouble();
            if (raio == -1) break;
            area  = sigla*3.1416*Math.pow(raio,2)/360;
            System.out.println("R = "+ raio + "-> S=  "+area);
        }while (raio != -1);
    }
}
