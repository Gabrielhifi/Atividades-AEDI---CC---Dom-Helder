//Gabriel Vieira Reis
public class C09EX10c {
    public static void main(String[] args) {
        double num, den, serie=0;
        for (int aux=1; aux<=100; aux++) {
            num = (aux*2)-1;
            den =aux*2;
            serie += num / den;
        }
        serie = 1.0/3.0*Math.pow(serie,2);
        System.out.print("Valor da Série = "+serie);

    }
}
