//Gabriel Vieira Reis
import java.util.Scanner;
public class C13EX02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double valorX = 0, resultado = 0;
        System.out.println("Digite -1 quando quiser parar.");
        while (true) {
            System.out.println("Digite o valor da coordenada X: ");
            valorX = teclado.nextDouble();
            resultado = C13EX02Metodo.funcaoX(valorX);
            System.out.println("Coordenada X: " + resultado);
        }
    }
}
