//Gabriel Vieira Reis
import java.util.Scanner;

public class C11EX13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Quantos termos? ");
        int n = input.nextInt();

        double somaDentro = 0;
        int termo = 1;

        // Variáveis para controlar os padrões
        double baseNum = 10;
        double expNum = 2;
        double den = 1;

        while (termo <= n) {
            double parte1 = termo;
            double parte2 = Math.pow(baseNum, expNum);

            somaDentro += (parte1 * parte2) / den;

            // Atualiza para o próximo termo
            baseNum += 9;
            expNum += 2;
            den *= 7;
            termo++;
        }

        double s = 71 + Math.pow(somaDentro, 1.0/3.0); // Raiz cúbica
        System.out.println("Valor da Série = " + s);
    }
}