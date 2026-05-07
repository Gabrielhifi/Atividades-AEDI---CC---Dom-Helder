//Gabriel Vieira Reis
import java.util.Scanner;

public class C08EX01 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        double raios, area;
        for (int repeticao = 1; repeticao<=10; repeticao++){
            System.out.println("Digite o raio: ");
            raios = teclado.nextDouble();
            if (raios <= 0){
                break;
            }
            area = 3.1416 * Math.pow(raios,2);
            System.out.println("O raio é: "+ area);

        }
        teclado.close();
    }
}
