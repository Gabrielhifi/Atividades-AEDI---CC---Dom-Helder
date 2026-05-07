//Gabriel Vieira Reis
public class C11EX14 {
    public static void main(String[] args) {
        double pi = 0;
        double num = 1;
        double den;
        long termos = 1;

        while (true) {
            den = 2 * termos - 1;
            if (termos % 2 == 0) {
                pi -= 4 * (num / den);
            } else {
                pi += 4 * (num / den);
            }

            if (pi > 3.1416 && pi < 3.1417) {
                System.out.println("Valor de PI obtido: " + pi);
                System.out.println("Termos necessários: " + termos);
                break;
            }

            termos++;
        }
    }
}