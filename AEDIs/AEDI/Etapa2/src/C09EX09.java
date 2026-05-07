//Gabriel Vieira Reis
import java.util.Scanner;
public class C09EX09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double num, den, serie=0,nume=9;
        long termonaSerie;
        System.out.println("Quantos termos na serie: ");
        termonaSerie = teclado.nextLong();
        for (int aux=1; aux<=termonaSerie; aux++) {
            num = nume;
            den = (aux+9)*Math.sqrt(Math.pow(aux,4));
            serie += num / den;
            nume *=3;
        }
        serie = 100-Math.pow(serie,3);
        System.out.print("Valor da Série = "+serie);
    }
}
