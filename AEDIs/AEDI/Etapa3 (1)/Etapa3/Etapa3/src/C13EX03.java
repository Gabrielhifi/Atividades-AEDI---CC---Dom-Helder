//Gabriel Vieira Reis
import java.util.Scanner;
public class C13EX03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long posicao = 0;
        String numero = "";
        System.out.println("Digite um numero: ");
        numero = input.nextLine();
        String numer[] = numero.split("");
        System.out.println("Digite a posição que quer verificar: ");
        posicao =  input.nextLong();
        System.out.println("Número: "+ posicaoX(numer, posicao));
    }
    static String posicaoX(String num[], long posic) {
        String valor = "";
        for (int aux = num.length; aux >= 0; aux--) {
            if (aux == posic) {
                valor = num[aux];
            }
        }
        return valor;
    }
}
