//Gabriel Vieira Reis
public class C09EX11b {
    public static void main(String[] args) {
        double num, den, serie=0;
        for (int aux=1; aux<=100; aux++) {
            num = aux*3-2;
            den = Math.sqrt(aux*3+4);
            serie += num / den;
        }
        serie = 5.0/3.0*(serie);
        System.out.print("Valor da Série = "+serie);

    }
}
