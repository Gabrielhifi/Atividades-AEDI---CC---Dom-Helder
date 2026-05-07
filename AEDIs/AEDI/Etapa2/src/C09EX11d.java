//Gabriel Vieira Reis
public class C09EX11d {
    public static void main(String[] args) {
        double num, den, serie=0;
        for (int aux=1; aux<=100; aux++) {
            num = Math.pow(aux,3);
            den = Math.pow(10,aux-1);
            serie += num / den;
        }
        serie = serie;
        System.out.print("Valor da Série = "+serie);

    }
}
