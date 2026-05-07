//Gabriel Vieira Reis
public class C09EX11e {
    public static void main(String[] args) {
        double num, den, serie=0;
        for (int aux=1; aux<=100; aux++) {
            num = (aux*aux)*Math.sqrt(aux*2+3);
            den = Math.pow(aux+1,aux);
            serie += num / den;
        }
        serie = 2.0/3.0*(serie);
        System.out.print("Valor da Série = "+serie);

    }
}
