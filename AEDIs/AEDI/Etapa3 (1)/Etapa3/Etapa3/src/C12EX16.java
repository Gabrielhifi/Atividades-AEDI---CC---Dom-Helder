//Gabriel Vieira Reis
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Arrays;
public class C12EX16
{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cidade[] = new String[5];
        long populscao[] = new long[cidade.length];
        String estado[] = new String[cidade.length];
        long temp =0;
        String temCity = "", temEstad = "";

        for (int i=0; i<cidade.length; i++){
            cidade[i] = JOptionPane.showInputDialog(null,"Digite o nome do cidade: ");
            populscao[i] = Integer.parseInt(
                    JOptionPane.showInputDialog(null, "Digite a população: ")
            );
            estado[i] = JOptionPane.showInputDialog(null,"Digite o nome do estado: ");
        }
        for (int aux=0; aux<populscao.length-1; aux++){
            for (int x=0; x<populscao.length-1; x++){
                if (populscao[x] < populscao[x+1]) {
                    temp = populscao[x+1];
                    populscao[x+1] = populscao[x];
                    populscao[x] = temp;
                    temCity =  cidade[x+1];
                    cidade[x+1] = cidade[x];
                    cidade[x] = temCity;
                    temEstad = estado[x+1];
                    estado[x+1] = estado[x];
                    estado[x] = temEstad;
                }
            }
        }
        for (int x=0; x<5; x++){
            System.out.println(x+1+"° "+ cidade[x] +" "+ estado[x]);
        }
    }
}
