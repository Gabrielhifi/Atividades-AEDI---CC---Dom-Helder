import java.util.Scanner;

//Gabriel Vieira Reis
public class C09EX03{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        long numeroserie, valor =4;
        double num, den, serie=0;
        System.out.println("Qual o valor de repetições: ");
        numeroserie = teclado.nextLong();
        for (int aux=1; aux<=numeroserie; aux++) {

            num = 1+ Math.sqrt(valor);
            den = aux *3;
            serie += num / den;
            valor += 4;
        }
        System.out.print("Valor da Série = "+serie);
    }
}