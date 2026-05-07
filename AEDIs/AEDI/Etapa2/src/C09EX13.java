//Gabriel Vieira Reis
public class C09EX13 {
    public static void main(String[] args) {
        double num=1, den,  serie=0;
        for (int aux=1; aux<=10; aux++) {
            num *= aux;
            den = Math.pow(2,aux)-1;
            //Caso aux for par ele subtrai, senão soma
            if (aux % 2 == 0)
                serie -= num / den;
            else
                serie += num/den;
            //variavel para calcular os denominadores

        }
        serie = serie;
        System.out.print("Valor da Série = "+serie);
    }
}
