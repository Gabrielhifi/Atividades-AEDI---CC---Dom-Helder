//Gabriel Vieira Reis
public class C09EX10b {
    public static void main(String[] args) {
        double num, den, serie=0;
        for (int aux=1; aux<=100; aux++) {
            num = aux*2;
            den =aux*3;
            serie += num / den;
        }
        serie = 1+ Math.sqrt(serie);
        System.out.print("Valor da Série = "+serie);

    }
}