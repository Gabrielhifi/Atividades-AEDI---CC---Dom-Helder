//Gabriel Vieira Reis
public class C09EX07 {
    public static void main(String[] args) {
        double num, den, serie=0,deno = 7,nume =0;
        for (int aux=1; aux<=6; aux++) {
            num = nume + (aux * 3);
            den = deno;
            serie += num / den;
            deno += 6;
            nume += 2;
        }
        System.out.print("Valor da Série = "+serie);
    }
}
