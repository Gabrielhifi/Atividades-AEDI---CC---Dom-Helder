//Gabriel Vieira Reis
import java.util.Scanner;
public class C08EX12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long codigo, vendas;
        double precoUnit, total, A2450 = 1565.00, B2356 = 1890.00, C3900 = 2150.00, D4100 = 2963,
                E6749 = 3750.00, cont1=0,cont2=0,cont3=0,cont4=0;
        System.out.println("Forma feitas quantas vendas: ");
        vendas = input.nextLong();
        for (int i = 1; i <= vendas; i++) {
            System.out.println("Digite o código da venda: ");
            codigo = input.nextLong();
            if (codigo == 1){
                cont1++;

            }
            else if (codigo == 2){
                cont2++;
            }
            else if (codigo == 3){
                cont3++;
            }
            else if (codigo == 4){
                cont4++;
            }

        }
        total = cont1*A2450+cont2*B2356+cont3*D4100+cont4*E6749;
        System.out.println("Total de vendas: " + total);
    }
}