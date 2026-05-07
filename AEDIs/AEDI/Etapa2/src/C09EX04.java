import java.util.Scanner;

//Gabriel Vieira Reis
public class C09EX04{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        long numeroserie, contadornumerador = 1, contadordenominador = 1;
        double num, den, serie=0;
        System.out.println("Qual o valor de repetições: ");
        numeroserie = teclado.nextLong();
        for (int aux=1; aux<=numeroserie; aux++) {
            num = (contadornumerador)*(contadornumerador+1);
            den = (contadordenominador+2)*(contadordenominador+3);
            serie +=(num / den);
            contadornumerador = contadornumerador + 4;
            contadordenominador = contadordenominador + 4;
        }
        System.out.print("Valor da Série = "+Math.sqrt(serie));
    }
}