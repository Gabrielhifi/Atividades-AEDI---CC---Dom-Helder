//Gabriel Vieira Reis
import java.util.Scanner;
public class C13EX05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double angulo, seno, cosseno, tangente;
        System.out.println("Digite um angulo: ");
        angulo = teclado.nextDouble();
        angulo = Math.toRadians(angulo);
        seno = Math.sin(angulo);
        cosseno = Math.cos(angulo);
        tangente = Math.tan(angulo);
        System.out.println("Seno: " + seno);
        System.out.println(("Arco seno: " + 1/seno));
        System.out.println("Cosseno: " + cosseno);
        System.out.println("Arco cosseno: "+ 1/cosseno);
        System.out.println("Tangente: " + tangente);
        System.out.println("Arco tangente: " + 1/tangente);
    }
}
