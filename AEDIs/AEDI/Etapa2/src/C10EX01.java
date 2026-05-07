//Gabriel Vieira Reis
import java.util.Scanner;
public class C10EX01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double multa, valor, media=0,cont=0;
        System.out.println("PAra parar o programa digite -1");
        do {
            System.out.println("Digite o valor: ");
            valor = teclado.nextDouble();
            if (valor == -1)break;
            cont++;
            multa = valor *(10.0/100.0);
            media += multa;
            System.out.println("Valor da multa:"+multa);
        }while (true);
        media = media/cont;
        System.out.printf("\nValor da media:%.2f",media);
    }
}