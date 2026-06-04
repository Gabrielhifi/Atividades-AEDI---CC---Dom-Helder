//Gabriel Vieira Reis
import java.util.Scanner;
public class C13EX01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double resultado = 0, cordX1 = 0, cordY1 = 0,cordX2 = 0, cordY2 = 0;
        System.out.println("Digite a coordenada x1: ");
        cordX1 = teclado.nextDouble();
        System.out.println("Digite a coordenada y1: ");
        cordY1 = teclado.nextDouble();
        System.out.println("Digite a coordenada x2: ");
        cordX2 = teclado.nextDouble();
        System.out.println("Digite a coordenada y2: ");
        cordY2 = teclado.nextDouble();
        resultado = coordDistance(cordX1, cordY1, cordX2, cordY2);
        System.out.println("Distância: " + resultado);
        teclado.close();
    }

    static double coordDistance (double x1, double y1, double x2, double y2) {
        double distancia = Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
        return distancia;
    }
}
