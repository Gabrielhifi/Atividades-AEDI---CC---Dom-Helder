//Gabriel Vieira  Reis
import java.util.Scanner;
public class C10Ex07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        long popul, anos, dias, meses, calc=0;
        double pessoasConta=1;
        System.out.println("Digite a população do local: ");
        popul = teclado.nextLong();
        do {
            pessoasConta += (pessoasConta*0.003);
            calc++;
        }while (pessoasConta<popul);
        anos = calc/365;
        meses = (calc%365)/30;
        dias = (calc%365)%30;
        System.out.println("------CONTAMINAÇÂO------");
        System.out.println("População: "+popul+ "---> Anos = "+anos+" Meses = "+meses+" Dias = "+dias);

    }
}
