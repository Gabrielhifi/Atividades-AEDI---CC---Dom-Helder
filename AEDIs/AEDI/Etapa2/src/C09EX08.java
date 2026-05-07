//Gabriel Vieira Reis
public class C09EX08 {
    public static void main(String[] args) {
        double num, den, serie=0,nume=3,numer=5;
        for (int aux=1; aux<=20; aux++) {
            num = nume * Math.sqrt(numer);
            den = Math.pow(5,aux);
            serie += num / den;
            nume +=2;
            numer+=4;
        }
        serie = Math.pow(serie,2);
        System.out.print("Valor da Série = "+serie);
    }
}
