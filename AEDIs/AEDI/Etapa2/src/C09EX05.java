import java.util.Scanner;

//Gabriel Vieira Reis
public class C09EX05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        long numeroserie;
        double num, den, serie=0, deno=7,nume =0;
        System.out.println("Qual o tamanho da série: ");
        numeroserie =  teclado.nextLong();
        for (int aux=1; aux<=numeroserie; aux++) {
            num = (nume)+(aux*3);
            den = deno;
            serie += num / den;
            deno+=6;
            nume+=2;
        }
        serie = 5*(serie);
        System.out.print("Valor da Série = "+serie);
    }
}
