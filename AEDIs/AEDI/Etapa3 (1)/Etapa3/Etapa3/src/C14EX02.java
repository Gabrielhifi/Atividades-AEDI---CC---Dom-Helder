//Gabriel Vieira Reis
import java.util.*;
public class C14EX02 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        String figura = "";
        double result =0.0;
        System.out.println("1-quadrado, 2-retângulo, 3-triângulo retângulo, 4-círculo");
        System.out.println("Digite o respectivo número da figura que deseja calcular a área: ");
        figura = teclado.nextLine();
        result = area(figura);
        System.out.println("A área é: "+result);
    }
    public static double area(String forma){
        Scanner teclado = new Scanner(System.in);
        double area = 0.0;
        if (forma.equalsIgnoreCase("1")||forma.equalsIgnoreCase("2")){
            System.out.println("Digite o valor do lado da figura: ");
            double lado1 = teclado.nextDouble();
            area = Math.pow(lado1,2);
        } else if (forma.equalsIgnoreCase("3")) {
            System.out.println("Digite o valor da base: ");
            double base = teclado.nextDouble();
            System.out.println("Digite a altura do triangulo");
            double atura = teclado.nextDouble();
            area = (base* atura) / 2.0;
        } else if (forma.equalsIgnoreCase("4")) {
            System.out.println("Digite o valor do raio: ");
            double raio = teclado.nextDouble();
            area = Math.pow(raio,2)*Math.PI;
        }else {
            System.out.println("Você digitou errado!!!");
            area = 0;
        }
        return area;
    }
}
