//Gabriel Vieira  Reis
import java.util.Scanner;
public class C11EX01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long numDigitado, cont=0;
        double funcao, media=0;
        System.out.println("Digite o valor da sequência: ");
        numDigitado = input.nextLong();
        for (long i = 1; i <= numDigitado; i++) {

            if (i % 2 != 0) {
                funcao = Math.pow(i, 2)+ (4*i-2)/5.0;
                System.out.println("f(X): "+funcao);
                media += funcao;
                cont++;
            }
            continue;
        }
        media = media/cont;
        System.out.println("media: "+media);
        input.close();
    }
}