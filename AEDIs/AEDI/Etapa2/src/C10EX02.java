//Gabriel Vieira Reis
import java.util.Scanner;
public class C10EX02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double valorReceber, total=0, quntCont=0,media, acima1000=0;
        System.out.println("Digite 0 para parar o código ");
        do {
            System.out.println("Digite o valor recebido: ");
            valorReceber = teclado.nextDouble();
            if (valorReceber==0)break;
            quntCont++;
            total +=valorReceber;
            if (valorReceber>1000) acima1000++;
        }while (true);
        media = total / quntCont;
        System.out.println("Valor total recebido: "+total);
        System.out.println("Media dos valores: "+media);
        System.out.println("Valores acima de 1000: "+acima1000);
    }
}
